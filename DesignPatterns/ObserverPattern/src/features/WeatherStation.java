package features;

import observers.CurrentConditionDisplay;
import subject.*;

public class WeatherStation {

	public static void main(String[] args) {
		
		WeatherData weatherdata = new WeatherData();

		CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherdata);
		//toDo create more Weather data displays
		
		
		//now i use the weatherdata subject to update the display
		
	//	weatherdata.measurementsChanged(); //should be private
		
		weatherdata.setMeasurments(80, 30, 10.4f);
	}

}
