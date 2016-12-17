package src.example.Child;

/**
 * Write a description of class Child here.
 */
public class Child {
	private int age;
	private boolean boy;

	public Child(int age, boolean boy) {
		this.age = age;
		this.boy = boy;
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
		if (age == 0) {
			return "Home";
		} else if (age == 1 || age == 2) {
			return "Nursey";
		} else if (age >= 3 && age <= 5) {
			return "Kindergarten";
		} else if (age >= 6 && age <= 16) {
			return "School";
		} else if (age >= 17) {
			return "Out of school";
		} else {
			return "FEJL";
		}
	}

	public String gender() {
		if (boy) {
			return "Boy";
		} else {
			return "Girl";
		}
	}

	public String team() {
		if (!boy && age < 8) {
			return "Tumbling Girls";
		} else if (!boy && age >= 8) {
			return "Springy Girls";
		} else if (boy && age < 8) {
			return "Young cubs";
		} else if (boy && age >= 8) {
			return "Cool Boys";
		} else {
			return "Intet hold";
		}
	}

	public static void printUser() {
		Child user = new Child(17, true);

		System.out.println("Age: " + user.getAge());
		System.out.println("Gender: " + user.gender());
		System.out.println("Insitutuion: " + user.institution());
		System.out.println("Team: " + user.team());
		System.out.println("--------------");
	}

	public static void main(String[] args) {
		printUser();
	}

}
