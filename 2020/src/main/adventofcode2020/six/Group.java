package adventofcode2020.six;

import java.util.HashSet;
import java.util.HashMap;

public class Group {

	private int size;
	private HashMap<Character, Integer> questionSet;

	public Group(String questions) {
		questionSet = new HashMap<>();
		String[] questionArray = questions.split(" ");
		size = questionArray.length;
		for (String question : questionArray) {
			for (int i = 0; i < question.length(); i++) {
				char k = question.charAt(i);
				questionSet.putIfAbsent(k, 0);
				int newCount = questionSet.get(k) + 1;
				questionSet.replace(k, newCount);
			}
		}
	}

	public int getQuestionSetSize() {
		return questionSet.size();
	}

	public int getSize() {
		return size;
	}

	public int questionFreq(char j) {
		return questionSet.get(j);
	}

	public int getUnanimousSize() {
		int count = 0;
		for (char k : questionSet.keySet()) {
			if (questionFreq(k) >= size) {
				count++;
			}
		}
		return count;
	}

}
