package opg1;

import java.util.ArrayList;
import java.util.Collections;

public class MainApp {
	public static void main(String[] args) {

		ArrayList<Kunde> kunder = new ArrayList<Kunde>();

		kunder.add(new Kunde("Andreas", "Elkjaer", 24));
		kunder.add(new Kunde("Bent", "Knudsen", 23));
		kunder.add(new Kunde("Lars", "Larsen", 20));

		Collections.sort(kunder);

		System.out.println(kunder);

		Sort s = new Sort();

		s.insertKunde(kunder, new Kunde("Casper", "Bruun", 23));
		s.insertKunde(kunder, new Kunde("Kevin", "Henriksen", 23));

		System.out.println(kunder);

		Kunde[] kunder2 = new Kunde[5];
		kunder2[0] = new Kunde("Andreas", "Joensen", 23);
		kunder2[1] = new Kunde("Stian", "Riedmann", 23);
		kunder2[2] = new Kunde("Lars", "Dorland", 23);
		kunder2[3] = new Kunde("Helle", "Jensen", 23);

		for (Kunde k : kunder2) {
			System.out.print(k + ", ");
		}

		System.out.println();
		s.insertKunde2(kunder2, new Kunde("Kevin", "Henriksen", 23));

		for (Kunde k : kunder2) {
			System.out.print(k + ", ");
		}

		System.out.println();

		ArrayList<Kunde> kunder3 = new ArrayList<Kunde>();

		kunder3.add(new Kunde("Andreas", "BJoensen", 23));
		kunder3.add(new Kunde("Stian", "CRiedmann", 23));
		kunder3.add(new Kunde("Lars", "Dorland", 23));
		kunder3.add(new Kunde("Helle", "QJensen", 23));
		kunder3.add(new Kunde("Aki", "WRakmanhnov", 23));
		kunder3.add(new Kunde("Lars", "EDorland", 23));
		kunder3.add(new Kunde("Helle", "QJensen", 23));
		kunder3.add(new Kunde("Aki", "WRakmanhnov", 23));

		Collections.sort(kunder3);

		System.out.println(kunder3);

		System.out.println(s.mergeKunder(kunder, kunder3));

	}

}
