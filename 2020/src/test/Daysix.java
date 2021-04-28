package adventofcode2020.six;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DaysixTest {

	CustomCustoms testClass = new CustomCustoms();

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
