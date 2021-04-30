package adventofcode2020.eight;

public class Instruction {

	public String operation;
	public int argument;

	public Instruction(String op, int arg) {
		this.operation = op;
		this.argument = arg;
	}

	public Instruction(String full) {
		this.operation = full.split(" ")[0];
		this.argument = Integer.parseInt(full.split(" ")[1]);
	}

	public String toString() {
		char sign = '+';
		String str = operation + " " + argument;
		if (argument > 0) {
			str = operation + " " + sign + argument;
		}
		return str;
	}

}
