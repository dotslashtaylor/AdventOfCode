import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.Point;

public class LobbyLayoutDay24 {

	public static void main(String[] args) throws IOException {
	Scanner in = new Scanner(System.in);
//		Scanner in = new Scanner(new File("./inputs/input24"));
		ArrayList<String> instructions = new ArrayList<String>();
		String l = "";

		while (in.hasNextLine()) {
			l = in.nextLine();
			instructions.add(l);
		}

		int blackTiles = PartOne(instructions);
		System.out.printf("There are %d black tiles in part one\n", blackTiles);

		blackTiles = PartTwo(locations, 100);
		System.out.printf("After 100 days, there are %d black tiles facing up\n", blackTiles);

	}

	public static ArrayList<Point> locations = new ArrayList<Point>();

	public static int PartOne(ArrayList<String> instructions) {

		int blackTiles = 0;
		String singleLine = "";
		int k = 0;
		char d = '0';

		int x = 0;
		int y = 0;

		for (int i = 0; i < instructions.size(); i++) {

			singleLine = instructions.get(i);
			x = 0;
			y = 0;
			k = 0;

			while (k < singleLine.length()) {

				d = singleLine.charAt(k);

				switch(d) {
					case ('n'):
						k++;
						if (singleLine.charAt(k) == 'e') {
							x += 1;
							y += 1; 
						}
						else {
							x -= 1;
							y += 1;
						}
						break;
					case ('s'):
						k++;
						if (singleLine.charAt(k) == 'e') {
							x += 1;
							y -= 1;
						}
						else {
							x -= 1;
							y -= 1;
						}
						break;
					case ('e'):
						x += 2;
						break;
					case ('w'):
						x -= 2;
						break;
				}

				k++;

		}

		if (locations.contains(new Point(x, y))) {
			locations.remove(new Point(x, y));
		}
		else {
			locations.add(new Point(x, y));
		} 
	}
		blackTiles = locations.size();
		return blackTiles;
	}

	public static int PartTwo(ArrayList<Point> locations, int iterations) {
		ArrayList<Point> whiteTiles = new ArrayList<Point>();

		for (int j = -1000; j < 1000; j++) {
			for (int i = -1000; i < 1000; i++) {
				whiteTiles.add(new Point(j, i));
			}
		}

		ArrayList<Integer> xCoordinates = new ArrayList<Integer>();
		ArrayList<Integer> yCoordinates = new ArrayList<Integer>();
		ArrayList<Point> points = locations;
		ArrayList<Point> set = points;

		for (int j = 0; j < points.size(); j++) {
			if (whiteTiles.contains(points.get(j))) {
				whiteTiles.remove(points.get(j));
			}
		}

		int x1 = 0;
		int x2 = 0;
		int dx = 0;
		int dy = 0;
		int counter = 0;

		for (int j = 0; j < iterations; j++) {
			for (int i = 0; i < points.size(); i++) {
				xCoordinates.add((int) locations.get(i).getX());
				yCoordinates.add((int) locations.get(i).getY());
			}
			for (int i = 0; i < xCoordinates.size(); i++) {
				for (int k = i + 1; k < xCoordinates.size(); k++) {
					x1 = xCoordinates.get(i);
					x2 = xCoordinates.get(k);
					dx = Math.abs(x1 - x2);
					dy = Math.abs(yCoordinates.get(i) - yCoordinates.get(k));
					if (dx == 1 && dy == 1) {
						counter++;
					}
					if (dx == 2 && dy == 0) {
						counter++;
					}
				}
				if (counter == 1 && counter == 2) {
					set.add(points.get(i));
				}
			}
			points = set;
			set.clear();
		}
		return points.size();
	}
}
