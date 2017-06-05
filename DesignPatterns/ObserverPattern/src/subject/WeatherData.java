package subject;

import java.util.ArrayList;

import interfaces.*;

/**
 * Weatherdata resembels the actual weather which should be 
 * measured somewhere and than added here
 * @author robin
 *
 */
public class WeatherData implements Subject{

	/**
	 * list of observers that are subscribed to the subject
	 */
	private ArrayList observers;
	/**
	 * add properties to the weatherdata  
	 */
	private float temperature;
	private float humidity;
	private float pressure;
	
	
	/**
	 * Constructor
	 */
	public WeatherData() {
		
		observers = new ArrayList();
	}
	
	@Override
	public void registerObserver(Observer obs) {
		observers.add(obs);
		
	}

	@Override
	public void removeObserver(Observer obs) {
		//check if observer exists
		int proofIndex = observers.indexOf(obs);
		if (proofIndex >= 0) {
			observers.remove(proofIndex);
		}
		
		
	}

	@Override
	public void notifyObserver() {
		for (int i = 0; i < observers.size(); i++) {
			Observer currentObs = (Observer) observers.get(i);
			currentObs.update(temperature, humidity, pressure);
		}
		
	}
	
	
	
	/**
	 * Casual Method for usage of the notifcation
	 */
	public void measurementsChanged() {
		// call the update for all the observers
		notifyObserver();
	}
	
	/**
	 * Method for setting the new Measurments found,
	 * then calls measurment changed method which itself
	 * calls notfityObserver
	 * @param temp
	 * @param humidity
	 * @param pressure
	 */
	public void setMeasurments(float temp, float humidity, float pressure){
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
		
	}
	
	//could create more methods here for example only temperature changing..

	
}
