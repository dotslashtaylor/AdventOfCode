package adventofcode2020.ui;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class GetData {

	public static int[] returnIntegerArray(String relativePath) {
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

}
