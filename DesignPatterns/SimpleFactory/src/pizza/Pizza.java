package pizza;

/**
 * The class pizza shoudnt be instanziaded
 * only the subclasses which are actual pizza's
 * @author robin
 *
 */
public abstract class Pizza {

	//abstract mehods which have to be used in the subclasses!
	//this is important otherwise there could be Problems while using the actual pizza
	public abstract void prepare();	
	
	public abstract void bake();
	
	public abstract void cut();
	
	//do i want them to be needed as implmentation??
	public  void box() {
		System.out.println("i am getting boxed, method of abstract pizza because all pizzas can be boxed the same");
		System.out.println("if you read this the builder of the actual pizza was to lazy to override the box method himself");
		System.out.println("or maybe he knew about the method and was smart");
	};
}

