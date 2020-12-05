import java.util.*;
import java.io.*;

public class BinaryBoarding2 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input5"));
		String l = "";
		int row_max = 127;
		int row_min = 0;
		int row = 0;
		int column_max = 7;
		int column_min = 0;
		int column = 0;
		int seat_id = 8 * row + column;
		List<Integer> list = new ArrayList<Integer>();
//		list.add(-1);
//		list.add(1);
		while (in.hasNextLine()) {
			l = in.nextLine();
			for (int i = 0; i < 7; i++) {
				if (l.charAt(i) == 'F') {
					row_max =  - 1 + row_max - ((row_max - row_min) / 2);
				}
				else {
					row_min = 1 + row_min + ((row_max - row_min) / 2);
				}
			}
			if (row_max == row_min) {
				row = row_max;
			}
			for (int i = 7; i < 10; i++) {
				if (l.charAt(i) == 'L') {
					column_max = - 1 + column_max - ((column_max - column_min) / 2);
				}
				else {
 					column_min = 1 + column_min + ((column_max - column_min) / 2);
				}
			}
			if (column_max == column_min) {
				column = column_min;
			}
			seat_id = 8 * row + column;
			list.add(seat_id);
			row_max = 127;
			row_min = 0;
			column_max = 7;
			column_min = 0;
		}
		Collections.sort(list);
		int first = list.get(0);
		int i = 0;
		while (list.get(i) == (i + first)) {
			i++;
		}
		System.out.println(i + first);
	}
}
