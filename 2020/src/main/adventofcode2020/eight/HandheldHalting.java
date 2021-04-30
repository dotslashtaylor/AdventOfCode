package adventofcode2020.eight;

import adventofcode2020.Solution;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.io.File;

public class HandheldHalting extends Solution<Integer, Instruction> {

	public HandheldHalting() {
		inputRelPath = "./resources/inputs/day8.txt";
		identifier = "Day Eight: HandheldHalting";
	}

	public ArrayList<Instruction> getData() {
		ArrayList dataList = new ArrayList();
		try {
			File dataFile = new File(inputRelPath);
			Scanner scan = new Scanner(dataFile);
			int i = 0;
			while (scan.hasNextLine()) {
				i++;
				String currentLine = scan.nextLine();
				String[] textInstruction = currentLine.split(" ");
				String op = textInstruction[0];
				int arg = Integer.parseInt(textInstruction[1]);
				dataList.add(new Instruction(op, arg));
			}
		}
		catch(Exception exception) {
			System.err.println(exception);
			System.exit(1);
		}
		return dataList;
	}

	public Integer partOne(ArrayList<Instruction> dataList) {
		int solution = 0;
		boolean repeated = false;
		int i = 0;
		HashSet<Integer> actions = new HashSet<>();
		while (!repeated) {
			if (actions.contains(i)) {
				repeated = true;
				break;
			}
			else {
				actions.add(i);
			}
			Instruction currentInstruction = dataList.get(i);
			String command = currentInstruction.operation;
			int value = currentInstruction.argument;
			switch (command) {
				case "acc":
					solution = solution + value;
					i++;
					break;
				case "jmp":
					i = i + value;
					break;
				default:
					i++;
					break;
			}
		}
		return solution;
	}

	public Instruction changeInstruction(Instruction instr) {
		Instruction newInstruction = instr;
		if (instr.operation == "jmp") {
			newInstruction = new Instruction("nop", instr.argument);
		}
		else if (instr.operation == "nop") {
			newInstruction = new Instruction("jmp", instr.argument);
		}
		return newInstruction;
	}

	public ArrayList<Instruction> fixTheInstructions(ArrayList<Instruction> dataList) {
		ArrayList<Instruction> solution = dataList;
		for (int i = 0; i < dataList.size(); i++) {
			ArrayList<Instruction> modifiedList = new ArrayList<Instruction>();
			for (int k = 0; k < dataList.size(); k++) {
				Instruction currentInstruction = dataList.get(k);
				if (k == i) {
					currentInstruction = changeInstruction(currentInstruction);
				}
				modifiedList.add(currentInstruction);
			}
			boolean terminates = false;

			terminates = willTerminate(modifiedList);

			if (terminates) {
				solution = modifiedList;
				break;
			}
		}
		return solution;
	}

	public boolean willTerminate(ArrayList<Instruction> dataList) {
		boolean solution = false;	
		boolean repeated = false;
		int i = 0;
		HashSet<Integer> actions = new HashSet<>();
		while (!repeated) {
			if (actions.contains(i)) {
				repeated = true;
				break;
			}
			else if (i >= dataList.size() - 1) {
				solution = true;
				break;
			}
			else {
				actions.add(i);
			}
			Instruction currentInstruction = dataList.get(i);
			String command = currentInstruction.operation;
			int value = currentInstruction.argument;
			switch (command) {
				case "jmp":
					i = i + value;
					break;
				default:
					i++;
					break;
			}
		}
		return solution;
	}

	public Integer partTwo(ArrayList<Instruction> dataList) {
		int solution = 0;
		dataList = fixTheInstructions(dataList);
		boolean repeated = false;
		int i = 0;
		while (i != dataList.size()) {
			Instruction currentInstruction = dataList.get(i);
			String command = currentInstruction.operation;
			int value = currentInstruction.argument;
			switch (command) {
				case "acc":
					solution = solution + value;
					i++;
					break;
				case "jmp":
					i = i + value;
					break;
				default:
					i++;
					break;
			}
		}
		return solution;
	}

}
