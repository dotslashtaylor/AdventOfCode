package adventofcode2020;

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class PasswordPhilosophy {

	public static ArrayList getData(String relativePath){
		ArrayList<Row> allPasswords = new ArrayList<>();
		try {
			File dataFile = new File(relativePath);
			Scanner scan = new Scanner(dataFile);

			int[] rowRange = new int[2];
			char rowLetter;
			String newPassword;	

			while (scan.hasNextLine()) {
				String newRow = scan.nextLine();
				rowRange[0] = Integer.parseInt(newRow.substring(0, newRow.indexOf("-")));
				rowRange[1] = Integer.parseInt(newRow.substring(newRow.indexOf("-") + 1, newRow.indexOf(" ")));
				newRow = newRow.substring(4, newRow.length());
				rowLetter = newRow.charAt(0);
				newPassword = newRow.substring(4, newRow.length());
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


	public static int partTwo() {
		return 0;	

	}

}

class Row {
	int[] passwordRange;
	char letter;
	String password;

	Row(int[] passwordRange, char letter, String password) {
		this.passwordRange = passwordRange;
		this.letter = letter;
		this.password = password;	
	}
}
