package util.cli.io;

public interface OutputSource {
	
	void print(String message);
	
	default void println(String message) {
		this.print(message + "\n");
	}
}
