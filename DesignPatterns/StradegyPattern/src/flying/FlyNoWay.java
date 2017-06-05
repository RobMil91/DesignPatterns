package flying;

/**
 * FlyBehavior class for all ducks that cant fly
 * @author robin
 *
 */
public class FlyNoWay implements FlyBehavior {

	
	
	@Override
	public void fly() {
		System.out.println("i can't fly");
		
	}

}
