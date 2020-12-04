import java.util.*;
import java.io.*;

public class Pop {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input"));
		PrintWriter out = new PrintWriter(new FileWriter("check"));
		List<String> lines = new ArrayList<String>();
		List<Integer> missing = new ArrayList<Integer>();
		List<Integer> index = new ArrayList<Integer>();

		String l = "1";
		int counter = 0;
		int later = 0;
		int other = 0;
		int another = 0;

		while (in.hasNextLine()) {
			l = in.nextLine();
			lines.add(l);
		}

		int r = 0;
		for (int i = 0; i < lines.size(); i++) {
			l = lines.get(i);
			index.add(i);
			for (int k = 0; k < l.length(); k++) {
				if (l.charAt(k) == ':') {
					other++;
				}
			}
			counter = counter + other;
			if (other == 0) {
				if (counter < 8) {
					for (int rns = 0; rns < index.size(); rns++) {
					missing.add(rns);
					}
				index.clear();
				}
				else {
					another = another + counter;
					later++;
					index.clear();
				}
				counter = 0;
			}
			other = 0;
		}
		int n = missing.size() - 1;
		while (n >= 0) {
			r = missing.get(n);
			lines.remove(r);
			n--;
		}
		for (int k = 0; k < lines.size(); k++) {
			out.println(lines.get(k));
		}
		System.out.println(later + "+" + another);
		out.close();
	}
}


