package adventofcode2020.six;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DaySixTest {

	CustomCustoms testClass = new CustomCustoms();

	@Test 
	void testPartOne() {
		ArrayList<Group> testValues = new ArrayList();
		testValues.add(new Group("abcx abcy abcz", 3));

		assertEquals(6, testClass.partOne(testValues));


		testValues.clear();
		String[] stringValues = new String[]{"abc", "a b c", "ab ac", "a a a a", "b"};
		int[] sizes = new int[]{1, 3, 2, 4, 1};
		for (int i = 0; i < 5; i++) {
			testValues.add(new Group(stringValues[i], sizes[i]));
		}
		assertEquals(11, testClass.partOne(testValues));
	}


	@Test 
	void testPartTwo() {
		ArrayList<Group> testValues = new ArrayList();
		testValues.add(new Group("abcx abcy abcz", 3));

		assertEquals(3, testClass.partTwo(testValues));

		testValues.clear();
		String[] stringValues = new String[]{"abc", "a b c", "ab ac", "a a a a", "b"};
		int[] sizes = new int[]{1, 3, 2, 4, 1};
		for (int i = 0; i < 5; i++) {
			testValues.add(new Group(stringValues[i], sizes[i]));
		}
		assertEquals(6, testClass.partTwo(testValues));
	}

}
