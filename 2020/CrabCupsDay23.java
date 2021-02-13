import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class CrabCupsDay23 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();

		ArrayList<Integer> labels = new ArrayList<Integer>();

		for (int i = 0; i < input.length(); i++) {
			labels.add(Character.getNumericValue(input.charAt(i)));
		}

		int firstCup;
		int currentCup1;
		int currentCup2;
		int currentCup3;
		int destinationCup = 0;
		int k;
		int location = 0;

		for (int i = 0; i < 10; i++) {
			k = i;
			while (k >= labels.size()) {
				k = k - labels.size();
			}

			firstCup = labels.get(k);
			System.out.println("first cup: " + firstCup);
			if (k >= labels.size() - 1) {
				currentCup1 = labels.get(0);
				currentCup2 = labels.get(1);
				currentCup3 = labels.get(2);

				labels.remove(2);
				labels.remove(1);
				labels.remove(0);
			}
	
			else if (k >= labels.size() - 2) {
				currentCup1 = labels.get(k + 1);
				currentCup2 = labels.get(0);
				currentCup3 = labels.get(1);
	
				labels.remove(k + 1);
				labels.remove(1);
				labels.remove(0);
			}
			else if (k >= labels.size() - 3) {
				currentCup1 = labels.get(k + 1);
				currentCup2 = labels.get(k + 2);
				currentCup3 = labels.get(0);
				labels.remove(k + 2);
				labels.remove(k + 1);
				labels.remove(0);
			}
			else {
				currentCup1 = labels.get(k + 1);
				currentCup2 = labels.get(k + 2);
				currentCup3 = labels.get(k + 3);
				labels.remove(k + 3);
				labels.remove(k + 2);
				labels.remove(k + 1);
			}
			System.out.println("current cups: " + currentCup1 + " " + currentCup2 + " " + currentCup3);
			for (int m = 0; m < labels.size(); m++) {
				if (labels.get(m) == firstCup - 1) {
					destinationCup = labels.get(m);
					location = m + 1;
				}
			}
			System.out.println(destinationCup);
			
			labels.add(location, currentCup3);
			labels.add(location, currentCup2);
			labels.add(location, currentCup1);
		
		for (int r = 0; r < labels.size(); r++) {
			System.out.print(labels.get(r));
		}
		System.out.println();
		}

		for (int i = 0; i < labels.size(); i++) {
			System.out.println(labels.get(i));
		}

	}
}
