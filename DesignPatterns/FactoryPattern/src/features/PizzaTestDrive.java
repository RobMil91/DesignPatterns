package features;
import pizzaStores.*;
//only have to import Pizza?!
import pizzas.Pizza;

public class PizzaTestDrive {

	public static void main(String[] args) {
		//create to stores
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();

		//create an NY cheese pizza
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ordered a Cheese Pizza from nyStore " + pizza.getName() + "\n");
		
		//create an NY cheese pizza
		//very weird to use the same object pizza for a different pizza it overwrites the old pizza..
		 pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Ordered a Cheese Pizza from chicago store " + pizza.getName() + "\n");
		
	}

}
