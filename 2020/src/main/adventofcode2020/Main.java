package adventofcode2020;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;

import adventofcode2020.one.ReportRepair;
import adventofcode2020.two.PasswordPhilosophy;
import adventofcode2020.three.TobogganTrajectory;
import adventofcode2020.four.PassportProcessing;
import adventofcode2020.five.BinaryBoarding;
import adventofcode2020.six.CustomCustoms;

public class Main {

	public static void main(String[] args) {
		ArrayList<Solution> solutionsList = new ArrayList<>();
		solutionsList.add(new ReportRepair());
		solutionsList.add(new PasswordPhilosophy());
		solutionsList.add(new TobogganTrajectory());
		solutionsList.add(new PassportProcessing());
		solutionsList.add(new BinaryBoarding());
		solutionsList.add(new CustomCustoms());

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
