import java.util.*;
import java.io.*;

public class AdapterArray {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input10"));
		TreeSet<Integer> map = new TreeSet<Integer>();
		int key = 0;
		int n = 0;		
		int prev = 0;
		int bef = 0;
		int last = 0;
		int count3 = 0;
		int count1 = 0;
		while (in.hasNextInt()) {
			key = in.nextInt();
			map.add(key);
		}

		key = map.pollLast();
		prev = map.pollLast();
		bef = map.pollLast();
		while (n < (map.size() * 30)) {
			last = map.pollLast();
			if (key - prev == 3 || key - bef == 3 || key - last == 3) {
				count3++;
					System.out.println(key + ", " + prev + ", " + bef + ", " + last);
			}
			if (key - bef == 1 || key - prev == 1 || key - last == 1) {
				count1++;
					System.out.println(key + ", " + prev + ", " + bef + ", " + last);
			}
			key = prev;
			prev = bef;
			bef = last;
			n++;
		}
			key = prev;
			bef = last;
			last = 0;
			while (key != 0) {
				if (key - prev == 3 || key - bef == 3 || key - last == 3) {
					count3++;
					System.out.println(key + ", " + prev + ", " + bef + ", " + last);
				}
				if (key - bef == 1 || key - prev == 1 || key - last == 3) {
					count1++;
					System.out.println(key + ", " + prev + ", " + bef + ", " + last);
				}
				key = bef;
				bef = last;
			}
		System.out.println(count3 + " " + count1);
	}
}
