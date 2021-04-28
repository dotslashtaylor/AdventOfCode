package adventofcode2020.four;

import adventofcode2020.Solution;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class PassportProcessing extends Solution {

	public PassportProcessing() {
		inputRelPath = "./resources/inputs/day4.txt";
		identifier = "Day Four: PassportProcessing";
	}

	public ArrayList getData() {
		ArrayList dataList = new ArrayList();
		try {
			File dataFile = new File(inputRelPath);
			Scanner scan = new Scanner(dataFile);
			String currentPassportString = "";
			while (scan.hasNextLine()) {
				String currentLine = scan.nextLine();
				if (currentLine.equals("")) {
					dataList.add(new Passport(currentPassportString));
					currentPassportString = "";
				}
				currentPassportString = currentPassportString + " " + currentLine;
			}
			dataList.add(new Passport(currentPassportString));
		}
		catch(Exception exception) {
			System.err.println(exception);
			System.exit(1);
		}
		return dataList;
	}

	public int partOne(ArrayList dataList) {
		int solution = 0;
		for (Object dataItem : dataList) {
			Passport currentPassport = (Passport) dataItem;
			if (currentPassport.isValidPartOne()) {
				solution++;
			}
		}

		return solution;
	}

	public int partTwo(ArrayList dataList) {
		int solution = 0;
		for (Object dataItem : dataList) {
			Passport currentPassport = (Passport) dataItem;
			if (currentPassport.isValidPartTwo()) {
				solution++;
			}
		}
		return solution;
	}

}
