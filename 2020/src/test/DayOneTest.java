package adventofcode2020.one;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DayOneTest {

	ReportRepair testClass = new ReportRepair();

	@Test 
	void testPartOne() {
		ArrayList<Integer> testValues = new ArrayList<>();
		for (int i : new int[]{1721, 979, 366, 299, 675, 1456}) {
			testValues.add(i);
		}

		assertEquals(514579, testClass.partOne(testValues));
	}


	@Test
	void testPartTwo() {
		ArrayList<Integer> testValues = new ArrayList<>();
		for (int i : new int[]{1721, 979, 366, 299, 675, 1456}) {
			testValues.add(i);
		}

		assertEquals(241861950, testClass.partTwo(testValues));
	}

}
