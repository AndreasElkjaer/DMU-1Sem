package employee;

/**
 * Klasse der beskriver en ansat.
 */
public class Employee {
	/**
	 * Attributter der beskriver den ansattes tilstand
	 */
	private String name;
	private boolean trainee;
	private int age;
	private String surname;
	private String address;
	private int monthlySalary;

	/**
	 * Constructor, når den ansatte oprettes, skal den have et navn. Ved
	 * oprettelse er den ansatte en trainee
	 */
	// (Name, Surname, Age, Address, Salary)
	public Employee(String inputName, String inputSurname, int inputAge, String inputAddress, int inputSalary) {
		this.name = inputName;
		this.surname = inputSurname;
		this.age = inputAge;
		this.address = inputAddress;
		this.monthlySalary = inputSalary;
		this.trainee = true;
	}

	// Increase age by one
	public void increaseAgeByOne() {
		this.age++;
	}

	/**
	 * Den ansattes navn kan ændres ved kald af setName metoden
	 */
	public void setName(String inputName) {
		this.name = inputName;
	}

	/**
	 * Man kan få oplyst den ansattes navn, ved at kalde metoden getName
	 */
	public String getName() {
		return this.name;
	}

	public void setSurname(String inputSurname) {
		this.surname = inputSurname;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setAddress(String inputAddress) {
		this.address = inputAddress;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAge(int inputAge) {
		this.age = inputAge;
	}

	public int getAge() {
		return this.age;
	}

	public void setmonthlySalary(int inputSalary) {
		this.monthlySalary = inputSalary;
	}

	public int getmonthlySalary() {
		return this.monthlySalary;
	}

	/**
	 * Den ansatte kan få ændret trainee status ved at kalde metoden setTrainess
	 */
	public void setTrainee(boolean trainee) {
		this.trainee = trainee;
	}

	/**
	 * Man kan få oplyst den ansatte er trainess aktivitet, ved at kalde metoden
	 * isTrainee
	 */
	public boolean isTrainee() {
		return this.trainee;
	}

	@Override
	public String toString() {
		return this.name + " is trainee: " + this.trainee;
	}

	public void printEmployee() {
		System.out.println("*******************");
		System.out.println("Name " + this.name);
		System.out.println("Trainee " + this.trainee);
		System.out.println();
	}
}
