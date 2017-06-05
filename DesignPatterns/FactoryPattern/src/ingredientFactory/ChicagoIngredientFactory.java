package ingredientFactory;

//only these two imports and they should be used in one!!
import ingredientFactory.ingredients.*;
import ingredientFactory.ingredients.interfaces.*;

public class ChicagoIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return new MozzarellaCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		//carefull! used same veggies as in NY!
		Veggies[] veggies = {new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		// TODO Auto-generated method stub
		return new ChicagoPepperoni();
	}

	@Override
	public Clams createClam() {
		// TODO Auto-generated method stub
		return new FrozenClam();
	}

}
