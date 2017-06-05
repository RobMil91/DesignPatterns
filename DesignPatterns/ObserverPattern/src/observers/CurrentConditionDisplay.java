package observers;

import subject.WeatherData;
import interfaces.DisplayElement;
import interfaces.Observer;
import interfaces.Subject;

public class CurrentConditionDisplay implements Observer, DisplayElement {

	/**
	 * always has at least all attributes the subject has
	 */
	private float temperature;
	private float humidity;
	private float pressure;
	/**
	 * also has an instance of its subject called by its interface name
	 */
	private Subject weatherData;

	/**
	 * Constructor when initiated the Display should have data from the subject
	 */
	public CurrentConditionDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		/**
		 * This is an observer he has to register! interesting that he kind of
		 * holds his subject and is registered in his own attribute
		 */
		weatherData.registerObserver(this);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		// interesting to note is here that we dont have to use all update
		// parameters!
		display();

	}

	/**
	 * for testing this is just a print method
	 */
	@Override
	public void display() {
		System.out.println("Current Condition(Temperatur): " + temperature
				+ "F degrees and " + humidity + "% humidity");

	}

}
