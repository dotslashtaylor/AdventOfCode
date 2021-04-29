package adventofcode2020;

import java.util.ArrayList;

public abstract class Solution<SolutionObject, DataObject> {

	public String inputRelPath;
	public String identifier;

	public long getTime() {
		return System.currentTimeMillis();
	}

	public String timeExecution(long start, long finish) {
		return (finish - start) + " milliseconds";
	}

	public void getResult() {
		System.out.println(identifier);
		long start = getTime();
		ArrayList dataSet = getData();
		String solutionOne = partOne(dataSet).toString();
		String solutionTwo = partTwo(dataSet).toString();
		long end = getTime();
		System.out.println("Part One: " + solutionOne + "\n"
							+ "Part Two: " + solutionTwo + "\n"
							+ "Time: " + timeExecution(start, end));
		System.out.println();
	}

	public abstract ArrayList<DataObject> getData();

	public abstract SolutionObject partOne(ArrayList<DataObject> dataList);
	public abstract SolutionObject partTwo(ArrayList<DataObject> dataList);

}
