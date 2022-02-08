package utils;

public class GenerateRandomData {

	public static String generateAlphaNumericString() {
		int n = 5;
		String random_string = "abcdefghijklmnopqrstuvxyz" + "123456789";

		StringBuilder sb = new StringBuilder(n);
		for (int i = 0; i < n; i++) {
			int index = (int) (random_string.length() * Math.random());
			sb.append(random_string.charAt(index));
		}
		return sb.toString();

	}
}
