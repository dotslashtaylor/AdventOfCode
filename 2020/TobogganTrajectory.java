import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class TobogganTrajectory {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("./inputs/input3"));
		int counter = 0;
		int x = 1;
		String k = "";
		
		while(in.hasNextLine()) {
			k = in.nextLine();
			if (x > k.length()) {
				x = x - k.length();
			}

			if (k.charAt(x - 1) == '#') {
				counter++;
			}
			
			x += 3;
		}
		System.out.println(counter);
	}
}	
