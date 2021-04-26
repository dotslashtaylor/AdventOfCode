package adventofcode2020.two; 

public class Row {
	int[] passwordRange;
	char letter;
	String password;

	public Row() {

	}

	public Row(int[] passwordRange, char letter, String password) {
		this.passwordRange = passwordRange;
		this.letter = letter;
		this.password = password;
	}

}
