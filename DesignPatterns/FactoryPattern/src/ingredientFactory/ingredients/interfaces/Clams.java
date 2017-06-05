package ingredientFactory.ingredients.interfaces;

public interface Clams {
	
	//interfaces arent supposed to garantie attributes?!
	//however they have to be initiated which feels bad..
	//probably abstract class better choice for ingredient interfaces?!
	
	//somehow this is useless -> has to be implemented and thought of in the subclass!
	//public String name = null;

	/**
	 * Ensure that Clams have to implement a toString Method!
	 * @return the name
	 */
	 String toString();
	
	 //this can add important behavior to the class
	void implementShit();

}
