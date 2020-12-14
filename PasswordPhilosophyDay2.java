import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class PasswordPhilosophyDay2 {
	public static void main(String[] args) throws IOException {
		long startTime = System.nanoTime();
		Scanner in = new Scanner(new File("./inputs/input2"));
		String l;
		String[] str = new String[3];
		int counter = 0;
		int secondCounter = 0;
		int check = 0;
		String passwd = "";
		int min = 0;
		int max = 0;
		String range = "";
		char key = '0';

		while (in.hasNextLine()) {
			l = in.nextLine();
			str = l.split(" ");
			for (int i = 0; i < str.length; i++) {
				range = str[0];
				if (i == 0) {
					for (int k = 0; k < range.length(); k++) {
						if (range.charAt(k) == '-') {
							max = Integer.parseInt(range.substring(k + 1, range.length()));
							min = Integer.parseInt(range.substring(0, k));
						}
					}
				}
				if (i == 1) {
					key = str[i].charAt(0);
				}
				if (i == 2) {
					check = 0;
					passwd = str[i];
					for (int k = 0; k < passwd.length(); k++) {
						if (passwd.charAt(k) == key) {
							check++;
						}
					}
					if (check <= max && check >= min) {
						counter++;
					}
					check = 0;
				}
				if (passwd.charAt(min - 1) == key ^ passwd.charAt(max - 1) == key) {
					secondCounter++;
				}
			}
		}
		long endTime = System.nanoTime();
		System.out.println("PART ONE:");
		System.out.println("There are " + counter + " valid passwords");
		System.out.println("This solution took " + ((endTime - startTime) / (Math.pow(10, 9))) + " seconds.");
		System.out.println("PART TWO:");
		System.out.println("There are " + secondCounter + " valid passwords");
	}
}
				
