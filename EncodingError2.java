import java.io.*;
import java.util.*;

public class EncodingError2 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input9"));
		int value = 0;
		int test = 0;
		int counter = 0;
		int first = 0;
		int second = 0;
		int i = 0;
		int sum = 0;
		int weakness = 466456641;

		List<Integer> list = new ArrayList<Integer>();
		while (in.hasNextInt()) {
			value = in.nextInt();
			list.add(value);
			i++;
		}
		while (first < list.size()) {
			test = first;
			while (second < list.size()) {
				while (test <= second) {
					sum += list.get(test);
					test++;
				}
				if (sum == weakness) {
					System.out.println(list.get(first) + " " + list.get(second - 1));
				}
				second++;
			}
			first++;
			second = first + 1;
			sum = 0;
		}			
	}
}
