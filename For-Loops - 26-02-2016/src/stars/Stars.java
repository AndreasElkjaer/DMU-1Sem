package stars;

public class Stars {
	final int MAX_ROWS = 10;

	public void starPicture() {
		for (int row = 1; row <= MAX_ROWS; row++) {
			for (int star = 1; star <= row; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void starPictureA() {
		for (int row = 1; row <= MAX_ROWS; row++) {
			for (int star = 10; star >= row; star--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void starPictureB() {
		for (int row = 0; row < MAX_ROWS; row++) {
			int move = MAX_ROWS - row - 1;

			for (int space = 0; space < move; space++) {
				System.out.print(" ");
			}

			for (int star = 0; star < MAX_ROWS - move; star++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

	public void starPictureC() {
		for (int row = 0; row < MAX_ROWS; row++) {
			int move = MAX_ROWS - row;

			for (int space = 10; space > move; space--) {
				System.out.print(" ");
			}

			for (int star = 10; star > MAX_ROWS - move; star--) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

	public void starPictureD() {
		for (int row = 0; row < MAX_ROWS; row++) {
			int move = MAX_ROWS - row - 1;

			for (int space = 0; space < move; space++) {
				System.out.print(" ");
			}

			for (int star = 0; star < MAX_ROWS - move; star++) {
				System.out.print("*");
			}

			System.out.println();
		}
		for (int row = 0; row < MAX_ROWS; row++) {
			int move = MAX_ROWS - row;

			for (int space = 10; space > move; space--) {
				System.out.print(" ");
			}

			for (int star = 10; star > MAX_ROWS - move; star--) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
