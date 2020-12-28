import java.util.*;
import java.io.*;

public class PasswordPhilosophy1 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input2"));
		String l;
		String[] str = new String[3];
		int counter = 0;
		int check = 0;
		String passwd = "";
		int min = 0;
		int max = 0;
		String letter = "";
		char key = '0';

		while (in.hasNextLine()) {
 			l = in.nextLine();
			str = l.split(" ");
			for (int k = 0; k < str.length; k++) {
				letter = str[0];	
				if (k == 0) {
					for (int m = 0; m < letter.length(); m++) {
						if (letter.charAt(m) == '-') {
							max = Integer.parseInt(letter.substring(m + 1, letter.length()));
							min = Integer.parseInt(letter.substring(0, m));
						}
					}
				}
				if (k == 1) {
					key = str[k].charAt(0);
				}
				if (k == 2) {
					check = 0;
					passwd = str[k];
					System.out.println(passwd);
					for (int m = 0; m < passwd.length(); m++) {
						if (passwd.charAt(m) == key) {
							check++;
						}
					}
					System.out.println(check);
					if (check <= max && check >= min) {
						counter++;
					}
				}
			}
			System.out.println(counter);
		}
	}
}
