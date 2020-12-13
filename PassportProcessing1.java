import java.util.*;
import java.io.*;

public class PassportProcessing1 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input2"));
		PrintWriter out = new PrintWriter(new FileWriter("output"));
		List<String> lines = new ArrayList<String>();
		List<Integer> missing = new ArrayList<Integer>();

		String l = "1";
		int counter = 0;
		int later = 0;
		int other = 0;
		while (in.hasNextLine()) {
			l = in.nextLine();
			lines.add(l);
		}
		int r = 0;
		for (int i = 0; i < lines.size(); i++) {
			l = lines.get(i);
			for (int k = 0; k < l.length(); k++) {
				if (l.charAt(k) == ':') {
					other++;
				}
			}
			counter = counter + other;	
			System.out.println(other + ", " + counter + " " + l);
			if (other == 0) {
				if (counter < 8) {
					missing.add(i);
				}
				else {
					later++;
				}
				counter = 0;
			}
			other = 0;
		}
		for (int m = 0; m < lines.size(); m++) {
			out.println(lines.get(m));
		}
		int n = missing.size() - 1;
		while (n >= 0) {
			r = missing.get(n);
			lines.remove(r);
			n--;
		}
		System.out.println(later + "+" + lines.size());
	}
}


