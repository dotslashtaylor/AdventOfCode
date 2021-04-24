import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import adventofcode2020.PasswordPhilosophy;

class PasswordPhilosophyTest {


	@Test void testPartOneFirst(){
		assertEquals(1, PasswordPhilosophy.partOne(
			new int[][]{{1, 2}}, 
			new char[]{'a'}, 
			new String[]{"abcde"}));
	}


	@Test void testPartOneSecond(){
		assertEquals(0, PasswordPhilosophy.partOne(
			new int[][]{{1, 3}}, 
			new char[]{'b'}, 
			new String[]{"cdefg"}));
	}


	@Test void testPartOneThird() {
		assertEquals(1, PasswordPhilosophy.partOne(
			new int[][]{{2, 9}}, 
			new char[]{'c'}, 
			new String[]{"ccccccccc"}));
	}

	@Test void testPartOne() {
		assertEquals(2, PasswordPhilosophy.partOne(
				new int[][]{
					{1, 2}, {1, 3}, {2, 9}
				},
				new char[]{'a', 'b', 'c'},
				new String[]{"abcde", "cdefg", "ccccccccc"}));
	}


}
