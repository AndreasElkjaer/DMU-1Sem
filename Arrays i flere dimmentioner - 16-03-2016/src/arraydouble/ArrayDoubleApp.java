package arraydouble;

public class ArrayDoubleApp {
	public static void main(String[] args) {
		int[][] numbers = new int[][]

		{ { 3, 3, 1, 0, 1 }, { 0, 0, 9, 7, 1 }, { 5, 5, 9, 9, 1 }, { 7, 1, 1, 1, 7 }, { 1, 3, 5, 7, 9 }

		};
		ArrayDoubleMethods methods = new ArrayDoubleMethods();
		System.out.println(methods.sumRow(numbers, 1));
		System.out.println(methods.sumColumn(numbers, 1));
		System.out.println(methods.print(numbers));
		System.out.println(methods.sum(numbers));
	}
}
