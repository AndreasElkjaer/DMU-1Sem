package employee;

public class TestApp {

	public static void main(String[] args) {
		Employee emp = new Employee("Kristian", "Pedersen", 32, "Vejnavn 1", 25000);

		System.out.println("Name: " + emp.getName());
		System.out.println("Lastname: " + emp.getSurname());
		System.out.println("Age: " + emp.getAge());
		System.out.println("Adress: " + emp.getAddress());
		System.out.println("Monthy salary: " + emp.getmonthlySalary());
		System.out.println("Trainee: " + emp.isTrainee());
		System.out.println("--------------");

		emp.setName("Christian");
		emp.setSurname("Madsen");
		emp.setAge(25);
		emp.setAddress("Vejnavn 2");
		emp.setmonthlySalary(33000);
		emp.increaseAgeByOne();
		System.out.println("Name: " + emp.getName());
		System.out.println("lastname: " + emp.getSurname());
		System.out.println("Age: " + emp.getAge());
		System.out.println("Adress: " + emp.getAddress());
		System.out.println("Monhtly salary: " + emp.getmonthlySalary());
		System.out.println("Trainee: " + emp.isTrainee());
		System.out.println("--------------");
	}

}
