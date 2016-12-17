package semesterproeve;

public class Deltagelse {

	private boolean afbud;
	private String begrundelse;
	private Spiller spiller;

	public Deltagelse(boolean afbud, String begrundelse, Spiller spiller) {
		this.afbud = afbud;
		this.begrundelse = begrundelse;
		this.spiller = spiller;
	}

	public boolean isAfbud() {
		return afbud;
	}

	public void setAfbud(boolean afbud) {
		this.afbud = afbud;
	}

	public String getBegrundelse() {
		return begrundelse;
	}

	public void setBegrundelse(String begrundelse) {
		this.begrundelse = begrundelse;
	}

	public Spiller getSpiller() {
		return spiller;
	}

	public void setSpiller(Spiller spiller) {
		this.spiller = spiller;
	}
}
