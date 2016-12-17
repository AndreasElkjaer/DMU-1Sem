package arraydouble;

import java.util.Arrays;

public class ArrayDoubleMethods {

	public int sumRow(int[][] numbers, int row) {
		int sum = 0;
		if (row < numbers.length) {
			for (int col = 0; col < numbers[row].length; col++) {
				sum += numbers[row][col];
			}
		}
		return sum;
	}

	public int sumColumn(int[][] numbers, int column) {
		int sum = 0;
		if (column < numbers.length) {
			for (int[] row : numbers) {
				if (column < row.length) {
					sum += row[column];
				}
			}
		}
		return sum;
	}

	public String print(int[][] numbers) {
		return Arrays.deepToString(numbers);
	}

	public int sum(int[][] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				sum += numbers[i][j];
			}
		}
		return sum;
	}
}