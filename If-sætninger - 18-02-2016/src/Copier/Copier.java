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
			System.out.println("Forhelvede, jeg kan ikke spise mere papir!");
		} else if (paper < 1) {
			System.out.println("Så giv mig da noget papir at printe på, IDIOT!");
		} else if (paperStuck) {
			System.out.println("Der er koks i maskineriet!");
		} else if (copies > paper) {
			System.out.println("Ikke nok papir!");
		} else {
			System.out.println("JEG ER FÆÆÆRDIG!!");
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
