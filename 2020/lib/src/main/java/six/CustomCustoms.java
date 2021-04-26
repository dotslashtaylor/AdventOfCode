package adventofcode2020.six;

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class CustomCustoms {

	public static String[] getData(String relativePath){
		ArrayList<String> tempQuestions = new ArrayList<>();
		String[] questions = new String[1];
		try {
			File dataFile = new File(relativePath);
			Scanner scan = new Scanner(dataFile);
			// empty lines == ""
			String groupQ = "";
			while (scan.hasNextLine()) {
				String nextline = scan.nextLine();
				if (nextline.equals("")) {
					tempQuestions.add(groupQ);
					groupQ = "";
					continue;
				}
				groupQ = groupQ + nextline;
			}
			tempQuestions.add(groupQ);
			questions = new String[tempQuestions.size()];
			int i = 0;
			for (String question : tempQuestions) {
				questions[i] = question;
				i++;
			}
		}
		catch (Exception exception) {
			System.err.println(exception);
			System.exit(1);
		}
		return questions;
	}

	public static int[] getGroupSizes(String relativePath) {
		int[] groupSizes = new int[1];
		ArrayList<Integer> templist = new ArrayList<>();
		try {
			File dataFile = new File(relativePath);
			Scanner scan = new Scanner(dataFile);
			int countLines = 0;
			int currentGroupSize = 0;
			while (scan.hasNextLine()) {
				String tempStr = scan.nextLine();
				if (tempStr.equals("")) {
					templist.add(currentGroupSize);
					currentGroupSize = 0;
					continue;
				}
				currentGroupSize += 1;
			}
			templist.add(currentGroupSize);
			groupSizes = new int[templist.size()];
			int i = 0;
			for (int group : templist) {
				groupSizes[i] = group;
				i++;
			}
		}
		catch (Exception exception) {
			System.err.println(exception);
			System.exit(1);
		}
		return groupSizes;
	}


	public static int partOne(String[] answers) {
		int numberOfQuestions = 0;
		for (String answer : answers) {
			HashSet<Character> questionSet = new HashSet<Character>();
			for (int i = 0; i < answer.length(); i++) {
				questionSet.add(answer.charAt(i));
			}
			numberOfQuestions += questionSet.size();
		}
		return numberOfQuestions;
	}

	public static int partTwo(String[] groups, int[] groupSizes) {
		int numberOfQuestions = 0;
		for (int i = 0; i < groups.length; i++) {
			HashMap<Character, Integer> questionCount = new HashMap<>();
			if (groupSizes[i] == 1) {
				numberOfQuestions += groups[i].length();
				continue;
			}
			for (int j = 0; j < groups[i].length(); j++) {
				questionCount.putIfAbsent(groups[i].charAt(j), 0);
			}
			for (int j = 0; j < groups[i].length(); j++) {
				int newCount = 0;
				if (questionCount.containsKey(groups[i].charAt(j))) {
					newCount = questionCount.get(groups[i].charAt(j)) + 1;
				}
				questionCount.replace(groups[i].charAt(j), newCount);
			}
			int count = 0;
			for (Character j : questionCount.keySet()) {
				if (questionCount.get(j) == groupSizes[i]) {
					count += 1;
				}
			}
			numberOfQuestions += count;
		}
		return numberOfQuestions;
	}

}
