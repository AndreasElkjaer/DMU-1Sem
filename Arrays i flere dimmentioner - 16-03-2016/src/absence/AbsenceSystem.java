package absence;

import java.util.Arrays;

public class AbsenceSystem {
	/**
	 * Print the absence table on the screen
	 */
	public void printAbsence(int[][] absence) {
		System.out.println(Arrays.deepToString(absence));
	}

	/**
	 * Returns the total number of absent days for the given student during the
	 * last 12 months.
	 */
	public int totalAbsence(int[][] absence, int studentNumber) {
		int sum = 0;
		if (studentNumber < absence.length) {
			for (int col = 0; col < absence[studentNumber].length; col++) {
				sum += absence[studentNumber][col];
			}
		}
		return sum;
	}

	/**
	 * Returns the average monthly number of absent days for the given student.
	 */
	public double averageMonth(int[][] absence, int studentNumber) {
		double sum = 0.0;
		if (studentNumber < absence.length) {
			for (int col = 0; col < absence[studentNumber].length; col++) {
				sum += absence[studentNumber][col];
			}
		}
		return sum / 12;
	}

	/**
	 * Returns the number of students without any absence during the last 12
	 * months.
	 *
	 */
	public int studentWithoutAbsenceCount(int[][] absence) {
		int absenceSum = 0;
		int studentNoAbsence = 0;

		for (int i = 0; i < absence.length; i++) {
			for (int j = 0; j < absence.length; j++) {
				absenceSum += absence[i][j];
			}
			if (absenceSum == 0) {
				studentNoAbsence++;
			}
			absenceSum = 0;
		}

		return studentNoAbsence;
	}

	/**
	 * Returns the student with the most absence during the last 12 months. If
	 * more than one student has the most absence, return any one of them.
	 */
	public int mostAbsentStudent(int[][] absence) {
		int absenceSum = 0;
		int studentMostAbsence = 0;
		for (int i = 0; i < absence.length; ++i) {
			if (totalAbsence(absence, i + 1) > absenceSum) {
				absenceSum = totalAbsence(absence, i + 1);
				studentMostAbsence = i + 1;
			}
		}
		return studentMostAbsence;
	}

	/**
	 * Resets the absence to 0 for the given student during the last 12 months.
	 */
	public void reset(int[][] absence, int studentNumber) {
		for (int i = 0; i < absence[studentNumber - 1].length; ++i) {
			absence[studentNumber - 1][i] = 0;
		}
	}
}
