package condiments;

import component.Beverage;

import decorator.CondimentDecorator;

/**
 * 
 * @author robin
 *
 */
public class Mocha extends CondimentDecorator {

	//reference to the component object
	Beverage beverage;
	
	/**
	 * when initaited the Condiment needs to be part of a Beverage
	 * in other words a coffee
	 * @param beverage
	 */
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	@Override
	public String getDescription() {
		// gets the current Desciption String and ads its own Name
		// it gets the String from the his super class CondimentDecorator
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.20 + beverage.cost();
	}

}
