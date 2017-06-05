package pizzaShop;

import pizza.*;

/**
 * Main Class which violates a lot of
 * rules what should be in main and what not..
 * @author robin
 *
 */
public class PizzaShop {

	//needs to be initiaded in order to work during runtime?!
	SimplePizzaFactory factory;
	
	public PizzaShop(SimplePizzaFactory factory) {
		this.factory = factory;
	}
	
	public Pizza orderPizza(String type) {
		
		Pizza pizza;
		
		//hide the new and the code that changes in that class
		pizza = factory.createPizza(type);
		
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
		
	}
	

	
	public static void main(String[] args) {
		
		SimplePizzaFactory pizzaFactory = new SimplePizzaFactory();

		//the factory has to be given to the shop..logically order and things
		PizzaShop shop = new PizzaShop(pizzaFactory);

		System.out.println("I wanna order Pizza Cheese");
		
		shop.orderPizza("cheese");
		
		System.out.println("next!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		
		System.out.println("I wanna order Salami");
		
		shop.orderPizza("salami");
		
		
		
	}
}
