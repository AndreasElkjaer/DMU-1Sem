package loops;

import java.util.Scanner;

public class P51e {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Number: ");
		int number = input.nextInt();
		int sum = 0;

		while (number > 0) {
			int tal = number % 10;
			if (tal % 2 != 0) {
				sum += tal;
			}
			number /= 10;
		}
		System.out.println("Sum: " + sum);
		input.close();
	}

}
