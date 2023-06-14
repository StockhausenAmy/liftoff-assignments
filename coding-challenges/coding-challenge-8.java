public class Challenge {
	public static int charCount(char c, String str) {
		int count = 0;
		for (int i=0; i < str.length(); i++) {
			if (str.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}
}
