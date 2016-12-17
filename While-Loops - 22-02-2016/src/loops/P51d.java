package loops;

import java.util.Scanner;

public class P51d {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("A:");
		int a = input.nextInt();
		System.out.println("B:");
		int b = input.nextInt();
		int sum = 0;
		while (a <= b) {
			if (a % 2 != 0) {
				sum += a;
			}
			a++;
		}
		System.out.println("Sum: " + sum);
		input.close();
	}

}
