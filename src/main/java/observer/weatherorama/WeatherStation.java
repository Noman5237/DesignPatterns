package observer.weatherorama;

import observer.weatherorama.display.CurrentConditionsDisplay;
import observer.weatherorama.display.ForecastDisplay;
import observer.weatherorama.display.HeatIndexDisplay;
import observer.weatherorama.display.StatisticsDisplay;

public class WeatherStation {
	
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		
		weatherData.setMeasurements(12, 13, 14);
		weatherData.setMeasurements(14, 16, 10);
		weatherData.setMeasurements(16, 17, 11);
		weatherData.setMeasurements(14, 17, 18);
	}
}
