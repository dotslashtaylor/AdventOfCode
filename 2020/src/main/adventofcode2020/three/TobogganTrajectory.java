package adventofcode2020.three;

import adventofcode2020.Solution;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.math.BigInteger;

public class TobogganTrajectory extends Solution {

	public TobogganTrajectory() {
		inputRelPath = "./resources/inputs/day3.txt";
		identifier = "Day Three: TobogganTrajectory";
	}

	public ArrayList getData() {
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

	public int calculateTreesHit(ArrayList dataList, int intervalX, int intervalY) {
		int x = 0;
		int treesHit = 0;
		for (int y = 0; y < dataList.size(); ) {
			String horizontal = (String) dataList.get(y);
			while (x >= horizontal.length()) {
				x = x - horizontal.length();
			}
			if (horizontal.charAt(x) == '#') {
				treesHit++;
			}
			x += intervalX;
			y += intervalY;
		}
		return treesHit;
	}

	public int partOne(ArrayList dataList) {
		int solution = calculateTreesHit(dataList, 3, 1);
		return solution;
	}

	public int partTwo(ArrayList dataList) {
		BigInteger treesHitProduct = new BigInteger("1");
		int[][] paths = new int[][]{
			{1, 1}, {3, 1}, {5, 1},
			{7, 1}, {1, 2}
		};
		for (int[] path : paths) {
			BigInteger treesHitThisRound = new BigInteger("" + calculateTreesHit(dataList, path[0], path[1]));
			treesHitProduct = treesHitProduct.multiply(treesHitThisRound);
		}
		int solution = treesHitProduct.intValue();
		return solution;
	}

}
