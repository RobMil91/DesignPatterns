package ingredientFactory;


public class VeggiePizza extends Pizza {

	//Ingredient Factory now instead of normal name sauce and so on
	//its declared in super class..
	PizzaIngredientFactory ingredientFactory;


	//only Constructor name changes to brother classes
	public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
	
	/**
	 * Now use the ingredientFactory to prepare the pizza
	 * only adjust few things main part of the code stays the same
	 */
	@Override
	void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		
	}
}
