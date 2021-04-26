package adventofcode2020.two;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PasswordPhilosophyTest {

	PasswordPhilosophy passwordPhilosophy = new PasswordPhilosophy();

	@Test 
	void testPartOne() {
		ArrayList testValues = new ArrayList();
		int[][] ranges = new int[][]{{1, 2}, {1, 3}, {2, 9}};
		char[] chars = new char[]{'a', 'b', 'c'};
		String[] strings = new String[]{"abcde", "cdefg", "ccccccccc"};
		for (int i = 0; i < 3; i++) {
			testValues.add(new Row(ranges[i], chars[i], strings[i]));
		}

		assertEquals(2, passwordPhilosophy.partOne(testValues));
	}

	@Test 
	void testPartTwo() {
		ArrayList testValues = new ArrayList();
		int[][] ranges = new int[][]{{1, 2}, {1, 3}, {2, 9}};
		char[] chars = new char[]{'a', 'b', 'c'};
		String[] strings = new String[]{"abcde", "cdefg", "ccccccccc"};
		for (int i = 0; i < 3; i++) {
			testValues.add(new Row(ranges[i], chars[i], strings[i]));
		}

		assertEquals(1, passwordPhilosophy.partTwo(testValues));

	}

}
