package adventofcode2020.two;

import java.util.ArrayList;
import java.util.Arrays;

public class GetResult {

	public static void main(String[] args) {
		String relLocation = "../../../resources/test/day2.txt";
		ArrayList<Row> rowList = PasswordPhilosophy.getData(relLocation);
		int[][] ranges = PasswordPhilosophy.getRanges(rowList);
		char[] letters = PasswordPhilosophy.getLetters(rowList);
		String[] passwords = PasswordPhilosophy.getPasswords(rowList);
		int result1 = PasswordPhilosophy.partOne(ranges, letters, passwords);
		System.out.println(result1);
		int result2 = PasswordPhilosophy.partTwo(ranges, letters, passwords);
		System.out.println(result2);
	}

}
