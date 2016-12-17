package loops;

public class P51c {

	public static void main(String[] args) {
		// Sum between 2 - 100
		int i = 0;
		double sum = 0;
		while (i < 21) {
			sum = Math.pow(2, i);
			System.out.println("Test: " + sum);
			i++;
		}
	}

}
