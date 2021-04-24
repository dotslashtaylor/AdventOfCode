package adventofcode2020.ui;

import adventofcode2020.ReportRepair;

public class GetResult {

	public static void main(String[] args) {
		int[] dataSet = GetData.returnIntegerArray("../../../resources/test/day1.txt");
			int result1 = ReportRepair.partOne(dataSet);
			System.out.println(result1);
			int result2 = ReportRepair.partTwo(dataSet);
			System.out.println(result2);
	}

}
