import java.io.*;
import java.util.*;

public class CustomCustoms {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input6"));
		int counter = 0;
		String l = "l";
		String k = "";
		Map<String, Integer> list = new TreeMap<String, Integer>();
		while (in.hasNextLine()) {
			l = in.nextLine();
			if (l.equals("")) {
				l = in.nextLine();
				counter = counter + list.size();
				list.clear();
				System.out.println(counter);
			}
			for (int i = 0; i < l.length(); i++) {
				k = l.substring(i, i + 1);
				list.put(k, i);
				System.out.print(k);
			}
		}
	counter = counter + list.size();
	System.out.println(counter);
	}
}	 			
