package Child;

/**
 * A child with a gender and an age.
 */
public class Child {
	private int age;
	private boolean boy;
	private double[] weight;

	public Child(int age, boolean boy, double[] weight) {
		this.age = age;
		this.boy = boy;
		this.weight = weight;
	}

	public double getWeight(int age) {
		return weight[age];
	}

	public double getBiggestWeightGain() {
		double lastValue = weight[0];
		double deltaValue = 0;
		for (double weight : this.weight) {
			if (weight - lastValue > deltaValue) {
				deltaValue = weight - lastValue;
			}
			lastValue = weight;
		}
		return deltaValue;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isBoy() {
		return this.boy;
	}

	public void setBoy(boolean boy) {
		this.boy = boy;
	}

	public String institution() {
		String institution = "Home";
		if (this.age < 3) {
			institution = "Nursery";
		} else if (this.age < 6) {
			institution = "Kindergarten";
		} else if (this.age < 17) {
			institution = "School";
		} else if (this.age > 16) {
			institution = "Out of school";
		}
		return institution;
	}

	public String gender() {
		if (this.boy) {
			return "Boy";
		} else {
			return "Girl";
		}
	}

	public String team() {
		if (this.age < 8) {
			if (this.boy) {
				return "Young cubs";
			} else {
				return "Tumbling girls";
			}
		} else {
			if (this.boy) {
				return "Cool boys";
			} else {
				return "Springy girls";
			}
		}
	}
}
