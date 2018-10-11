package ArrayListMethods;

import java.util.ArrayList;

public class ArrayListMethodsApp {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(19);
		list.add(35);
		list.add(14);
		list.add(7);

		ArrayListMethods methods = new ArrayListMethods();

		System.out.println(list);
		System.out.println("Sum for the numbers in the list (for): " + methods.sumListeFor(list));
		System.out.println("Sum for the numbers in the list (for each): " + methods.sumListeForEach(list));
		System.out.println("Index for the first even number: " + methods.hasEvenAtIndex(list));
		System.out.println(list);
		System.out.println("Lowest number: " + methods.min(list));
		System.out.println("Average: " + methods.gennemsnit(list));
		System.out.println("Amount of zeros: " + methods.antalNuller(list));
		methods.erstatLigeMedNul(list);
		System.out.println(list);
	}

}
