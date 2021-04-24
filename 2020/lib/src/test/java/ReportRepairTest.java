import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import adventofcode2020.ReportRepair;

class ReportRepairTest {
	@Test void testMainMethods() {

		assertEquals(514579, ReportRepair.partOne(new int[]{1721, 979, 366, 299, 675, 1456}));
		assertEquals(241861950, ReportRepair.partTwo(new int[]{1721, 979, 366, 299, 675, 1456}));

    }
}
