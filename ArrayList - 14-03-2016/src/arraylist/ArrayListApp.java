package arraylist;

import java.util.ArrayList;

public class ArrayListApp {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		name.add("Hans");
		name.add("Viggo");
		name.add("Jens");
		name.add("Børge");
		name.add("Bent");
		System.out.println(name);
		name.add(1, "Jane");
		System.out.println(name);
		name.remove(0);
		name.add(0, "Pia");
		name.add("Ib");
		System.out.println(name);
		name.set(1, "Hansi");
		System.out.println(name.size());
		System.out.println(name);
		// for loop
		for (int i = 0; i < name.size(); i++) {
			System.out.print(name.get(i).length() + ", ");
		}
		System.out.println();

		for (String item : name) {
			System.out.print(item.length() + ", ");
		}
	}

}
