package teaExample;

public class Coffee extends CaffeineBevarge {

	/**
	 * this cant happen because of final!
	 otherwise you would use an override
	 even with the annotation it is not possible!
	 
	void prepareRecipe() {	
	}
	*/

	@Override
	void brew() {
		// TODO Auto-generated method stub
		System.out.println("Dripping Coffe through a filter");
	}

	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("Adding milk and Suagr");
		
	}

}