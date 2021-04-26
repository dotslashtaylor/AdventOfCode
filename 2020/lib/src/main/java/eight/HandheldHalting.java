package adventofcode2020.;

import java.io.File;
import java.util.Scanner;

public class {

	public static void getData(String relativePath){
		try {
			File dataFile = new File(relativePath);
			Scanner scan = new Scanner(dataFile);
			// empty lines == ""
		}
		catch (Exception exception) {
			System.err.println(exception);
			System.exit(1);
		}
	}


	public static int partOne(int[] expenseReport) {

	}

/*
	public static int partTwo(int[] expenseReport) {

	}
*/

}
