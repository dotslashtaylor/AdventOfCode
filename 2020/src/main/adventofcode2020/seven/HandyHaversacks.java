package adventofcode2020.seven;

import adventofcode2020.Solution;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class HandyHaversacks extends Solution<Integer, Bag> {

	public HandyHaversacks() {
		inputRelPath = "./resources/inputs/day7.txt";
		identifier = "Day Seven: HandyHaversacks";
	}

	public ArrayList<Bag> getData() {
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

	public Integer partOne(ArrayList<Bag> dataList) {
		int solution = 0;
		for (Bag dataItem : dataList) {
			Bag sentence = dataItem;
		}
		return solution;
	}

	public Integer partTwo(ArrayList<Bag> dataList) {
		int solution = 0;

		return solution;
	}

}
