import java.io.*;
import java.util.*;

public class HandheldHalting2 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input8"));
		List<String> keys = new ArrayList<String>();
		List<String> values = new ArrayList<String>();
		String l = "";
		String first = "";
		String second = "";
		String[] arr = new String[2];
		String k = "";
		int v = 0;
		PrintWriter out = new PrintWriter(new FileWriter("output8"));
		while (in.hasNextLine()) {
			l = in.nextLine();
			arr = l.split(" ");
			first = arr[0];
			second = arr[1];
			keys.add(first);
			values.add(second);
		}

		String[] firstValue = new String[keys.size()];
		for (int m = 0; m < keys.size(); m++) {
			firstValue[m] = keys.get(m);
		}
		int[] secondValue = new int[values.size()];
		for (int m = 0; m < values.size(); m++) {
			secondValue[m] = Integer.parseInt(values.get(m));
		}
int m = 0;
		while (m < keys.size()) {
			if (keys.get(m).equals("nop")) {
				firstValue[m] = "jmp";
				System.out.println(test(firstValue, secondValue));
				firstValue[m] = "nop";
			}
			else if (keys.get(m).equals("jmp")) {
				firstValue[m] = "nop";
				System.out.println(test(firstValue, secondValue));
				firstValue[m] = "jmp";
			}
			System.out.println();
			System.out.println(test(firstValue, secondValue));
			m++;
		}		
	}

	public static String test(String[] keys, int[] values) {
		List<Integer> list = new ArrayList<Integer>();
		int i = 0;
		String back = "";
		int accounter = 0;
		while(!list.contains(i)) {
			String k = keys[i];
			int v = values[i];
			list.add(i);
			if (k.equals("acc")) {
				accounter += v;
				i++;
			System.out.println(i + "is 1");
			}
			else if (k.equals("jmp")) {
				i += v;
			System.out.println(i + "is 2");
			}
			else {
				i++;
			System.out.println(i + "is 3");
			}
			System.out.println(i + " " + accounter);
			System.out.println(k + " + " + v);
		}
		if (i >= keys.length - 1) {
			back = "Success!";
			System.out.println(back + " " + accounter);
		}
		else {
			back = ":(";
		}
		return back;
	}
}
