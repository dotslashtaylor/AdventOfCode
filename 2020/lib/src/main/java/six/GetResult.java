package adventofcode2020.six;

public class GetResult {

	public static void main(String[] args) {
		String relLocation = "../../../resources/test/day6.txt";
		String[] dataSet = CustomCustoms.getData(relLocation);
		int[] dataSizes = CustomCustoms.getGroupSizes(relLocation);
		int result1 = CustomCustoms.partOne(dataSet);
		System.out.println(result1);
		int result2 = CustomCustoms.partTwo(dataSet, dataSizes);
		System.out.println(result2);
	}

}
