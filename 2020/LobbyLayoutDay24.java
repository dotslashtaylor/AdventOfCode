import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.Point;

public class LobbyLayoutDay24 {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		//Scanner in = new Scanner(new File("./inputs/input24"));
		ArrayList<String> instructions = new ArrayList<String>();
		String l = "";

		while (in.hasNextLine()) {
			l = in.nextLine();
			instructions.add(l);
		}

		int blackTiles = PartOne(instructions);

	}

	public static int PartOne(ArrayList<String> instructions) {

		int blackTiles = 0;
		String singleLine = "";
		int k = 0;
		char d = '0';

		ArrayList<Point> locations = new ArrayList<Point>();

		for (int i = 0; i < instructions.size(); i++) {
			singleLine = instructions.get(i);
			while (k < singleLine.length()) {
				d = singleLine.charAt(k);
				switch(d) {
					case 'n' -> System.out.println("north");
				} 
			}
		}
		return blackTiles;
	}

}
