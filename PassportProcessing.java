import java.io.*;
import java.util.*;

public class PassportProcessing {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input4"));
		List<String> lines = new ArrayList<String>();
		List<String> fields = new ArrayList<String>();
		String l = "1";
		String s = "";
		int counter = 0;
//		while (in.hasNextLine()) {
			if (!l.equals("")) {
				l = in.nextLine();
				lines.add(l);
			}
			counter++;
			for (int k = 0; k  < lines.size(); k++) {
				fields = Arrays.asList(s.split(" "));	
				for (int i = 0; i < fields.size(); i ++) {
				System.out.println(fields.get(i));
				}
			}
			in.nextLine();
			lines.clear();
//		}
		System.out.println(counter + " " + lines.size());
	}
}								
