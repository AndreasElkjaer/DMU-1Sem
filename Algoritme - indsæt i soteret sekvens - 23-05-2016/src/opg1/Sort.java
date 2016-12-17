package opg1;

import java.util.ArrayList;

public class Sort {
	// Opgave 1
	public void insertKunde(ArrayList<Kunde> kunder, Kunde kunde) {
		int i = 0;
		while (kunde.compareTo(kunder.get(i)) > 0) {
			i++;
		}
		kunder.add(i, kunde);
	}

	// Opgave 2
	public void insertKunde2(Kunde[] kunder, Kunde kunde) {
		int i = 0;
		for (Kunde k : kunder) {
			if (k != null) {
				i++;
			}
		}
		while (i > 0 && kunde.compareTo(kunder[i - 1]) < 0) {
			kunder[i] = kunder[i - 1];
			i--;
		}

		kunder[i] = kunde;
	}

	// Opgave 3
	public ArrayList<Kunde> mergeKunder(ArrayList<Kunde> k1, ArrayList<Kunde> k2) {
		ArrayList<Kunde> res = new ArrayList<Kunde>();
		int i1 = 0;
		int i2 = 0;
		while (i1 < k1.size() && i2 < k2.size()) {
			if (k1.get(i1).compareTo(k2.get(i2)) <= 0) {
				res.add(k1.get(i1));
				i1++;
			} else {
				res.add(k2.get(i2));
				i2++;
			}
		}
		while (i1 < k1.size()) {
			res.add(k1.get(i1));
			i1++;
		}
		while (i2 < k2.size()) {
			res.add(k2.get(i2));
			i2++;
		}
		return res;
	}

}
