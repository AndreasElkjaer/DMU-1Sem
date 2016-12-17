package searching_exercises;

public class Searching {

	public static boolean findUneven(int[] tabel) {
		boolean found = false;
		int i = 0;
		while (!found && i < tabel.length) {
			int k = tabel[i];
			if (k % 2 != 0) {
				found = true;
			} else {
				i++;
			}
		}
		return found;
	}

	public static int findHeltal(int[] tabel, int start, int end) {
		int i = 0;
		int answer = -1;
		while (answer == -1 && i < tabel.length) {
			if (tabel[i] >= start && tabel[i] <= end) {
				answer = tabel[i];
			} else {
				i++;
			}
		}
		return answer;

	}

	public static boolean sameRange(int[] tabel) {
		boolean found = false;
		int i = 0;
		while (!found && i < (tabel.length - 1)) {
			if (tabel[i] == tabel[i + 1]) {
				found = true;
			} else {
				i++;
			}
		}
		return found;
	}

	// TODO: exercise 2-7
}
