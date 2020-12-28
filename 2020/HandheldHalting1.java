import java.io.*;
import java.util.*;

public class HandheldHalting1 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input8"));
		List<String> keys = new ArrayList<String>();
		List<String> values = new ArrayList<String>();
		String l = "";
		String first = "";
		String second = "";
		String[] arr = new String[2];
		int accounter = 0;
		int diff = 0;
		int v = 0;
		String k = "";
		List<Integer> list = new ArrayList<Integer>();
		int i = 0;

		while (in.hasNextLine()) {
			l = in.nextLine();
			arr = l.split(" ");
			first = arr[0];
			second = arr[1];
			keys.add(first);
			values.add(second);
		}

		k = keys.get(i);
		v = Integer.parseInt(values.get(i));

		while (!list.contains(i)) {
			list.add(i);
			System.out.println(accounter + ", " + i);
			if (k.equals("acc")) {
				accounter += v;
				i++;
			}
			else if (k.equals("jmp")) {
				i += v;
			}
			else {
				i++;
			}
			k = keys.get(i);
			v = Integer.parseInt(values.get(i));
		}
		System.out.println(accounter);
	}
}
