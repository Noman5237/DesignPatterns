package command.remoteloader.receiver;

public class HotTub {
	
	private boolean on;
	private int temperature;
	
	public HotTub() {
	}
	
	public void on() {
		on = true;
	}
	
	public void off() {
		on = false;
	}
	
	public void bubblesOn() {
		if (on) {
			System.out.println("Hot-tub is bubbling!");
		}
	}
	
	public void bubblesOff() {
		if (on) {
			System.out.println("Hot-tub is not bubbling");
		}
	}
	
	public void jetsOn() {
		if (on) {
			System.out.println("Hot-tub jets are on");
		}
	}
	
	public void jetsOff() {
		if (on) {
			System.out.println("Hot-tub jets are off");
		}
	}
	
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	
	public void heat() {
		temperature = 105;
		System.out.println("Hot-tub is heating to a steaming 105 degrees");
	}
	
	public void cool() {
		temperature = 98;
		System.out.println("Hot-tub is cooling to 98 degrees");
	}
	
}
