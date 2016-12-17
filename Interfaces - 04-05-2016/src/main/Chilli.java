package main;

public class Chilli implements Measurable {
	public String name;
	public double sco;

	public Chilli(String name, double sco) {
		this.name = name;
		this.sco = sco;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSco() {
		return sco;
	}

	public void setSco(double sco) {
		this.sco = sco;
	}

	@Override
	public double getMeasure() {
		return sco;
	}
}
