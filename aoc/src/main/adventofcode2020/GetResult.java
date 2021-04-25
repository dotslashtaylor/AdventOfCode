public class getResult {

	public static void main(String[] args) {
		try {
			int day = Integer.parseInt(args[0]);
			runSolution(day);
		}
		catch(Exception exception) {
			parseStringArgs(args);
		}
	}

	public static void parseStringArgs(String[] args) {
		int day;
		switch(args[0]) {
			case "one":
				day = 1;
				break;
		}
	}

	public static void runSolution(int day) {

	}

}
