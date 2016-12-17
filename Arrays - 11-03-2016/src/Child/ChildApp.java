package Child;

public class ChildApp {

	public static void main(String[] args) {
		Child child = new Child(2, false,
				new double[] { 4.2, 9.3, 12.4, 17.5, 23.2, 25.3, 28.6, 30.4, 33.9, 35.1, 37.3 });
		System.out.println(String.format("Alder: %s", child.getAge()));
		String inst = child.institution();
		System.out.println(String.format("Institution: %s", inst));
		System.out.println("Vægt: " + child.getWeight(child.getAge()));
		System.out.println("Biggest Weight Gain: " + child.getBiggestWeightGain());
	}

}
