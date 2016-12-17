package opgaver;

public class opgave3 {
	private String firstname;
	private String middelname;
	private String lastname;

	public opgave3(String inputfirstName, String inputmiddelName, String inputlastName) {
		this.firstname = inputfirstName;
		this.middelname = inputmiddelName;
		this.lastname = inputlastName;
	}

	public static void main(String[] args) {
		printUser();
	}

	public String getFirstName() {
		return firstname;
	}

	public void setFirstName(String inputfirstName) {
		this.firstname = inputfirstName;
	}

	public String getMiddelName() {
		return middelname;
	}

	public void setMiddelName(String inputmiddelName) {
		this.middelname = inputmiddelName;
	}

	public String getLastName() {
		return lastname;
	}

	public void setLastName(String inputlastName) {
		this.lastname = inputlastName;
	}

	public String getIntials() {
		String intials = firstname.substring(0, 1) + middelname.substring(0, 1) + lastname.substring(0, 1);
		return intials;
	}

	public String getUsername() {
		String username = firstname.substring(0, 2).toLowerCase() + middelname.length()
				+ lastname.substring(lastname.length() - 2, lastname.length());
		return username;
	}

	public static void printUser() {
		opgave3 user = new opgave3("Kristian", "Pedersen", "Test");

		System.out.println("Navn: " + user.getFirstName());
		System.out.println("Mellemnavn: " + user.getMiddelName());
		System.out.println("Efternavn: " + user.getLastName());
		System.out.println("Intialer: " + user.getIntials());
		System.out.println("Brugernavn: " + user.getUsername());
		System.out.println("--------------");
	}

}
