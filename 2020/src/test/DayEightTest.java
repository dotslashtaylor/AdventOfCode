package adventofcode2020.eight;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DayEightTest {

	HandheldHalting testClass = new HandheldHalting();
	String[] op = new String[]{"nop", "acc", "jmp", "acc", "jmp", "acc", "acc", "jmp", "acc"};
	int[] arg = new int[]{0, 1, 4, 3, -3, -99, 1, -4, 6};


	@Test 
	void testPartOne() {
		ArrayList testValues = new ArrayList();
		for (int i = 0; i < 9; i++) {
			testValues.add(new Instruction(op[i], arg[i]));
		}
		assertEquals(5, testClass.partOne(testValues));
	}

	@Test 
	void testPartTwo() {
		ArrayList testValues = new ArrayList();
		for (int i = 0; i < 9; i++) {
			testValues.add(new Instruction(op[i], arg[i]));
		}
		assertEquals(8, testClass.partTwo(testValues));
	}

	@Test
	void testPartTwo0() {
		ArrayList testValues = new ArrayList();
		File file = new File("../resources/inputs/day8.txt");
		try {
			Scanner in = new Scanner(file);
			while (in.hasNextLine()) {
				String str = in.nextLine();
				testValues.add(new Instruction(str));
			}
		}
		catch (Exception ex) {
			
		}
		assertEquals(944, testClass.partTwo(testValues));
	}
}
