package absence;

public class TestAbsenceSystem {

	public static void main(String[] args) {
		int[][] absence15t = { { 2, 0, 0, 0, 3, 1, 0, 2, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 2, 0, 0, 0, 3, 1, 0, 2, 0, 0, 0, 0 }, { 1, 2, 1, 2, 1, 2, 0, 2, 0, 0, 4, 0 },
				{ 5, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0 } };

		AbsenceSystem absenceSystem = new AbsenceSystem();
		absenceSystem.printAbsence(absence15t);
		System.out.println("Total Fravær elev 1: " + absenceSystem.totalAbsence(absence15t, 0));
		System.out.println("Total Fravær elev 2: " + absenceSystem.totalAbsence(absence15t, 1));
		System.out.println("Total Fravær elev 3: " + absenceSystem.totalAbsence(absence15t, 2));
		System.out.println("Total Fravær elev 4: " + absenceSystem.totalAbsence(absence15t, 3));
		System.out.println("Total Fravær elev 5: " + absenceSystem.totalAbsence(absence15t, 4));
		System.out.println("Gennemsnits fravær elev 1 : " + absenceSystem.averageMonth(absence15t, 0));
		System.out.println("Gennemsnits fravær elev 2 : " + absenceSystem.averageMonth(absence15t, 1));
		System.out.println("Gennemsnits fravær elev 3 : " + absenceSystem.averageMonth(absence15t, 2));
		System.out.println("Gennemsnits fravær elev 4 : " + absenceSystem.averageMonth(absence15t, 3));
		System.out.println("Gennemsnits fravær elev 5 : " + absenceSystem.averageMonth(absence15t, 4));
		System.out.println("Elever unden fravær: " + absenceSystem.studentWithoutAbsenceCount(absence15t));
		System.out.println("Elever med mest fravær: " + absenceSystem.mostAbsentStudent(absence15t));
		absenceSystem.reset(absence15t, 3); // Nulstiller fravær for elev 3
		System.out.println("Fravær efter nulstilning: " + absenceSystem.totalAbsence(absence15t, 1));
	}
}
