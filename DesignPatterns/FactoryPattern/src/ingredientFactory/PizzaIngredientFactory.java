package ingredientFactory;

import ingredientFactory.ingredients.interfaces.Cheese;
import ingredientFactory.ingredients.interfaces.Clams;
import ingredientFactory.ingredients.interfaces.Dough;
import ingredientFactory.ingredients.interfaces.Sauce;
import ingredientFactory.ingredients.interfaces.Veggies;

public interface PizzaIngredientFactory {

	//one new class per Ingredient!
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
	//somehow toString is never needed to implement in an interface
	//probably because it is initiated in every object in java?!
	public String toString();
	
	
}
