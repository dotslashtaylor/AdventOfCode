public class ReportRepair {

	public static int partOne(int[] expenseReport) {

		int h = 0, i = 1;
		while (expenseReport[h] + expenseReport[i] != 2020) {
			i += 1;
			if (i == expenseReport.length) {
				h += 1;
				i = h + 1;
			}
		}
		return expenseReport[h] * expenseReport[i];
	}


	public static int partTwo(int[] expenseReport) {

		int h = 0, i = 1, j = 2;

		while (expenseReport[h] + expenseReport[i] + expenseReport[j] != 2020) {
			j += 1;
			if (j == expenseReport.length) {
				i += 1;
				j = i + 1;

				if (i == expenseReport.length - 1) {
					h += 1;
					i = h + 1;
					j = i + 1;
				}
			}
		}
		return expenseReport[h] * expenseReport[i] * expenseReport[j];
	}
}
