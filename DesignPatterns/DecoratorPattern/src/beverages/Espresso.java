package beverages;
import component.*;

/**
 * Sort of coffee the shop offers as a base
 * it can be decorated by mocha and other 
 * decoraders
 * @author robin
 *
 */
public class Espresso extends Beverage {

	
	public Espresso() {
		description = "Espresso";
	}
	
	/**
	 * just add the cost of this ingredient
	 */
	@Override
	public double cost() {
		return 1.99;
	}

}
