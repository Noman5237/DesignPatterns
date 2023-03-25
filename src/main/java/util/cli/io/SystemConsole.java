package util.cli.io;

import java.util.Scanner;

public class SystemConsole {
	
	private static final Scanner scanner = new Scanner(System.in);
	
	public static InputSource getInputSource() {
		return scanner::nextLine;
	}
	
	public static OutputSource getOutputSource() {
		return System.out::print;
	}
}
