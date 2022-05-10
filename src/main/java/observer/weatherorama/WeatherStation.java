package observer.weatherorama;

import observer.weatherorama.display.CurrentConditionsDisplay;

public class WeatherStation {
	
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(12, 13, 14);
		weatherData.setMeasurements(14, 16, 10);
		weatherData.setMeasurements(16, 17, 11);
	}
}
