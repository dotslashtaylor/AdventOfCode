package adventofcode2020.four;

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class PassportProcessing {

	public static String[] getData(String relativePath){
		String[] allPassports = new String[1];
		try {
			File dataFile = new File(relativePath);
			Scanner scan = new Scanner(dataFile);
			String passport = "";
			ArrayList<String> passportList = new ArrayList<>();
			while (scan.hasNextLine()) {
				String nextline = scan.nextLine();
				if (nextline.equals("")) {
					passportList.add(passport);
					passport = "";
				}
				else {
					passport = passport + " " + nextline;
				}
			}
			passportList.add(passport);
			allPassports = new String[passportList.size()];
			for (int i = 0; i < allPassports.length; i++) {
				allPassports[i] = passportList.get(i);
			}
		}
		catch (Exception exception) {
			System.err.println(exception);
			System.exit(1);
		}
		System.out.println(allPassports.length);
		return allPassports;
	}

	public static int partOne(String[] passports) {
		int validPassports = 0;
		for (String passport : passports) {
			if (isValidPartOne(passport)) {
				validPassports += 1;
			}
		}
		return validPassports;
	}

	public static boolean isValidPartOne(String passport) {
		boolean valid = false;
		String[] requiredFields = new String[]{
			"byr", "iyr", "eyr", "hgt", 
			"hcl", "ecl", "pid"
		};
		int fieldCountForPassport = 0;
		for (String field : requiredFields) {
			if (passport.contains(field)) {
				fieldCountForPassport += 1;
			}
		}
		if (fieldCountForPassport >= 7) {
			valid = true;
		}
		return valid;
	}

	public static int partTwo(String[] passports) {
		int validPassports = 0;
		for (String passport : passports) {
			if (!isValidPartOne(passport)) {
				continue;
			}
			String[] passportFields = passport.split(" ");
			int validFields = 0;
			for (String field : passportFields) {
				if (isValidPartTwo(field)) {
					validFields += 1;
				}
			}
			if (validFields >= 7) {
				validPassports += 1;
			}
		}
		return validPassports;
	}

	public static boolean isValidPartTwo(String fieldData) {
		boolean valid = false;
		String[] fieldParts = fieldData.split(":");
		if (fieldParts[0].contains("byr")) {
			int birthYear = Integer.parseInt(fieldParts[1]);
			if (birthYear >= 1920 && birthYear <= 2002) {
				valid = true;
			}

		}
		else if (fieldParts[0].contains("iyr")) {
			int year = Integer.parseInt(fieldParts[1]);
			if (year >= 2010 && year <= 2020) {
				valid = true;
			}
		}
		else if (fieldParts[0].contains("hgt")) {
			String heightStr = fieldParts[1];
			String heightNumberStr = heightStr.substring(0, heightStr.length() - 2);
			String heightUnit = heightStr.substring(heightStr.length() - 2);
			try {
				int height = Integer.parseInt(heightNumberStr);
				if (heightUnit.contains("cm")) {
					if (height >= 150 && height <= 193) {
						valid = true;
					}
				}
				if (heightUnit.contains("in")) {
					if (height >= 59 && height <= 76) {
						valid = true;
					}
				}
			}
			catch (Exception exception) {

			}
		}
		else if (fieldParts[0].contains("hcl")) {
			String haircolor = fieldParts[1];
			String validCharacters = "0123456789abcdef";
			int charCounter = 0;
			if (haircolor.charAt(0) == '#' && haircolor.length() == 7) {
				for (int i = 1; i < 7; i++) {
					String currentCharacter = haircolor.substring(i, i + 1);
					if (validCharacters.contains(currentCharacter)) {
						charCounter += 1;
					}
				}
				if (charCounter == 6) {
					valid = true;
				}

			}
		}
		else if (fieldParts[0].contains("ecl")) {
			String eyeColor = fieldParts[1];
			String[] validColors = new String[]{"amb", "blu", "brn", "gry", "grn", "hzl", "oth"};
			for (String color : validColors) {
				if (color.equals(eyeColor)) {
					valid = true;
					break;
				}
			}
		}
		else if (fieldParts[0].contains("pid")) {
			if (fieldParts[1].length() == 9) {
				valid = true;
			}
		}
		else if (fieldParts[0].contains("eyr")) {
			int year = Integer.parseInt(fieldParts[1]);
			if (year >= 2020 && year <= 2030) {
				valid = true;
			}
		}
		return valid;
	}

}
