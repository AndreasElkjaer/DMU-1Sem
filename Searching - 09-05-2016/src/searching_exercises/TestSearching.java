package searching_exercises;

import java.util.Arrays;

public class TestSearching {

	public static void main(String[] args) {

		// Test for exercise 1
		int[] array1 = { 2, 4, 8, 2 };
		int[] array2 = { 7, 56, 34, 3, 7, 14, 13, 4 };
		int[] array3 = { 7, 1, 1, 10 };
		System.out.println("Array: " + Arrays.toString(array1));
		System.out.println("Are there uneven numbers in the array? " + Searching.findUneven(array1));
		array1[2] = 15;
		System.out.println("Array: " + Arrays.toString(array1));
		System.out.println("Are there uneven numbers in the array? " + Searching.findUneven(array1));
		System.out.println();
		// exercise 2
		System.out.println("Heltal: " + Searching.findHeltal(array2, 10, 15));
		// exercise 3
		System.out.println(Searching.sameRange(array3));

		// TODO: test exercise 2-7
	}

}
