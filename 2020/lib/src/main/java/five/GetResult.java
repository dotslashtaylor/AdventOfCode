package adventofcode2020.five;

public class GetResult {
	public static void main(String[] args) {
		String relLocation = "../../../resources/test/day5.txt";
		String[] dataSet = BinaryBoarding.getData(relLocation);
		int result1 = BinaryBoarding.partOne(dataSet);
		System.out.println(result1);
		int result2 = BinaryBoarding.partTwo(dataSet);
		System.out.println(result2);
	}
}
