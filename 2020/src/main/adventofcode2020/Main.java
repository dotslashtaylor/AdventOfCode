package adventofcode2020;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;

import adventofcode2020.one.ReportRepair;
import adventofcode2020.two.PasswordPhilosophy;

public class Main {

	public static void main(String[] args) {
		ArrayList<Solution> solutionsList = new ArrayList<>();
		solutionsList.add(new ReportRepair());
		solutionsList.add(new PasswordPhilosophy());

		if (args.length > 0) {
			int index = Integer.parseInt(args[0]) - 1;
			solutionsList.get(index).getResult();
		}
		else {
			solutionsList.stream().forEach(Solution::getResult);
		}

	}

}
