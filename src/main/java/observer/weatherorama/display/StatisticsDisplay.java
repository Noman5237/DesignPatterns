package observer.weatherorama.display;

import observer.weatherorama.Observer;
import observer.weatherorama.WeatherData;

public class StatisticsDisplay implements Observer, Display {
	
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum = 0.0f;
	private int numReadings;
	private final WeatherData weatherData;
	
	public StatisticsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void update() {
		var temp = weatherData.getTemperature();
		tempSum += temp;
		numReadings++;
		
		if (temp > maxTemp) {
			maxTemp = temp;
		}
		
		if (temp < minTemp) {
			minTemp = temp;
		}
		
		display();
	}
	
	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
				                   + "/" + maxTemp + "/" + minTemp);
	}
}
