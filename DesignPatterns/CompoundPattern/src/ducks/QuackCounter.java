package ducks;

/**
 * Introduce the decorator Pattern to the mix
 * @author robin
 *
 */
public class QuackCounter implements Quackable{
	
	Quackable duck;
	
	static int numberOfQuacks;
	
	public QuackCounter(Quackable duck) {
		this.duck = duck;
		
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("Quack");
		numberOfQuacks++;
		
	}
	
	/**
	 * static so i can use it in main?
	 * @return
	 */
	public static int getQuacks() {
		
		return QuackCounter.numberOfQuacks;
	}

}
