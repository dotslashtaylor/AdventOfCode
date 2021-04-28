package adventofcode2020.six;

import adventofcode2020.Solution;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class CustomCustoms extends Solution {

	public CustomCustoms() {
		inputRelPath = "./resources/inputs/day6.txt";
		identifier = "Day Six: CustomCustoms";
	}

	public ArrayList getData() {
		ArrayList dataList = new ArrayList();
		try {
			File dataFile = new File(inputRelPath);
			Scanner scan = new Scanner(dataFile);
			String group = "";
			while (scan.hasNextLine()) {
				String currentLine = scan.nextLine();
				if (currentLine.equals("")) {
					dataList.add(group);
					group = "";
					continue;
				}
				group = group + currentLine;
			}
			dataList.add(group);
		}
		catch(Exception exception) {
			System.err.println(exception);
			System.exit(1);
		}
		return dataList;
	}

	public int partOne(ArrayList dataList) {
		int solution = 0;

		return solution;
	}

	public int partTwo(ArrayList dataList) {
		int solution = 0;

		return solution;
	}

}
