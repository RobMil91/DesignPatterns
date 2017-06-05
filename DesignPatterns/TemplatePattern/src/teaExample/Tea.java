package teaExample;

/**
 * concrete class which uses the Beverage interface because
 * it is unnecassary to always implement the add water and other 
 * standart methods 
 * @author robin
 *
 */
public class Tea  extends CaffeineBevarge{

	/**
	 * implement the method from Caffeine Beverage!
	 */
	@Override
	void brew() {
		System.out.println("Steeping the tea");
		
	}

	@Override
	void addCondiments() {
		//  Auto-generated method stub from Caffeine Beverage!
		System.out.println("Adding Lemon");
		
	}

}
