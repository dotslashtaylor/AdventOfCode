package adventofcode2020.four;

import java.util.ArrayList;
import java.util.Arrays;

public class GetResult {

	public static void main(String[] args) {
		String relLocation = "../../../resources/test/day4.txt";
		String[] allPassports = PassportProcessing.getData(relLocation);
		int result1 = PassportProcessing.partOne(allPassports);
		System.out.println(result1);
		int result2 = PassportProcessing.partTwo(allPassports);
		System.out.println(result2);
	}

}
