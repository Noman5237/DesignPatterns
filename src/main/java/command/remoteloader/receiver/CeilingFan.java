package command.remoteloader.receiver;

public class CeilingFan {
	
	private final String location;
	
	public enum STATES {
		OFF, LOW, MEDIUM, HIGH
	}
	
	private STATES level;
	
	public CeilingFan(String location) {
		this.location = location;
		this.level = STATES.OFF;
	}
	
	public void high() {
		level = STATES.HIGH;
		System.out.println(location + " ceiling fan is on high");
	}
	
	public void medium() {
		level = STATES.MEDIUM;
		System.out.println(location + " ceiling fan is on medium");
	}
	
	public void low() {
		level = STATES.LOW;
		System.out.println(location + " ceiling fan is on low");
	}
	
	public void off() {
		level = STATES.OFF;
		System.out.println(location + " ceiling fan is off");
	}
	
	public STATES getSpeed() {
		return level;
	}
	
}
