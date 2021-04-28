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
			String groupString = "";
			while (scan.hasNextLine()) {
				String currentLine = scan.nextLine();
				if (currentLine.equals("")) {
					dataList.add(new Group(groupString));
					groupString = "";
					continue;
				}
				groupString = groupString + " " + currentLine;
			}
			dataList.add(new Group(groupString));
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
			Group currentGroup = (Group) dataItem;
			solution = solution + currentGroup.getQuestionSetSize();
		}
		return solution;
	}

	public int partTwo(ArrayList dataList) {
		int solution = 0;
		for (Object dataItem : dataList) {
			Group currentGroup = (Group) dataItem;
			solution = solution + currentGroup.getUnanimousSize();
		}
		return solution;
	}

}
