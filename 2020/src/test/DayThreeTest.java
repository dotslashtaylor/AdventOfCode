package adventofcode2020.three;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DayThreeTest {

	TobogganTrajectory testClass = new TobogganTrajectory();

	public static String[] forrest = new String[]{
			"..##.......", "#...#...#..",
			".#....#..#.", "..#.#...#.#",
			".#...##..#.", "..#.##.....",
			".#.#.#....#", ".#........#",
			"#.##...#...", "#...##....#",
			".#..#...#.#"
	};

	@Test 
	void testPartOne() {
		ArrayList<String> forrestList = new ArrayList<>();
		for (String i : forrest) {
			forrestList.add(i);
		}
		assertEquals(7, testClass.partOne(forrestList));
	}

	@Test 
	void testPartTwo() {
		ArrayList<String> forrestList = new ArrayList<>();
		for (String i : forrest) {
			forrestList.add(i);
		}
		assertEquals(336, testClass.partTwo(forrestList));
	}

}
