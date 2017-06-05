package pizzaShop;

import pizza.*;

/**
 * Simple Factory class to encapsalute creating method
 * note you can do this with static Method but you lose
 * the option to subclass the Factory for further detailed
 * differntsation?!
 * @author robin
 *
 */
public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		
		//i dont really want to initated this, should get exception in case no pizza is been made
		Pizza pizza = null;
		
		//a switch is potentially way better than this if tree
		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("salami")) {
			pizza = new SalamiPizza();
		}

		
		//potentially check here for null and create exception
		return pizza;
		
	}
	
}
