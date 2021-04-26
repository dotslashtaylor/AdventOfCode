package adventofcode2020.one;

import java.io.File;
import java.util.Scanner;

public class ReportRepair {

	public static int[] getData(String relativePath){
		int[] intArray = new int[1];
		try {
			File dataFile = new File(relativePath);
			Scanner scan = new Scanner(dataFile);
			int countLines = 0;
			while (scan.hasNextInt()) {
				countLines += 1;
				scan.nextInt();
			}
			scan.close();
			intArray = new int[countLines];
			scan = new Scanner(dataFile);
			for (int i = 0; i < countLines; i++) {
				intArray[i] = scan.nextInt();
			}
			return intArray;
		}
		catch (Exception exception) {
			System.err.println(exception);
			System.exit(1);
		}
		return intArray;
	}


	public static int partOne(int[] expenseReport) {

		int h = 0, i = 1;
		while (expenseReport[h] + expenseReport[i] != 2020) {
			i += 1;
			if (i == expenseReport.length) {
				h += 1;
				i = h + 1;
			}
		}
		return expenseReport[h] * expenseReport[i];
	}


	public static int partTwo(int[] expenseReport) {

		int h = 0, i = 1, j = 2;

		while (expenseReport[h] + expenseReport[i] + expenseReport[j] != 2020) {
			j += 1;
			if (j == expenseReport.length) {
				i += 1;
				j = i + 1;

				if (i == expenseReport.length - 1) {
					h += 1;
					i = h + 1;
					j = i + 1;
				}
			}
		}
		return expenseReport[h] * expenseReport[i] * expenseReport[j];
	}

}
