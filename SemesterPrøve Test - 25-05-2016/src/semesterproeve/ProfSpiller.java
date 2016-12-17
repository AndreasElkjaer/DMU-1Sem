package semesterproeve;

public class ProfSpiller extends Spiller {

	private double kamphonorar;

	public ProfSpiller(String navn, int årgang, double kamphonorar) {
		super(navn, årgang);
		this.kamphonorar = kamphonorar;
	}

	public double getKamphonorar() {
		return kamphonorar;
	}

	public void setKamphonorar(double kamphonorar) {
		this.kamphonorar = kamphonorar;
	}

}
