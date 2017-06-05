package pizza;




/**
* The SalamiPizza Class implements the Pizza Interface
* by extending! It still has to implement all the 
* Methods from the main class
* it also will overwrite the box method because slamis are to
* big to box ..(random example)
* @author robin
*
*/
public class SalamiPizza extends Pizza {

	


	//this should be done in the Pizza Interface to ensure that all Pizzas can be descripted
	//for testing i make an exception..
	
	String description;
	
	
	public SalamiPizza() {
		this.description = "CheesePizza";
	}

	//methods can be set so they have to be implemented
	@Override
	public void prepare() {
		System.out.println("Cutting the SalamiPizza");
		
	}

	@Override
	public void bake() {
		System.out.println("pizza is getting baked");
		
	}

	@Override
	public void cut() {
		System.out.println("pizza is getting cut");
		
	}
	
	@Override
	public void box() {
		System.out.println("salami is weirdly shaped, need to box differntly, so i override the not abstract method because in this case i want to");
	}

	//methods can be  left out the box method is not overwritten here. which means 
	//it can be used from the abstract father class
	
	public String toString() {
		return this.description;
	}

	
	
	





}
