package adventofcode2020.five;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DayFiveTest {

	BinaryBoarding testClass = new BinaryBoarding();

	@Test 
	void testSeatID() {
		assertEquals(357, testClass.calculateSeatID(new int[]{44, 5}));
	}

	@Test
	void testSeatLocation() {
		assertEquals(44, testClass.findSeatLocation("FBFBBFFRLR")[0]);
		assertEquals(5, testClass.findSeatLocation("FBFBBFFRLR")[1]);
	}

	@Test 
	void testPartOne() {
		ArrayList testValues = new ArrayList();
		testValues.add("BFFFBBFRRR");
		testValues.add("BBFFBBFRLL");
		testValues.add("FFFBBBFRRR");
		assertEquals(820, testClass.partOne(testValues));
	}

}
