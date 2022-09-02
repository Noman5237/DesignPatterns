package strategy.cipher.algorithms;

import java.util.Locale;

public class Caesar implements Algorithm {
	
	@Override
	public String encrypt(String text, String key) {
		int rotate;
		try {
			rotate = Integer.parseInt(key);
			rotate = rotate % 26;
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("Key must be an integer");
		}
		
		if (!text.matches("[a-z ]+")) {
			throw new IllegalArgumentException("Text must only contain lowercase letters and spaces");
		}
		
		StringBuilder encrypted = new StringBuilder();
		for (char c : text.toCharArray()) {
			if (Character.isLetter(c)) {
				encrypted.append((char) ((c + rotate)));
			} else {
				encrypted.append(' ');
			}
		}
		return encrypted.toString();
	}
}
