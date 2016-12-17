package opgaver;

public class opgave2 {

	public static void main(String[] args) {
		String ord1 = "Datamatiker";
		String ord2 = "Uddannelsen";
		String ord1cap = ord1.toUpperCase();
		String ord2lowercase = ord2.toLowerCase();
		String ord3 = ord1cap + " " + ord2lowercase;
		System.out.println(ord1cap);
		System.out.println(ord2lowercase);
		System.out.println(ord3);
		System.out.println(ord3.length());
		String ord1first7 = ord1.substring(0, 7);
		String ord2threeseven = ord2.substring(3, 7);
		System.out.println(ord1first7);
		System.out.println(ord2threeseven);
		System.out.println(ord3.substring(12, 23));
	}

}
