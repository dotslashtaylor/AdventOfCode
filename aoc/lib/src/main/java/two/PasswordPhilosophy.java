package adventofcode2020.two;

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class PasswordPhilosophy {

	public static ArrayList getData(String relativePath){
		ArrayList<Row> allPasswords = new ArrayList<>();
		try {
			File dataFile = new File(relativePath);
			Scanner scan = new Scanner(dataFile);

			while (scan.hasNextLine()) {
				int[] rowRange = new int[2];
				char rowLetter;
				String newPassword;	
				String newRow = scan.nextLine();
				String[] parts = newRow.split("-|\\s|\\: ");
				rowRange[0] = Integer.parseInt(parts[0]);
				rowRange[1] = Integer.parseInt(parts[1]);
				rowLetter = parts[2].charAt(0);
				newPassword = parts[3];
				allPasswords.add(new Row(rowRange, rowLetter, newPassword));
			}		
		}
		catch(Exception exception) {
			System.err.println(exception);
			System.exit(1);
		}
		return allPasswords;
	}

	public static int[][] getRanges(ArrayList<Row> rowList) {
		int[][] ranges = new int[rowList.size()][2];
		for (int i = 0; i < rowList.size(); i++) {
			Row row = rowList.get(i);
			ranges[i] = row.passwordRange;
		}
		return ranges;
	}

	public static char[] getLetters(ArrayList<Row> rowList) {
		char[] letters = new char[rowList.size()];
		for (int i = 0; i < rowList.size(); i++) {
			Row row = rowList.get(i);
			letters[i] = row.letter;
		}
		return letters;
	}

	public static String[] getPasswords(ArrayList<Row> rowList) {
		String[] passwordList = new String[rowList.size()];
		for (int i = 0; i < rowList.size(); i++) {
			Row row = rowList.get(i);
			passwordList[i] = row.password;
		}
		return passwordList;
	}
	public static int partOne(int[][] range, char[] letter, String[] passwordsList) {
		int validPasswords = 0;
		for (int i = 0; i < range.length; i++) {
			int letterCount = 0;
			String passwordTested = passwordsList[i];
			int[] passwordRange = range[i];

			for (int j = 0; j < passwordTested.length(); j++) {
				char k = passwordTested.charAt(j);
				if (k == letter[i]) {
					letterCount += 1;
				}
			}
			if (letterCount >= passwordRange[0] && letterCount <= passwordRange[1]) {
				validPasswords += 1;
			}

		}
		return validPasswords;
	
	}


	public static int partTwo(int[][] range, char[] letter, String[] passwordsList) {
		int validPasswords = 0;
		for (int i = 0; i < range.length; i++) {
			int[] passwordrange = range[i];
			char pLetter = letter[i];
			String thePassword = passwordsList[i];
			if (thePassword.charAt(passwordrange[0] - 1) == pLetter ^ thePassword.charAt(passwordrange[1] - 1) == pLetter) {
				validPasswords += 1;
			}
		}	
		return validPasswords;
	}

}
