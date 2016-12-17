package opg1;

public class Kunde implements Comparable<Kunde> {

	private String fornavn;
	private String efternavn;
	private int alder;

	public Kunde(String fornavn, String efternavn, int alder) {
		this.setFornavn(fornavn);
		this.setEfternavn(efternavn);
		this.setAlder(alder);
	}

	public String getFornavn() {
		return fornavn;
	}

	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}

	public String getEfternavn() {
		return efternavn;
	}

	public void setEfternavn(String efternavn) {
		this.efternavn = efternavn;
	}

	public int getAlder() {
		return alder;
	}

	public void setAlder(int alder) {
		this.alder = alder;
	}

	@Override
	public int compareTo(Kunde o) {

		int comp1 = efternavn.compareToIgnoreCase(o.getEfternavn());
		int comp2 = fornavn.compareToIgnoreCase(o.getFornavn());

		if (comp1 != 0) {
			return comp1;
		} else {
			return comp2;
		}
	}

	@Override
	public String toString() {
		return fornavn + " " + efternavn + " " + alder;

	}

}
