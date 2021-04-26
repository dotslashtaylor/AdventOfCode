package adventofcode2020;

import java.util.ArrayList;

public abstract class Solution {

	private String inputRelPath;
	private String identifier;



	public long getTime() {
		return System.currentTimeMillis();
	}

	public String timeExecution(long start, long finish) {
		return (finish - start) / 1000 + " seconds";
	}




	public void getResult() {
		System.out.println(identifier);
		long start = getTime();
		ArrayList dataSet = getData();
		int solutionOne = partOne(dataSet);
		int solutionTwo = partTwo(dataSet);
		long end = getTime();
		System.out.println("Part One: " + solutionOne + "\n"
							+ "Part Two: " + solutionTwo + "\n"
							+ "Time: " + timeExecution(start, end));
	}

	public abstract ArrayList getData();

	public abstract int partOne(ArrayList dataList);
	public abstract int partTwo(ArrayList dataList);

}
