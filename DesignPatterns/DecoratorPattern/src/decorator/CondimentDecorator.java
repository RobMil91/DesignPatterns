package decorator;
import component.*;

/**
 * CondimentDecorator is a Decorator 
 * which will be changeable to Beverage because he
 * extends it
 * @author robin
 *
 */
public abstract class CondimentDecorator extends Beverage {

	public abstract String getDescription();
}
