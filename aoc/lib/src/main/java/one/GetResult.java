package adventofcode2020.one;

public class GetResult {

	public static void main(String[] args) {
		int[] dataSet = ReportRepair.getData("../../../resources/test/day1.txt");
			int result1 = ReportRepair.partOne(dataSet);
			System.out.println(result1);
			int result2 = ReportRepair.partTwo(dataSet);
			System.out.println(result2);
	}

}
