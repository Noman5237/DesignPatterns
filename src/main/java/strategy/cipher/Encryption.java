package strategy.cipher;

import lombok.AllArgsConstructor;
import lombok.Setter;
import strategy.cipher.algorithms.Algorithm;

@Setter
@AllArgsConstructor
public class Encryption {
	
	private Algorithm algorithm;
	
	public String encrypt(String text, String key) {
		return algorithm.encrypt(text, key);
	}
}
