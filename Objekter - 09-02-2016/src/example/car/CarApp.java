package example.car;

public class CarApp {

	public static void main(String[] args) {
		Car myCar = new Car("Porsche", "White");
		System.out.println("Model: " + myCar.getBrand());
		System.out.println("Farve: " + myCar.getColor());
		myCar.setRegistrationNumber("TT123456");
		myCar.setKm(200);
		System.out.println("Nummerplade: " + myCar.getRegistrationNumber());
		System.out.println("Kilometer: " + myCar.getKm());
	}

}
