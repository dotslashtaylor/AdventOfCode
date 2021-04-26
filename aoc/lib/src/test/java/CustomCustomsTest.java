import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import adventofcode2020.six.CustomCustoms;

class CustomCustomsTest {

	@Test void testPartOneCount() {
		assertEquals(6, CustomCustoms.partOne(new String[]{"abcxabcyabcz"}));
		assertEquals(11, CustomCustoms.partOne(new String[]{"abc", "abc", "abac", "aaaa", "b"}));
	}

	@Test void testPartTwo() {
		assertEquals(3, CustomCustoms.partTwo(new String[]{"abcxabcyabcz"}, new int[]{3}));
		assertEquals(6, CustomCustoms.partTwo(new String[]{"abc", "abc", "abac", "aaaa", "b"}, new int[]{1, 3, 2, 4, 1}));
	}

}
