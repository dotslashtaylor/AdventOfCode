package adventofcode2020.seven;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DaysevenTest {

	HandyHaversacks testClass = new HandyHaversacks();
	@Test 
	void testPartOne() {
		String[] bagIdentifiers = new String[]{
			"light red", "dark orange", "bright white", 
			"muted yellow", "shiny gold", "dark olive", 
			"vibrant plum", "faded blue", "dotted black"
		};
		ArrayList<ArrayList<String>> containedBags = new ArrayList<ArrayList<String>>();
		containedBags.add(new ArrayList<String>(Arrays.asList(
			"bright white", "muted yellow", "muted yellow"
		)));
		containedBags.add(new ArrayList<String>(Arrays.asList(
			"bright white", "bright white", "bright white",
			"muted yellow", "muted yellow", "muted yellow", "muted yellow"
		)));
		containedBags.add(new ArrayList<String>(Arrays.asList(
			"shiny gold"
		)));
		containedBags.add(new ArrayList<String>(Arrays.asList(
			"shiny gold", "shiny gold", "faded blue",
			"faded blue", "faded blue", "faded blue",
			"faded blue", "faded blue", "faded blue",
			"faded blue", "faded blue"
		)));
		containedBags.add(new ArrayList<String>(Arrays.asList(
			"dark olive", "vibrant plum", "vibrant plum"
		)));
		containedBags.add(new ArrayList<String>(Arrays.asList(
			"faded blue", "faded blue", "faded blue",
			"dotted black", "dotted black",
			"dotted black", "dotted black"
		)));
		containedBags.add(new ArrayList<String>(Arrays.asList(
			"faded blue", "faded blue", "faded blue",
			"faded blue", "faded blue", "dotted black", 
			"dotted black", "dotted black", "dotted black"
		)));
		containedBags.add(new ArrayList<String>());
		containedBags.add(new ArrayList<String>());
		ArrayList testValues = new ArrayList();
		for (int i = 0; i < 9; i++) {
			testValues.add(new Bag(bagIdentifiers[i], containedBags.get(i)));
		}
		assertEquals(0, testClass.partOne(testValues));
	}

/*
	@Test 
	void testPartTwo() {
		ArrayList testValues = new ArrayList();
		assertEquals(0, testClass.partTwo(testValues));
	}
*/

}
