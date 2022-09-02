package strategy.cipher.algorithms;

public class SimpleSubstitution implements Algorithm {
	
	@Override
	public String encrypt(String text, String key) {
		
		if (!text.matches("[a-z ]+")) {
			throw new IllegalArgumentException("Text must only contain lowercase letters and spaces");
		}
		
		StringBuilder encrypted = new StringBuilder();
		for (char c : text.toCharArray()) {
			if (Character.isLetter(c)) {
				encrypted.append(key.charAt(c - 'a'));
			} else {
				encrypted.append(c);
			}
		}
		
		return encrypted.toString();
	}
}
