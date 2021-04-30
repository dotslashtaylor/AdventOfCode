package adventofcode2020.seven;

import java.util.ArrayList;

public class Bag {
	public String identifier;
	public ArrayList<String> bagsContained;

	public Bag(String id, ArrayList<String> bags) {
		this.identifier = id;
		this.bagsContained = bags;
	}

}
