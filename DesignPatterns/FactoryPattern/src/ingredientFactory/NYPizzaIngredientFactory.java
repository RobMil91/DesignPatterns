package ingredientFactory;

import ingredientFactory.Pepperoni;
import ingredientFactory.ingredients.*;
import ingredientFactory.ingredients.interfaces.Cheese;
import ingredientFactory.ingredients.interfaces.Clams;
import ingredientFactory.ingredients.interfaces.Dough;
import ingredientFactory.ingredients.interfaces.Sauce;
import ingredientFactory.ingredients.interfaces.Veggies;


/**
 * 
 * @author robin
 *
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory{

	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return new MarinaSauce();
	}

	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		// TODO Auto-generated method stub
		Veggies[] veggies = {new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		// TODO Auto-generated method stub
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		// TODO Auto-generated method stub
		//fresh Clams because NY is near the cost
		return new FreshClams();
	}

}
