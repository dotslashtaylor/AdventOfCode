package adventofcode2020.four;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DayfourTest {

	PassportProcessing testClass = new PassportProcessing();

	@Test 
	void testPartOne() {
		ArrayList testValues = new ArrayList();
		assertEquals(0, testClass.partOne(testValues));
	}

	@Test 
	void testPartTwo() {
		ArrayList testValues = new ArrayList();
		assertEquals(0, testClass.partTwo(testValues));
	}

}
