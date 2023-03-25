package strategy.cipher;

import strategy.cipher.algorithms.Algorithm;
import strategy.cipher.algorithms.Caesar;
import strategy.cipher.algorithms.SimpleSubstitution;
import strategy.cipher.algorithms.XOR;

import java.util.ArrayList;
import java.util.List;

public class Application {
	
	public static void main(String[] args) {
		String text = "hello world";
		System.out.println("text: " + text);
		
		System.out.print("Caesar: ");
		Encryption encryptor = new Encryption(new Caesar());
		System.out.println(encryptor.encrypt(text, "1"));
		
		System.out.print("Simple Substitution: ");
		encryptor.setAlgorithm(new SimpleSubstitution());
		System.out.println(encryptor.encrypt(text, "acbdefgihjklmnopqrstuxyzwv"));
		
		System.out.print("XOR: ");
		encryptor.setAlgorithm(new XOR());
		System.out.println(encryptor.encrypt(text, "10"));
	}
	
}
