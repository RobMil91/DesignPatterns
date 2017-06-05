package pizzaStores;

import pizzas.ChicagoStylePepperoniPizza;
import pizzas.ChicagoSytleCheesePizza;
import pizzas.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String item) {
		
		if (item.equals("cheese")) {
			return new ChicagoSytleCheesePizza();
		} else if (item.equals("pepperoni")) {
			return new ChicagoStylePepperoniPizza();
		} else return null;
	}

}
