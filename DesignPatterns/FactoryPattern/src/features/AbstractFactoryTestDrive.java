package features;

import ingredientFactory.*;

//Main class doesnt have to important anyth ingredients?!
//this supposed to be so?

/**
 * The Abstract Factory pattern uses interfaces for the ingredients
 * and creates a bunch of classes with these interfaces which are
 * then implemented into the IngredientFactory and especially choose
 * by the concrete NY Factory for example. The ingredientFactory then is used to 
 * in the Store an NY Store should use an NY Ingredient Factory. So when you
 * order from the NY Store the Store will just use his Ingredient factory to
 * create the pizza. It looks like this: pizza = new CheesePizza(ingredientFactory)
 * This means that an cheese pizza is initiated with the corresponding ingredientfactory
 * in this case the ny store initaites in his createPizza() method an NY ingredient factory
 * the NY ingredient factory is passed into all pizzas created, they then know which crust, dough and
 * so on to use, because the ingredient factory is from ny and knows which ones to use. Here special
 * Behavior can be added. The prime example here are the clams. While NY will use fresh ones and chicago will
 * use frozen ones.
 * 
 * 
 * @author robin
 *
 *
 *Packacking this pattern is a disaster...
 *Overview is superbad
 *have to look into it -> not explained in book
 */
public class AbstractFactoryTestDrive {
	
	public static void main(String[] args) {
		//create to stores
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();

		//create an NY cheese pizza
		Pizza pizza = nyStore.orderPizza("clam");
		System.out.println("Ordered a Clam Pizza from nyStore " + pizza.toString() + "\n");
		
		//create an NY cheese pizza
		//very weird to use the same object pizza for a different pizza it overwrites the old pizza..
		 pizza = chicagoStore.orderPizza("clam");
		System.out.println("Ordered a Clam Pizza from chicago store " + pizza.toString() + "\n");
		
	}

}
