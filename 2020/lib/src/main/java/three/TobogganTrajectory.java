package adventofcode2020.three;

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.math.BigInteger;

public class TobogganTrajectory {

	public static ArrayList<String> getData(String relativePath){
		ArrayList<String> patternList = new ArrayList<>();
		try {
			File dataFile = new File(relativePath);
			Scanner scan = new Scanner(dataFile);
			while (scan.hasNextLine()) {
				patternList.add(scan.nextLine());
			}
		}
		catch (Exception exception) {
			System.err.println(exception);
			System.exit(1);
		}
		return patternList;
	}

	public static int partOne(ArrayList<String> forrestPattern, int intervalX, int intervalY) {
		int x = 0;
		int treesHit = 0;
		for (int y = 0; y < forrestPattern.size(); ){
			String horizontal = forrestPattern.get(y);
			while (x >= horizontal.length()) {
				x = x - horizontal.length();
			}
			if (horizontal.charAt(x) == '#') {
				treesHit += 1;
			}
			x += intervalX;
			y += intervalY;
		}
		return treesHit;
	}


	public static BigInteger partTwo(ArrayList<String> forrestPattern) {
		int[][] paths = new int[][]{
			{1, 1}, {3, 1}, {5, 1}, 
			{7, 1}, {1, 2}
		};
		BigInteger solution = new BigInteger("1");
		for (int[] path : paths) {
			String treesHitOnPath = "" + partOne(forrestPattern, path[0], path[1]);
			solution = solution.multiply(new BigInteger(treesHitOnPath));
		}
		return solution;
	}

}
