import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import adventofcode2020.two.PasswordPhilosophy;

class PasswordPhilosophyTest {

	@Test void testPartOne() {
		assertEquals(2, PasswordPhilosophy.partOne(
				new int[][]{
					{1, 2}, {1, 3}, {2, 9}
				},
				new char[]{'a', 'b', 'c'},
				new String[]{"abcde", "cdefg", "ccccccccc"}));
	}
	@Test void testPartTwo() {
		assertEquals(1, PasswordPhilosophy.partTwo(
				new int[][]{
					{1, 2}, {1, 3}, {2, 9}
				},
				new char[]{'a', 'b', 'c'},
				new String[]{"abcde", "cdefg", "ccccccccc"}));
	}

}
