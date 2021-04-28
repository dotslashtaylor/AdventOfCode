package adventofcode2020.six;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Iterator;


public class Group {

	private String rawString;
	private int size;
	private HashSet<Character> questionSet;
	private ArrayList<Character> questionList;

	public Group(String questions) {
		rawString = questions.substring(1);
		questionSet = new HashSet<>();
		questionList = new ArrayList<>();
		String[] questionArray = rawString.split(" ");
		size = questionArray.length;
		for (String question : questionArray) {
			for (int i = 0; i < question.length(); i++) {
				char k = question.charAt(i);
				questionSet.add(k);
				questionList.add(k);
			}
		}
	}

	public int getQuestionSetSize() {
		return questionSet.size();
	}

	public int getSize() {
		return size;
	}

	public int getUnanimousSize() {
		int count = 0;
		Iterator<Character> charIterator = questionSet.iterator();
		while (charIterator.hasNext()) {
			int charCount = 0;
			char now = charIterator.next();
			for (char c : questionList) {
				if (c == now) {
					charCount++;
				}
			}
			if (charCount == size) {
				count++;
			}
		}
		return count;
	}

}
