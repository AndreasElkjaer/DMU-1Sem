package Copier;

public class Copier {
	private int paper;
	private boolean paperStuck;

	public Copier(int paper) {
		this.paper = paper;
		this.paperStuck = false;
	}

	public int getPaper() {
		return this.paper;
	}

	public void makeCopy(int copies) {
		if (paper >= 501) {
			System.out.println("Too much paper!");
		} else if (paper < 1) {
			System.out.println("Out of paper!");
		} else if (paperStuck) {
			System.out.println("ERROR: Paper is stuck!");
		} else if (copies > paper) {
			System.out.println("Not enough paper!");
		} else {
			System.out.println("Printing Done!");
			paper -= copies;
		}
	}

	public void makePaperJam() {
		this.paperStuck = true;
	}

	public void fixJam() {
		this.paperStuck = false;
	}

	public static void printPaper() {
		Copier copyprint = new Copier(30);
		copyprint.makeCopy(10);

	}

	public static void main(String[] args) {
		printPaper();
	}

}
