package p523;

public class PrimeGenerator {

	private int number;

	public PrimeGenerator(int number) {
		this.number = number;
	}

	public boolean isPrime(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public void nextPrime() {
		for (int i = 2; i <= this.number; i++) {
			if (isPrime(i) == true) {
				System.out.println(i);
			}
		}
	}

}