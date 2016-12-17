package loops;

public class P51a {

	public static void main(String[] args) {
		// Sum between 2 - 100
		int i = 2;
		int sum = 0;
		while (i < 101) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
			i++;

		}
		System.out.println("Test: " + sum);
	}

}
