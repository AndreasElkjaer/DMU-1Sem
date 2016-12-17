package main;

public class Data {
	public static double max(Measurable[] objects) {
		double max = 0.0;
		for (Measurable obj : objects) {
			if (max < obj.getMeasure()) {
				max = obj.getMeasure();
			}
		}
		return max;
	}

	public static double avg(Measurable[] objects) {
		double avg = 0.0;
		for (Measurable obj : objects) {
			avg = avg + obj.getMeasure();
		}
		return avg / objects.length;
	}
}
