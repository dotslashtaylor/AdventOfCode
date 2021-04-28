package adventofcode2020.four;

import java.util.HashMap;

public class Passport {


	private HashMap<String, String> passportFields = new HashMap<>();

	private final String[] requiredFields = new String[]{
			"byr", "iyr", "eyr", "hgt", "hcl", "ecl", "pid"	
		};
	private final String validCharsHCL = "0123456789abcdef";
	private final String[] validColorsECL = new String[]{
		"amb", "blu", "brn", "gry", "grn", "hzl", "oth"
	};

	public Passport(String dataString) {
		String[] allFields = dataString.split(" ");
		for (String field : allFields) {
			String[] pair = field.split(":");
			if (pair.length == 2) {
				passportFields.put(pair[0], pair[1]);
			}
		}
	}

	public boolean isValidPartOne() {
		boolean valid = false;
		int validFieldCount = 0;
		for (String str : requiredFields) {
			if (passportFields.containsKey(str)) {
				validFieldCount++;
			}
		}
		if (validFieldCount >= requiredFields.length) {
			valid = true;
		}
		return valid;
	}

	public boolean isValidPartTwo() {
		boolean valid = false;
		int validFieldCount = 0;
	
		if (isValidPartOne()) {
			String hairColor = passportFields.get("hcl");
			if (hairColor.charAt(0) == '#' && hairColor.length() == 7) {
				int charCounter = 0;
				for (int i = 1; i < 7; i++) {
					String currentChar = hairColor.substring(i, i + 1);
					if (validCharsHCL.contains(currentChar)) {
						charCounter++;
					}
				}
				if (charCounter == 6) {
					validFieldCount++;
				}
			}
			String eyeColor = passportFields.get("ecl");
			for (String color : validColorsECL) {
				if (color.equals(eyeColor)) {
					validFieldCount++;
					break;
				}
			}
			String id = passportFields.get("pid");
			if (id.length() == 9) {
				validFieldCount++;
			}
		}
		try {
			validFieldCount = validFieldCount + countValidInts();
		}
		catch (NumberFormatException exception) {
			System.err.println(exception);
		}
		if (validFieldCount >= 7) {
			valid = true;
		}

		return valid;
	}

	public int countValidInts() throws NumberFormatException {
		int validFieldCount = 0;
		String byr = passportFields.get("byr");
		if (byr != null) {
			int birthYear = Integer.parseInt(byr);
			if (birthYear >= 1920 && birthYear <= 2002) {
				validFieldCount++;
			}
		}
		String iyr = passportFields.get("iyr");
		if (iyr != null) {
			int issueYear = Integer.parseInt(iyr);
			if (issueYear >= 2010 && issueYear <= 2020) {
				validFieldCount++;
			}
		}
		String eyr = passportFields.get("eyr");
		if (eyr != null) {
			int expYear = Integer.parseInt(eyr);
			if (expYear >= 2020 && expYear <= 2030) {
				validFieldCount++;
			}
		}
		String heightString = passportFields.get("hgt");
		if (heightString != null) {
			if (heightString.contains("cm")) {
				String heightStringCM = heightString.substring(0, heightString.length() - 2);
				int height = Integer.parseInt(heightStringCM);
				if (height >= 150 && height <= 193) {
					validFieldCount++;
				}
			}
			else if (heightString.contains("in")) {
				String heightStringIN = heightString.substring(0, heightString.length() - 2);
				int height = Integer.parseInt(heightStringIN);
				if (height >= 59 && height <= 76) {
					validFieldCount++;
				}
			}
		}
		return validFieldCount;
	}
}
