package adventofcode2020;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;

import adventofcode2020.one.ReportRepair;
import adventofcode2020.two.PasswordPhilosophy;
import adventofcode2020.three.TobogganTrajectory;

public class Main {

	public static void main(String[] args) {
		ArrayList<Solution> solutionsList = new ArrayList<>();
		solutionsList.add(new ReportRepair());
		solutionsList.add(new PasswordPhilosophy());
		solutionsList.add(new TobogganTrajectory());

		if (args.length > 0) {
			for(String argument : args) {

				int index = Integer.parseInt(argument) - 1;
				solutionsList.get(index).getResult();
			}
		}
		else {
			solutionsList.stream().forEach(Solution::getResult);
		}

	}

}
