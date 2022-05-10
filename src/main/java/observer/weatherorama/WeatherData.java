package observer.weatherorama;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	private final List<Observer> observers;
	
	public WeatherData() {
		observers = new ArrayList<>();
	}
	
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	
	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
	
	@Override
	public void notifyObservers() {
		observers.forEach(Observer::update);
	}
	
	void measurementsChanged() {
		notifyObservers();
	}
	
	public float getTemperature() {
		return temperature;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}
	
	/* ================================ UTILITY ==================================== */
	
	void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}
