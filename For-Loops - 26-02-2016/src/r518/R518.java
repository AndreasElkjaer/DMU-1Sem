package r518;

public class R518 {

	public static void main(String[] args) {

		// R5.18a
		/*
		 * int s = 1; for (int n = 1; n <= 5; n++) { s = s + n;
		 * System.out.println(s + " "); }
		 */
		// R5.18b
		/*
		 * int s = 1; for (int n = 1; s <= 10; System.out.print(s + " ")) { n =
		 * n + 2; s = s + n; }
		 */
		// R5.18c
		int s = 1;
		int n;
		for (n = 1; n <= 5; n++) {
			s = s + n;
			n++;
		}
		System.out.print(s + " " + n);

	}

}
