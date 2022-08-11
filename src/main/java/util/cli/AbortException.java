package util.cli;

public class AbortException extends Exception {
	
	public AbortException(String message) {
		super(message);
	}
	
	public AbortException() {
		super("Operation aborted by user");
	}
	
}
