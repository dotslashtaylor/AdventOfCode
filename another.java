import java.io.*;
import java.util.*;

public class another {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("check"));
		String l = "1";
		int j = 0;
		while (in.hasNextLine()) {
			l = in.nextLine();
			if (l.equals("")){
				j++;
			}
		}
		System.out.println(j);
	}
}
