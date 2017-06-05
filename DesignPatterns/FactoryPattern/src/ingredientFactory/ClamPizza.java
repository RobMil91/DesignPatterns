package ingredientFactory;



public class ClamPizza extends Pizza {
	
	//shoudnt i always have this in the superclass when i need to initiate it anyway?
	PizzaIngredientFactory ingredientFactory;

	
	
	public ClamPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
	
	/**
	 * again same code as in brother classes
	 */
	@Override
	void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		
		//exception that this time clam is added!!!!!
		/**
		 * clams from an NY ingredient Factory will be fresh
		 */
		clam = ingredientFactory.createClam();
		
	}

}