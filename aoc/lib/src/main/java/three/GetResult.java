package adventofcode2020.three;

import java.util.ArrayList;
import java.math.BigInteger;

public class GetResult {
	public static void main(String[] args) {
		ArrayList<String> dataSet = TobogganTrajectory.getData("../../../resources/test/day3.txt");
		int result1 = TobogganTrajectory.partOne(dataSet, 3, 1);
		System.out.println(result1);
		BigInteger result2 = TobogganTrajectory.partTwo(dataSet);
		System.out.println(result2);
	}

}
