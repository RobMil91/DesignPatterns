package pizzas;

import java.util.ArrayList;

/**
 * Advantage of this class built is that you only have to built a
 * constructor and your good to go with a new pizza
 * you can then however change the methods like prepare if you like
 * but you dont have to -> confinient
 * @author robin
 *
 */
public abstract class Pizza {

	String name;
	String dough;
	String sauce;
	
	//shoudnt i declare that i want String as Generic Attribut?!
	//maybe the subclasses want to change that so, or create an
	//own class to add in there? but late generic identifier is also bad
	//i think it shoudnt be initiated here..
	ArrayList toppings = new ArrayList();
	
	
	
	
	//no constructor initiaten?!
	//shoudnt i declare an abstract connstructor so i dont forget to initated the
	//specialized behavior?
	
	
	/**
	 * orignally set to protected...
	 * but PizzaStore requires it to be public,
	 * because even the subclasses will still have 
	 * it as protected
	 */
	public void prepare() {
		System.out.println("Preparing" + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings: ");
		for (int i = 0; i < toppings.size(); i++) {
			System.out.println("  " + toppings.get(i));
		}
	}
	
	/**
	 * the following methods are std values for a pizza they can be changed 
	 * but if not they still profide the standart 
	 */
	
	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
	
	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	public void box() {
		System.out.println("Place pizza in offical PizzaStore box");
	}
	
	public String getName() {
		return this.name;
	}
	
}