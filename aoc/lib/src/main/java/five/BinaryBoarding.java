package adventofcode2020.five;

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class BinaryBoarding {

	public static String[] getData(String relativePath){
		String[] stringData = new String[1];
		ArrayList<String> tempData = new ArrayList<>();
		try {
			File dataFile = new File(relativePath);
			Scanner scan = new Scanner(dataFile);
			while(scan.hasNextLine()) {
				tempData.add(scan.nextLine());
			}
			stringData = new String[tempData.size()];
			int i = 0;
			for (String pass : tempData) {
				stringData[i] = pass;
				i++;
			}
		}
		catch (Exception exception) {
			System.err.println(exception);
			System.exit(1);
		}
		return stringData;
	}

	public static int calculateSeatID(int[] seatLocation) {
		int row = seatLocation[0];
		int column = seatLocation[1];
		int id = row * 8 + column;
		return id;
	}

	public static int[] findSeatLocation(String partition) {
		int rowMax = 127;
		int rowMin = 0;
		int columnMax = 7;
		int columnMin = 0;

		int[] location;
		for (int i = 0; i < partition.length(); i++) {
			int rowRange = rowMax - rowMin;
			int columnRange = columnMax - columnMin;
			char direction = partition.charAt(i);
			switch(direction){
				case('F'):
					rowMax = rowMin + (rowRange / 2);
					break;
				case('B'):
					rowMin = rowMax - (rowRange / 2);
					break;
				case('R'):
					columnMin = columnMax - (columnRange / 2);
					break;
				case('L'):
					columnMax = columnMin + (columnRange / 2);
					break;

			}
		}
		location = new int[]{rowMax, columnMax};
		return location;
	}

	public static int partOne(String[] boardingPasses) {
		int highestID = 0;
		for (String pass : boardingPasses) {
			int[] seatlocation = findSeatLocation(pass);
			int currentID = calculateSeatID(seatlocation);
			if (currentID > highestID) {
				highestID = currentID;
			}
		}
		return highestID;
	}

	public static int partTwo(String[] boardingPasses) {
		int seatID = 0;
		int[] ids = new int[boardingPasses.length];
		for (int i = 0; i < ids.length; i++) {
			int[] seatlocation = findSeatLocation(boardingPasses[i]);
			int currentID = calculateSeatID(seatlocation);
			ids[i] = currentID;
		}
		Arrays.sort(ids);
		for (int i = 0; i < ids.length - 1; i++) {
			if (ids[i] + 2 == ids[i + 1]) {
				seatID = ids[i] + 1;
				break;
			}
		}
		return seatID;
	}

}
