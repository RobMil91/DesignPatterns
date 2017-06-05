package adapter;

/**
 * example of the turkey class
 * @author robin
 *
 */
public class Wildturkey implements Turkey{

	@Override
	public void gobble() {
		// TODO Auto-generated method stub
		System.out.println("Gobble Gobble");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("I am flying my short distance");
		
	}

}
