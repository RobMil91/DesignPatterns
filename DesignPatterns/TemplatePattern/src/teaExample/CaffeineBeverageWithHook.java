package teaExample;

/**
 * the new method customerWants...
 * is in std case not even noticed
 * it should always yield true here
 * 
 * 
 * The template method is very similiar to Stratedgy Pattern
 * but differs in the fact, that it uses inheritance
 * and Stradegy uses compoisiton
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * the template method has to be  final
 * @author robin
 *
 */
public abstract class CaffeineBeverageWithHook {
	
	/**
	 * final here because subclasses could change
	 * it here otherwise its to safe the algorithmen
	 */
	final void prepareRecipe() {

		boilWater();

		brew();
		pourInCup();
		

		//add the hook
		if (customerWantsCondiments()) {
			addCondiments();
			
		}
	
	}
	
	//-------------------------now primitiv methods!!!!!

	abstract void brew();
	abstract void addCondiments();

	void boilWater() {
		System.out.println("Boiling Water!");
		
	}
	
	void pourInCup() {
		System.out.println("Pouring into Cup!");
		
	}
	
	/**
	 * Hook method
	 * it can be overwriten but it doesnt have to be
	 * 
	 * @return standart is true 
	 * if customer doesnt want to you have to overwrite!
	 */
	boolean customerWantsCondiments() {
		return true;
	}

}
