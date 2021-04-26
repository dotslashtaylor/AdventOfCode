package adventofcode2020;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;

import adventofcode2020.one.ReportRepair;

public class Main {

	public static void main(String[] args) {
		ArrayList<Solution> solutionsList = new ArrayList<>();
		solutionsList.add(new ReportRepair());
		solutionsList.stream().forEach(Solution::getResult);

	/*		for (Solution solution : solutionsList) {
				solution.getResult();
			}
	*/
	}

}
