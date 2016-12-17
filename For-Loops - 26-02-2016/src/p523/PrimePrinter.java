package p523;

import java.util.Scanner;

public class PrimePrinter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int inputNumber = input.nextInt();
		System.out.print("All prime numbers up to " + inputNumber + ": \n");
		PrimeGenerator primeGen = new PrimeGenerator(inputNumber);
		primeGen.nextPrime();
		input.close();
	}
}
