package teaExample;

/**
 * probably the template
 * @author robin
 *
 */
public abstract class CaffeineBevarge {
	
	/**
	 * this method just mashes all commands down in 
	 * an order ; these should be the primitive Methods
	 */
	final void prepareRecipe() {
		
		/**
		 * order is important in this section
		 * but the methods to change can be in any position..
		 */
		
		//method that is always used
		boilWater();
		/**
		 * method that varies in subclass
		 * cause tea and coffe are made differntly
		 */
		brew();
		//always the same
		pourInCup();
		
		/**
		 * definitly changes in the sublasses
		 */
		addCondiments();
		
	}
	
	//-------------------------now primitiv methods!!!!!

	/**
	 * with abstract i guarantee that it has to
	 * be implmented by the subclass
	 */
	abstract void brew();
	abstract void addCondiments();
	
	/**
	 * the always used method is implemented here
	 * cause it doesnt change
	 */
	void boilWater() {
		System.out.println("Boiling Water!");
		
	}
	
	void pourInCup() {
		System.out.println("Pouring into Cup!");
		
	}
	

}
