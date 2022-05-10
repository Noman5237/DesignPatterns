package observer.weatherorama.display;

import lombok.Setter;
import observer.weatherorama.Observer;
import observer.weatherorama.WeatherData;

public class CurrentConditionsDisplay implements Observer, Display {
	
	private float temperature;
	private float humidity;
	private final WeatherData weatherData;
	
	public CurrentConditionsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void update() {
		this.temperature = weatherData.getTemperature();
		this.humidity = weatherData.getHumidity();
		
		display();
	}
	
	public void display() {
		System.out.println("Current conditions: " + temperature
				                   + "F degrees and " + humidity + "% humidity");
	}
}
