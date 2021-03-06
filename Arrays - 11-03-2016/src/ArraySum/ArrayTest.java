package ArraySum;

public class ArrayTest {
	public static void main(String[] args) {
		ArrayMethods method = new ArrayMethods();

		System.out.println(method.sum(new int[] { 4, 6, 7, 2, 3 })); // Get sum of the array

		int[] test2 = method.createSum(new int[] { 4, 6, 7, 2, 3 }, new int[] { 3, 0, 9, 5, 5 }); // Creates new array with sum of (4+3) (6+0).. 
		for (int i : test2) {
			System.out.print(i + ", ");
		}
		System.out.println();
		System.out.println(method.hasUneven(new int[] { 3, 0, 9, 5, 5 })); // checks if the array has uneven numbers
	}
}
