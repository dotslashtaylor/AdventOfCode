package adventofcode2020.five;

import adventofcode2020.Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;

public class BinaryBoarding extends Solution<Integer, String> {

	public BinaryBoarding() {
		inputRelPath = "./resources/inputs/day5.txt";
		identifier = "Day Five: BinaryBoarding";
	}

	public ArrayList<String> getData() {
		ArrayList dataList = new ArrayList();
		try {
			File dataFile = new File(inputRelPath);
			Scanner scan = new Scanner(dataFile);
			while (scan.hasNextLine()) {
				dataList.add(scan.nextLine());
			}
		}
		catch(Exception exception) {
			System.err.println(exception);
			System.exit(1);
		}
		return dataList;
	}

	public static int calculateSeatID(int[] seatLocation) {
		int row = seatLocation[0];
		int column = seatLocation[1];
		int id = row * 8 + column;
		return id;
	}

	public int[] findSeatLocation(String partition) {
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

	public Integer partOne(ArrayList<String> dataList) {
		int solution = 0;
		for (Object pass : dataList) {
			String passString = (String) pass;
			int[] seatlocation = findSeatLocation(passString);
			int currentID = calculateSeatID(seatlocation);
			if (currentID > solution) {
				solution = currentID;
			}
		}
		return solution;
	}

	public Integer partTwo(ArrayList<String> dataList) {
		int solution = 0;
		int[] ids = new int[dataList.size()];

		for (int i = 0; i < ids.length; i++) {
			String seatString = (String) dataList.get(i);
			int[] seatlocation = findSeatLocation(seatString);
			int currentID = calculateSeatID(seatlocation);
			ids[i] = currentID;
		}

		Arrays.sort(ids);
		for (int i = 0; i < ids.length - 1; i++) {
			if (ids[i] + 2 == ids[i + 1]) {
				solution = ids[i] + 1;
				break;
			}
		}
		return solution;
	}

}
