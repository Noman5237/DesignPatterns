package command.remoteloader.receiver;

public class GarageDoor {
	
	private final String location;
	
	public GarageDoor(String location) {
		this.location = location;
	}
	
	public void up() {
		System.out.println(location + " garage Door is Up");
	}
	
	public void down() {
		System.out.println(location + " garage Door is Down");
	}
	
	public void stop() {
		System.out.println(location + " garage Door is Stopped");
	}
}
