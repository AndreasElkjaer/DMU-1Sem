package loops;

public class P51b {

	public static void main(String[] args) {
		// Sum between 2 - 100
		int i = 1;
		int sum = 0;
		while (i < 101) {
			sum += i * i;
			i++;

		}
		System.out.println("Test: " + sum);
	}

}
