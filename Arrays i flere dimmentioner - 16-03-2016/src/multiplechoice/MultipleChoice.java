package multiplechoice;

public class MultipleChoice {
	private char[] correctAnswer = { 'B', 'C', 'A', 'A', 'B', 'A', 'C', 'D', 'A', 'C' };
	private char[][] studentAnswers;

	public MultipleChoice(int numberOfStudents) {
		studentAnswers = new char[numberOfStudents][10];
		for (int i = 0; i < studentAnswers.length; i++) {
			for (int j = 0; j < studentAnswers[i].length; j++) {
				int tal = (int) (Math.random() * 4); // tilfældigt tal fra 0-3
				char c = (char) (tal + 'A'); // laver tallet om til en char fra
												// A-C
				studentAnswers[i][j] = c;
			}
		}
	}

	public void printStudentAnswers() {
		for (int i = 0; i < studentAnswers.length; i++) {
			System.out.print("Student " + (i + 1) + " resultat: ");
			for (int j = 0; j < studentAnswers[i].length; j++) {
				if (j != 0) {
					System.out.print(", ");
				}
				System.out.print(studentAnswers[i][j]);
			}
			System.out.println();
		}
	}

	/**
	 * Udskriver for hver studerende antallet af rigtige svar
	 */
	public void printCorrectAnswersPrStudent() {
		for (int i = 0; i < studentAnswers.length; i++) {
			int sum = 0;
			for (int j = 0; j < studentAnswers[i].length; j++) {
				if (studentAnswers[i][j] == correctAnswer[j]) {
					sum++;
				}
			}
			System.out.println(sum);
		}
	}

	/**
	 * Udskriver for hvert spørgsmål antallet af rigtige svar
	 */
	public void printCorrectAnswerPrQuestion() {
		System.out.println("-");
		for (int ans = 0; ans < studentAnswers[0].length; ans++) {
			int sum = 0;
			for (int stu = 0; stu < studentAnswers.length; stu++) {
				if (correctAnswer[ans] == studentAnswers[stu][ans]) {
					sum++;
				}
			}
			System.out.println(sum);
		}
	}

}
