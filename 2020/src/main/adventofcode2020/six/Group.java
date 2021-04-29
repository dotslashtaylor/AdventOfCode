package adventofcode2020.six;

import java.util.HashMap;

public class Group {

	private String rawString;
	private int size;
	private HashMap<Character, Integer> charCountMap;

	public Group(String questions, int groupSize) {
		this.charCountMap = new HashMap<>();
		this.rawString = questions;
		this.size = groupSize;
		String[] questionArray = rawString.split("\n");
		for (String question : questionArray) {
			for (int i = 0; i < question.length(); i++) {
				char k = question.charAt(i);
				if (k != ' ') {
					if (charCountMap.containsKey(k)) {
						int newCount = charCountMap.get(k) + 1;
						charCountMap.put(k, newCount);
					}
					else {
						charCountMap.put(k, 0);
					}
				}
			}
		}
	}

	public int getQuestionSetSize() {
		return charCountMap.size();
	}

	public int getSize() {
		return size;
	}

	public int getUnanimousSize() {
		int count = 0;
		for (int i : charCountMap.values()) {
			if (i >= size - 1) {
				count++;
			}
		}
		return count;
	}

}
