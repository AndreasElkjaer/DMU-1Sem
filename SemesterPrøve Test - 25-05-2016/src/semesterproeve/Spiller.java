package semesterproeve;

import java.util.ArrayList;

public class Spiller {
	private String navn;
	private int årgang;
	private ArrayList<Deltagelse> deltagelser;
	private int antalDeltagelser;
	private ArrayList<String> antalAfbud;

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public int getÅrgang() {
		return årgang;
	}

	public void setÅrgang(int årgang) {
		this.årgang = årgang;
	}

	public Spiller(String navn, int årgang) {
		this.navn = navn;
		this.årgang = årgang;
	}

	public int antalDeltagelser() {
		for (int i = 0; i < deltagelser.size(); i++) {
			if (deltagelser.get(i).getSpiller().equals(this.getClass())) {
				antalDeltagelser++;
			}
		}
		return antalDeltagelser;
	}

	public ArrayList<String> afbud() {
		for (int i = 0; i < deltagelser.size(); i++) {
			if (deltagelser.get(i).getSpiller().equals(this.getClass()) && deltagelser.get(i).isAfbud()) {
			}
		}
		return antalAfbud;
	}

	public double KampHonorar() {
		return antalDeltagelser * 10 / antalAfbud;
	}
}
