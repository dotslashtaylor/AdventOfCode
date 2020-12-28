import java.io.*;
import java.util.*;

public class EncodingError1 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input9"));
		int index = 25;
		int value = 0;
		int test = 0;
		int counter = 0;
		int first = 0;
		int second = 0;
		int i = 0;
		int sum = 0;

		List<Integer> list = new ArrayList<Integer>();
		while (i < index) {
			value = in.nextInt();
			list.add(value);
			i++;
		}
		while (in.hasNextInt()) {
			test = in.nextInt();
			while (first < list.size() - 1) {
				while (second < list.size() - 1) {
					sum = (list.get(first) + list.get(second));
					if (sum == test) {
						counter++;
					}
					second++;
				}
				first++;
				second = first + 1;
			}
			if (counter == 0) {
				System.out.print(" + " + test);			
				System.out.println();
			}
			first = 0;
			counter = 0;
			second = 0;
			list.add(test);
			list.remove(0);
		}
	}
}
