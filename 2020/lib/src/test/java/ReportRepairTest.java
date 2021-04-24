import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import adventofcode2020.one.ReportRepair;

class ReportRepairTest {
	@Test void testPartOne() {
		assertEquals(514579, ReportRepair.partOne(new int[]{1721, 979, 366, 299, 675, 1456}));
	}
	@Test void testPartTwo() {
		assertEquals(241861950, ReportRepair.partTwo(new int[]{1721, 979, 366, 299, 675, 1456}));
	}
}
