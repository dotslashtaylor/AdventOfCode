import java.io.*;
import java.util.*;

public class CustomCustoms {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input6"));
		int counter = 0;
		int c = 0;
		int index = 0;
		String l = "l";
		String k = "";
		Map<String, Integer> list = new TreeMap<String, Integer>();
		while (in.hasNextLine()) {
			l = in.nextLine();
			counter++;
			if (l.equals("")) {
				for (Map.Entry<String, Integer> entry : list.entrySet()) {
System.out.println(entry.getValue() + " + " + entry.getKey() + " + " + counter);			
					if (counter > 2 && (entry.getValue() >= counter - 2)) {
						c++;
					}
				}	
				if (counter < 3) {
					c = c + list.size();
				}
				counter = 0;
				list.clear();
				System.out.println(c);
System.out.println();
				index = 0;
			}
			else {
				for (int i = 0; i < l.length(); i++) {
					k = l.substring(i, i + 1);
					if (list.containsKey(k)) {
						index = (list.get(k) + 1);
					}
					list.put(k, index);
System.out.println(k + " " + index);
					index = 0;
				}
			}
		}
	System.out.println(c);
	}
}	 			
