import java.io.*;
import java.util.*;

public class HandyHaversacks {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input7"));
		String rule = "";
		int counter = 0;
		List<String> set = new ArrayList<String>();

		while (counter < 10) {
			rule = in.nextLine();
			separate(rule);
			counter++;
		}
		
		System.out.println(counter);
	}

	public static void separate(String rule) {
		rule = rule.replaceAll("bags contain ", "bag");
		rule = rule.replaceAll("bags", " bag");
		rule = rule.replaceAll("bags.", " bag");
		rule = rule.replaceAll("bag.", " bag");
		rule = rule.replaceAll("bag, ", " bag");
		rule = rule.replaceAll("bags, ", " bag");
		String str[] = rule.split("bag//");
		for (String s : str) {
			System.out.println(s);
		}
	}

}
