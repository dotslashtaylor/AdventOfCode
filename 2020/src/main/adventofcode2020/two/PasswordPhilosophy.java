package adventofcode2020.two;

import adventofcode2020.Solution;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class PasswordPhilosophy extends Solution<Integer, Row> {

	public PasswordPhilosophy() {
		inputRelPath = "./resources/inputs/day2.txt";
		identifier = "Day Two: PasswordPhilosophy";
	}

	public ArrayList<Row> getData() {
		ArrayList dataList = new ArrayList();
		try {
			File dataFile = new File(inputRelPath);
			Scanner scan = new Scanner(dataFile);
			while (scan.hasNextLine()) {
				String newRow = scan.nextLine();
				String[] parts = newRow.split("-|\\s|\\: ");
				int[] rowRange = new int[]{Integer.parseInt(parts[0]), Integer.parseInt(parts[1])};
				char rowLetter = parts[2].charAt(0);
				String newPassword = parts[3];
				dataList.add(new Row(rowRange, rowLetter, newPassword));
			}
		}
		catch(Exception exception) {
			System.err.println(exception);
			System.exit(1);
		}
		return dataList;
	}

	public Integer partOne(ArrayList<Row> dataList) {
		int solution = 0;
		Row password = new Row();
		for (Object item : dataList) {
			if (item instanceof Row) {
				password = (Row) item;
			}
			int letterCount = 0;
			String passwordTested = password.password;
			int[] passwordRange = password.passwordRange;

			for (int j = 0; j < passwordTested.length(); j++) {
				char k = passwordTested.charAt(j);
				if (k == password.letter) {
					letterCount++;
				}
			}
			if (letterCount >= passwordRange[0] && letterCount <= passwordRange[1]) {
				solution++;
			}

		}
		return solution;
	}

	public Integer partTwo(ArrayList<Row> dataList) {
		int solution = 0;
		Row password = new Row();
		for (Object item : dataList) {
			if (item instanceof Row) {
				password = (Row) item;
			}
			char pLetter = password.letter;
			String thePassword = password.password;
			int[] pRange = password.passwordRange;
			if (thePassword.charAt(pRange[0] - 1) == pLetter ^ thePassword.charAt(pRange[1] - 1) == pLetter) {
				solution++;
			}
		}
		return solution;
	}

}
