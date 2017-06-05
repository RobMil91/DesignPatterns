package component;

/**
 * Component Abstract class
 * @author robin
 *
 */
public abstract class Beverage {

	protected String description = "Unknown Beverage";
	
	
	public String getDescription() {
		return this.description;
		
	}
	
	//has to be implemented in subclass because of abstract!
	public abstract double cost();
	
}
