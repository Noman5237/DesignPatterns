package strategy.cipher.algorithms;

public class XOR implements Algorithm {
	
	@Override
	public String encrypt(String text, String key) {
		int xorKey;
		try {
			xorKey = Integer.parseInt(key);
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("Key must be an integer");
		}
		
		
		if (!text.matches("[a-z ]+")) {
			throw new IllegalArgumentException("Text must only contain lowercase letters and spaces");
		}
		
		StringBuilder encrypted = new StringBuilder();
		for (char c : text.toCharArray()) {
			if (Character.isLetter(c)) {
				encrypted.append((char) ((c ^ xorKey)));
			} else {
				encrypted.append(c);
			}
		}
		
		return encrypted.toString();
		
	}
}
