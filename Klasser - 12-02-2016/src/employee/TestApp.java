package employee;

public class TestApp {

	public static void main(String[] args) {
		Employee emp = new Employee("Kristian", "Pedersen", 32, "Vejnavn 1", 25000);

		System.out.println("Navn: " + emp.getName());
		System.out.println("Efternavn: " + emp.getSurname());
		System.out.println("Alder: " + emp.getAge());
		System.out.println("Addresse: " + emp.getAddress());
		System.out.println("Månedes Løn: " + emp.getmonthlySalary());
		System.out.println("Trainee: " + emp.isTrainee());
		System.out.println("--------------");

		emp.setName("Christian");
		emp.setSurname("Madsen");
		emp.setAge(25);
		emp.setAddress("Vejnavn 2");
		emp.setmonthlySalary(33000);
		emp.increaseAgeByOne();
		System.out.println("Navn: " + emp.getName());
		System.out.println("Efternavn: " + emp.getSurname());
		System.out.println("Alder: " + emp.getAge());
		System.out.println("Addresse: " + emp.getAddress());
		System.out.println("Månedes Løn: " + emp.getmonthlySalary());
		System.out.println("Trainee: " + emp.isTrainee());
		System.out.println("--------------");
	}

}
