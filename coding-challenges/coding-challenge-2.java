public class Challenge {
	public static double[] minMax(double[] arr) {
		double min = arr[0];
		double max = arr[0];
		for (double number : arr) {
			if (number < min) {
				min = number;
			} else if (number > max) {
				max = number;
			}
		}
		double[] minMaxResult = {min, max};
		return minMaxResult;
	}
}
