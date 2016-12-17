package opgave2;

public class ArrayMethods {
	public int sum(int[] array) {
		int sum = 0;
		for (int item : array) {
			sum += item;
		}
		return sum;
	}

	public int[] createSum(int[] a, int[] b) {
		int[] c = new int[a.length];
		for (int i = 0; i < a.length; ++i) {
			c[i] = a[i] + b[i];
		}
		return c;
	}

	public boolean hasUneven(int[] t) {
		boolean even = false;
		int[] ttest = new int[t.length];
		for (int i = 0; i < t.length; i++) {
			if (ttest[i] % 2 == 0) {
				even = true;
			} else {
				even = false;
			}
		}
		return even;
	}
}
