package adventofcode2020.ui;

import java.util.ArrayList;
import java.util.Arrays;

import adventofcode2020.PasswordPhilosophy;

public class GetResult {

	public static void main(String[] args) {
		String relLocation = "../../../resources/test/daytest2.txt";
		int[][] ranges = PasswordPhilosophy.getRanges(PasswordPhilosophy.getData(relLocation));
		char[] letters = PasswordPhilosophy.getLetters(PasswordPhilosophy.getData(relLocation));
		String[] passwords = PasswordPhilosophy.getPasswords(PasswordPhilosophy.getData(relLocation));
		int result1 = PasswordPhilosophy.partOne(ranges, letters, passwords);
		System.out.println(result1);
	}

}
