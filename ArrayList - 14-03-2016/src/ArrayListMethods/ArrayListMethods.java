package ArrayListMethods;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethods {

	/**
	 * Sums the numbers in the list using a for loop each
	 */
	public int sumListeForEach(ArrayList<Integer> list) {
		int resultat = 0;
		for (int tal : list) {
			resultat = resultat + tal;
		}
		return resultat;
	}

	/**
	 * Sums the numbers in the list using a for loop
	 */
	public int sumListeFor(ArrayList<Integer> list) {
		int resultat = 0;
		for (int i = 0; i < list.size(); i++) {
			resultat = resultat + list.get(i);
		}
		return resultat;
	}

	/**
	 * Returns the index of the first even number
	 */
	public int hasEvenAtIndex(ArrayList<Integer> list) {
		int index = -1;
		int i = 0;
		while (index == -1 && i < list.size()) {
			if (list.get(i) % 2 == 0) {
				index = i;
			}
			i++;
		}
		return index;
	}

	/**
	 * Returnerer det mindste tal i list
	 */
	public int min(ArrayList<Integer> list) {
		return Collections.min(list);
	}

	public double gennemsnit(ArrayList<Integer> list) {
		double sum = 0.0;
		double avg = 0.0;
		for (int i = 0; i < list.size(); i++) {
			sum = sum + list.get(i);
		}
		if (list.size() > 0) {
			avg = sum / list.size();
		}
		return avg;
	}

	public int antalNuller(ArrayList<Integer> list) {
		int zeros = 0;

		for (int element : list) {
			if (element == 0) {
				zeros++;
			}

		}
		return zeros;
	}

	public void erstatLigeMedNul(ArrayList<Integer> list) {
		for (int i = 0; i > list.size(); i++) {
			if (i % 2 == 0) {
				list.set(i, 0);
				// System.out.println(i);
			}
		}
	}

	public ArrayList<Integer> enLigeListe(ArrayList<Integer> list) {
		return list;

	}
}
