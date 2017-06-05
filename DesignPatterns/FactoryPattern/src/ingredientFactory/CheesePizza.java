package ingredientFactory;



public class CheesePizza extends Pizza {
	
	//Ingredient Factory now instead of normal name sauce and so on
	//its declared in super class..
	PizzaIngredientFactory ingredientFactory;

	/**
	 * only ingredient Factory has to be implemented
	 * @param ingredientFactory
	 */
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
	
	/**
	 * Now use the ingredientFactory to prepare the pizza
	 */
	@Override
	void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		
	}

}
