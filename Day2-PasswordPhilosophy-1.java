import java.util.*;
import java.io.*;

public class solution {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input"));
		String l;
		String[] str = new String[4];
		int i = 0;
		int counter = 0;
		int check = 0;
		String passwd;
		int min;
		int max;
		String letter;

		while (in.hasNextLine()) {
 			l = in.nextLine();
			str = l.split("-|\\s|\\: ");
			min = Integer.parseInt(str[0]);
			max = Integer.parseInt(str[1]);
			letter = str[2];
			passwd = str[3];
			while (i < passwd.length()) {
				if (letter.charAt(0) == passwd.charAt(i)) {
					check++;
				}
				i++;
			}

			if (check <= max && check >= min) {
				counter++;
			}
			System.out.println(min + " " + max + " " + letter + " " + passwd + " " + check + " " + counter);
			i = 0;
			check = 0;
		}
		
		System.out.println(counter);
	}
}
