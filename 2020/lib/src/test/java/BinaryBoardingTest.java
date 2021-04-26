import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import adventofcode2020.five.BinaryBoarding;

class BinaryBoardingTest {

	@Test void testSeatID() {
		assertEquals(357, BinaryBoarding.calculateSeatID(new int[]{44, 5}));
	}

	@Test void testSeatLocation() {
		assertEquals(44, BinaryBoarding.findSeatLocation("FBFBBFFRLR")[0]);
		assertEquals(5, BinaryBoarding.findSeatLocation("FBFBBFFRLR")[1]);
	}

	@Test void testPartOne() {
		assertEquals(820, BinaryBoarding.partOne(new String[]{
			"BFFFBBFRRR", "FFFBBBFRRR", "BBFFBBFRLL"
		}));
	}
}
