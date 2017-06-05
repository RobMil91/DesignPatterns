package ingredientFactory;

//interfaces are enough?! should be ...
import ingredientFactory.ingredients.interfaces.*;


/**
 * "Abstract" Interface for pizzas
 * Packacking this pattern is a disaster...
 * @author robin
 *
 */
public abstract class Pizza {

	String name;
	Dough dough;
	Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;
    
	//no constructor initiaten?!
	//shoudn't i declare an abstract connstructor so i dont forget to initated the
	//specialized behavior?
    
    //has now to be implemented instead of beining given by pizzas interface
    abstract void prepare();
	
	
	//doesnt garantie a toString method;
    
   // public abstract String toString();
    
    //it is also blocked because toString is system wide used?!
	

	
	

	
	/**
	 * the following methods are std values for a pizza they can be changed 
	 * but if not they still profide the standart 
	 */
	
    
    /**
     * also they are all only in package available so all using classes shoud be in this package?!
     */
	 void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
	
	 void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	 void box() {
		System.out.println("Place pizza in offical PizzaStore box");
	}
	
	  String getName() {
		return this.name;
	}
	 
	 void setName(String name) {
		this.name = name;
	}
	 
	 /**
	  * only public method 
	  */
	 public String toString() {
		 //toDo code for pizza print
		 //only name sufficient for now?!
		 //should probably add all that is on the pizza....
		 
		 // new adding for testing(not in book)
		 String s = null;
		 //for example reasons the clam is the only ingredient pictured here
		 s = this.name + " with Clams: " + this.clam.toString();
		 return s;
	 }
	
}
