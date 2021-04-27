package adventofcode2020.one;

import adventofcode2020.Solution;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class ReportRepair extends Solution {

	public ReportRepair() {
		inputRelPath = "./resources/inputs/day1.txt";
		identifier = "Day One: ReportRepair";
	}

	public ArrayList getData() {
		ArrayList<Integer> dataList = new ArrayList<>();
		try {
			File dataFile = new File(inputRelPath);
			Scanner scan = new Scanner(dataFile);
			while (scan.hasNextInt()) {
				dataList.add(scan.nextInt());
			}
		}
		catch(Exception exception) {
			System.err.println(exception);
			System.out.println(System.getProperty("user.dir"));
			System.exit(1);
		}
		return dataList;
	}

	public int partOne(ArrayList dataList) {
		int solution = 0;

		int i = 0, j = 1;
		while (i < dataList.size()) {
			Integer firstValue = 0, secondValue = 0;
			if (dataList.get(i) instanceof Integer) {
				firstValue = (Integer) dataList.get(i);
			}
			if (dataList.get(j) instanceof Integer) {
				secondValue = (Integer) dataList.get(j);
			}

			if (firstValue + secondValue == 2020) {
				solution = firstValue * secondValue;
				break;
			}
			j++;
			if (j == dataList.size()) {
				i++;
				j = i + 1;
			}
		}
		return solution;
	}

	public int partTwo(ArrayList dataList) {
		int solution = 0;
		int i = 0, j = 1, k = 2;
		while (i < dataList.size()) {
			Integer firstValue = 0, secondValue = 0, thirdValue = 0;
			if (dataList.get(i) instanceof Integer) {
				firstValue = (Integer) dataList.get(i);
			}
			if (dataList.get(j) instanceof Integer) {
				secondValue = (Integer) dataList.get(j);
			}
			if (dataList.get(j) instanceof Integer) {
				thirdValue = (Integer) dataList.get(k);
			}

			if (firstValue + secondValue + thirdValue == 2020) {
				solution = firstValue * secondValue * thirdValue;
				break;
			}
			k++;
			if (k == dataList.size()) {
				j++;
				k = j + 1;
				if (j == dataList.size() - 1) {
					i++;
					j = i + 1;
					k = j + 1;
				}
			}

		}
		return solution;
	}

}
