package src.example.Child;

import java.util.Scanner;

public class P47 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double n1 = input.nextDouble();
		double n2 = input.nextDouble();
		double n3 = input.nextDouble();
		if ((n1 <= n2 && n2 < n3) || (n1 < n2 && n2 <= n3) || (n1 > n2 && n2 >= n3) || (n1 >= n2 && n2 > n3)) {
			System.out.println("In order");
		} else {
			System.out.println("Not in order");
		}
		input.close();
	}
}
