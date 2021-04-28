package adventofcode2020.six;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DaySixTest {

	CustomCustoms testClass = new CustomCustoms();

	@Test 
	void testPartOne() {
		ArrayList testValues = new ArrayList();
		testValues.add(new Group("abcx abcy abcz"));

		assertEquals(6, testClass.partOne(testValues));


		testValues.clear();
		for (String i : new String[]{"abc", "a b c", "ab ac", "a a a a", "b"}) {
			testValues.add(new Group(i));
		}
		assertEquals(11, testClass.partOne(testValues));
	}


	@Test 
	void testPartTwo() {
		ArrayList testValues = new ArrayList();
		testValues.add(new Group("abcx abcy abcz"));

		assertEquals(3, testClass.partTwo(testValues));

		testValues.clear();
		for (String i : new String[]{"abc", "a b c", "ab ac", "a a a a", "b"}) {
			testValues.add(new Group(i));
		}
		assertEquals(6, testClass.partTwo(testValues));
	}

}
