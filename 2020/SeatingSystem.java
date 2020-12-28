import java.util.*;
import java.io.*;

public class SeatingSystem {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input.11"));
		String l = "";
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		ArrayList<Character> cares = new ArrayList<Character>();

		while (in.hasNextLine()) {
			l = in.nextLine();
			for (int n = 0; n < l.length(); n++) {
				cares.add(l.charAt(n));
			}
		}
		int s = cares.size();	
		char[] arr = new char[s];

		for (int n = 0; n < s; n++) {
			arr[n] = cares.get(n);
		}
int hash = 0;
int rowLength = l.length();
int mark1 = hash;
int mark2 = 100;
int mark3 = 200;
int mark4 = 300;
int occupied = 0;
int k = 0;
boolean check = true;
	while (mark1 != mark2 || mark1 != mark3 || mark1 != mark4) {
		for (int n = 0; n < s; n++) {
			System.out.print(arr[n]);
			if (arr[n] == 'L') {
				occupied = checkL(arr, n, rowLength);
				if (occupied == 1) {
					list.add(n);
					hash++;
				}
			}
			else if (arr[n] == '#') {
				check = checkO(arr, n, rowLength);
				// System.out.println(occupied);
				if (check == true) {
					list2.add(n);
				}
				else {
					hash++;
				}
			}
			k++;
			if (k % rowLength == 0) {
				System.out.println();
			}
		}
		mark4 = mark3;
		mark3 = mark4;
		mark2 = mark1;
		mark1 = hash;
		System.out.println();
		System.out.println(mark1 + " " + mark2 + " " + mark3 + " " + mark4);
		for (int n = 0; n < list.size(); n++) {
			k = list.get(n);
			if (arr[k] == '#') {
				arr[k] = 'L';
			}
			else {
				arr[k] = '#';
			}
		}
		list.clear();
		list2.clear();
		hash = 0;
		k = 0;
	}
}

	public static int checkL(char[] arr, int n, int rowLength) {
		int value = 0;
		int left = n - 1;
			if (left > 0) {
				while (arr[left] == '.') {
					if (left > 0) {
						left--;
					}
				}
			}
		int right = n + 1;
			if (right < rowLength) {
				while (arr[right] == '.') {
					if (right < rowLength) {
						right++;
					}
				}
			}
		int above = n - rowLength;
			if (above >= 0) {
				if (arr[above] == '.') {
					if (above - rowLength >= 0) {	
						above -= rowLength;
					}
				}
			}
		int below = n + rowLength;
			if (below < (arr.length / rowLength)) {
				if (arr[below] == '.') {
						below += rowLength;
				}
			}
char leftPoint = '0';
char rightPoint = '0';
char abovePoint = '0';
char belowPoint = '0';
		if (left < 0) {
			leftPoint = 'L';
		}
		else {
			leftPoint = arr[left];
		}
		if (right > rowLength - 1) {
			rightPoint = 'L';
		}
		else {
			rightPoint = arr[right];
		}
		if (below > arr.length / rowLength - 1) {
			belowPoint = 'L';
		}
		else {
			belowPoint = arr[below];
		}
		if (above < 0) {
			abovePoint = 'L';
		}
		else {
			abovePoint = arr[above];
		}
			
		if (abovePoint != '#' && belowPoint != '#' && rightPoint != '#' && leftPoint != '#') {
			value = 1;
		}
		else {
			value = 0;
		}
		return value;
	}

	public static boolean checkO(char[] arr, int n, int rowLength) {
		boolean check = true;
		int left = n - 1;
			if (left > 0) {
				while (arr[left] == '.') {
					if (left > 0) {
						left--;
					}
				}
			}
		int right = n + 1;
			if (right < rowLength) {
				while (arr[right] == '.') {
					if (right < rowLength) {
						right++;
					}
				}
			}
		int above = n - rowLength;
			if (above >= 0) {
				if (arr[above] == '.') {
					if (above - rowLength >= 0) {	
						above -= rowLength;
					}
				}
			}
		int below = n + rowLength;
			if (below < (arr.length / rowLength)) {
				if (arr[below] == '.') {
						below += rowLength;
				}
			}
char leftPoint = '0';
char rightPoint = '0';
char abovePoint = '0';
char belowPoint = '0';
		if (left < 0) {
			leftPoint = 'L';
		}
		else {
			leftPoint = arr[left];
		}
		if (right > rowLength - 1) {
			rightPoint = 'L';
		}
		else {
			rightPoint = arr[right];
		}
		if (below > arr.length / rowLength - 1) {
			belowPoint = 'L';
		}
		else {
			belowPoint = arr[below];
		}
		if (above < 0) {
			abovePoint = 'L';
		}
		else {
			abovePoint = arr[above];
		}
		if (left < 0) {
			leftPoint = 'L';
		}
		else {
			leftPoint = arr[left];
		}
		if (right > rowLength - 1) {
			rightPoint = 'L';
		}
		else {
			rightPoint = arr[right];
		}
		if (below > arr.length / rowLength - 1) {
			belowPoint = 'L';
		}
		else {
			belowPoint = arr[below];
		}
		if (above < 0) {
			abovePoint = 'L';
		}
		else {
			abovePoint = arr[above];
		}
			
		if (abovePoint == '#' || belowPoint == '#' || rightPoint == '#' || leftPoint == '#') {
			check = true;
		}
		else {
			check = false;
		}
		return check;
	}
}
