package employee;

/**
 * Class that describes an employee
 */
public class Employee {
	/**
	 * Attributes
	 */
	private String name;
	private boolean trainee;
	private int age;
	private String surname;
	private String address;
	private int monthlySalary;

	/**
	 * Constructor
	 * When created the employee is a trainee
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
	 * Change the employees name using setName
	 */
	public void setName(String inputName) {
		this.name = inputName;
	}

	/**
	 * Get the employee name using getName
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
	 * change if the employee is a trainee using setTrainess
	 */
	public void setTrainee(boolean trainee) {
		this.trainee = trainee;
	}

	/**
	 * Check if the employee is a trainee using isTrainee
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
