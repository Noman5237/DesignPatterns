package observer.weatherorama.display;

import observer.weatherorama.Observer;
import observer.weatherorama.Subject;

public class CurrentConditionsDisplay implements Observer, Display {
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	private final Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.display();
	}
	
	@Override
	public void display() {
		System.out.println("Current conditions:\n" +
				                   "Temperature\tHumidity\tPressure\n" +
				                   String.format("%.2f (C)\t%.2f\t%.2f", temperature, humidity, pressure));
	}
}
