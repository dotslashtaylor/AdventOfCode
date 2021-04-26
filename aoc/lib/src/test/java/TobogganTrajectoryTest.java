import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.math.BigInteger;

import adventofcode2020.three.TobogganTrajectory;

class TobogganTrajectoryTest {
		public static String[] forrest = new String[]{
			"..##.......", "#...#...#..",
			".#....#..#.", "..#.#...#.#",
			".#...##..#.", "..#.##.....",
			".#.#.#....#", ".#........#",
			"#.##...#...", "#...##....#",
			".#..#...#.#"
		};
	@Test void testPartOne() {
		ArrayList<String> forrestList = new ArrayList<>();
		for (String i : forrest) {
			forrestList.add(i);	
		}
		assertEquals(7, TobogganTrajectory.partOne(forrestList, 3, 1));
	}

	@Test void testPartTwo() {
		ArrayList<String> forrestList = new ArrayList<>();
		for (String i : forrest) {
			forrestList.add(i);	
		}
		assertEquals(new BigInteger("336"), TobogganTrajectory.partTwo(forrestList));

	}

}
