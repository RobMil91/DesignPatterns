package pizza;

/**
 * The CheesePizza implements the Pizza Interface
 * by extending! It still has to implement all the 
 * Methods from the main class
 * @author robin
 *
 */
public class CheesePizza extends Pizza{
	
	String description;
	
	
	public CheesePizza() {
		this.description = "CheesePizza";
	}

	//methods can be set so they have to be implemented
	@Override
	public void prepare() {
		System.out.println("Cutting the Cheesepizza, because i have overwritten something in here");
		
	}

	@Override
	public void bake() {
		System.out.println("pizza is getting baked");
		
	}

	@Override
	public void cut() {
		System.out.println("pizza is getting cut");
		
	}

	//methods can be  left out the box method is not overwritten here. which means 
	//it can be used from the abstract father class
	
	public String toString() {
		return this.description;
	}

	
	
	

}
