import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Day2 {

public static void main(String[] args) throws FileNotFoundException {
	
	Scanner scr = new Scanner(new File("input2"));
	Pattern delimPattern = Pattern.compile("[\\:\\-\\s]");
	scr.useDelimiter(delimPattern);
	
	Pattern charPattern = Pattern.compile("\\w");
	
	int numValid1 = 0;
	int numValid2 = 0;
	
	while(scr.hasNextLine()) {
		
		int lowBd = scr.nextInt();
		int highBd = scr.nextInt();
		String key = scr.next(charPattern);
		String buffer = scr.next();
		String line = scr.nextLine(); // For some reason this line gets " [password]"
					
		// ============= PART ONE ============== //
		int count = 0;
		for(int i = 0; i < line.length(); i++) {
			if(line.charAt(i) == key.charAt(0))
				count++;
		}
		
		if(count >= lowBd && count <= highBd)
			numValid1++;
					
		// ============= PART TWO ============== //
		// the extra space at the start of each line from the scanner allows me to use the bounds as exact indexes to check
		if(line.charAt(lowBd) == key.charAt(0) ^ line.charAt(highBd) == key.charAt(0))
			numValid2++;
		
	}
	
	System.out.println("The total number of valid passwords in part 1 is: " + numValid1);
	System.out.println("The total number of valid passwords in part 2 is: " + numValid2);

	
	scr.close();
	
}

}
