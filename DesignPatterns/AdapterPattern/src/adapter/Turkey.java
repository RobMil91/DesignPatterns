package adapter;

/**
 * the other class that needs to adapt to Duck
 * @author robin
 *
 */
public interface Turkey {

	/**
	 * Similiar Method to quack
	 */
	public void gobble();
	/**
	 * Same method name as duck, 
	 * not the same intended behavior
	 * turkeys cant fly as well as ducks!!!!!!
	 */
	public void fly();
	
}
