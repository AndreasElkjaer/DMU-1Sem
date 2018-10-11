package example.car;

public class CarApp {

	public static void main(String[] args) {
		Car myCar = new Car("Porsche", "White");
		System.out.println("Model: " + myCar.getBrand());
		System.out.println("Color: " + myCar.getColor());
		myCar.setRegistrationNumber("TT123456");
		myCar.setKm(200);
		System.out.println("Licenseplate: " + myCar.getRegistrationNumber());
		System.out.println("Km: " + myCar.getKm());
	}

}
