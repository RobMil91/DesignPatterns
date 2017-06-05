package pizzas;

public class ChicagoSytleCheesePizza extends Pizza {
	
	/**
	 * Constructor which initiates the superclass values
	 */
	 public ChicagoSytleCheesePizza() {
	
		
		name = "Chicago Style Deep Dish Cheese Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
		
		toppings.add("Shreddded Mozarella Cheese");
		
	}
	 
		/**
		 * This is an overwrite!!!
		 */
		public void cut() {
			System.out.println("Cutting Pizza into square slices");
		}

}
