package adventofcode2020.six;

import adventofcode2020.Solution;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class CustomCustoms extends Solution<Integer, Group> {

	public CustomCustoms() {
		inputRelPath = "./resources/inputs/day6.txt";
		identifier = "Day Six: CustomCustoms";
	}

	public ArrayList<Group> getData() {
		ArrayList dataList = new ArrayList();
		try {
			File dataFile = new File(inputRelPath);
			Scanner scan = new Scanner(dataFile);
			String groupString = "";
			int groupSize = 0;
			while (scan.hasNextLine()) {
				String currentLine = scan.nextLine();
				if (currentLine.equals("")) {
					dataList.add(new Group(groupString, groupSize));
					groupSize = 0;
					groupString = "";
					continue;
				}
				groupString = groupString + "\n" + currentLine;
				groupSize++;
			}
			dataList.add(new Group(groupString, groupSize));
		}
		catch(Exception exception) {
			System.err.println(exception);
			System.exit(1);
		}
		return dataList;
	}

	public Integer partOne(ArrayList<Group> dataList) {
		int solution = 0;
		for (Object dataItem : dataList) {
			Group currentGroup = (Group) dataItem;
			solution = solution + currentGroup.getQuestionSetSize();
		}
		return solution;
	}

	public Integer partTwo(ArrayList<Group> dataList) {
		int solution = 0;
		for (Object dataItem : dataList) {
			Group currentGroup = (Group) dataItem;
			solution = solution + currentGroup.getUnanimousSize();
		}
		return solution;
	}

}
