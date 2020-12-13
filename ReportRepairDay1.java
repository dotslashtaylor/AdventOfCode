import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import java.io.File;
public class ReportRepairDay1 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner (new File("./inputs/input1"));
		int x = 0;
		ArrayList<Integer> entries = new ArrayList<Integer>();

		while (in.hasNextInt()) {
			x = in.nextInt();
			entries.add(x);
		}
		
		System.out.println("There are " + entries.size() + " entries.");

		int k = 0;
		int c = 1;
		System.out.println("PART ONE:");

		while (entries.get(k) + entries.get(c) != 2020) {
			c++;
			if (c == (entries.size() - 1)) {
				k++;
				c = k + 1;
			}
		}
		System.out.println("The two entries that add up to 2020 are " + entries.get(k) + " and " +entries.get(c));
		System.out.println("The solution to part one is: " + (entries.get(k) * entries.get(c)));
		System.out.println();

		k = 0;
		c = 1;
		int r = 2;
		System.out.println("PART TWO: ");
		while (entries.get(k) + entries.get(c) + entries.get(r) != 2020) {
			r++;
			if (r == (entries.size() - 1)) {
				c++;
				r = c + 1;
			}
			if (c == (entries.size() - 2)) {
				k++;
				c = k + 1;
				r = c + 1;
			}
		}
		System.out.println("The three entires that add up to 2020 are " + entries.get(k) + ", " + entries.get(c) + ", and " + entries.get(r));
		System.out.println("The solution to part two is: " + (entries.get(k) * entries.get(c) * entries.get(r)));
	}
}
