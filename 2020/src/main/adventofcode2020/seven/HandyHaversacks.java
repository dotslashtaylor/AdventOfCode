package adventofcode2020.seven;

import adventofcode2020.Solution;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class HandyHaversacks extends Solution {

	public HandyHaversacks() {
		inputRelPath = "./resources/inputs/day7.txt";
		identifier = "Day Seven: HandyHaversacks";
	}

	public ArrayList getData() {
		ArrayList dataList = new ArrayList();
		try {
			File dataFile = new File(inputRelPath);
			Scanner scan = new Scanner(dataFile);
			while (scan.hasNextLine()) {
				dataList.add(scan.nextLine());
			}
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
			String sentence = (String) dataItem;
		}
		return solution;
	}

	public int partTwo(ArrayList dataList) {
		int solution = 0;

		return solution;
	}

}
