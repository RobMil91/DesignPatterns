package gumBallRemoteJava;

/**
 * always add transidient 
 * it tells JVM to not serialize this field
 * @author robin
 *
 */
public class NoQuarterState implements State {

	transient GumballMachine gumballMachine;
	
	/**
	 * Constructor with initates a Gumball Machine
	 * @param gumballMachine
	 */
	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	
	/**
	 * ---------------------Methods get written with the intent of their current state--------------
	 * exp. here i am in NoQuarter State and someone wants me to eject a quarter, so i dont have one!
	 */
	
	@Override
	public void insertQuarter() {
		System.out.println("You inserted a Quarter");
		/**
		 * setting the gumballMachine to a different state
		 * by using a basically static or object refernece in the gumball
		 * Machine, feels more OO but still unnecassary?!
		 */
		gumballMachine.setState(gumballMachine.getHasQuarterState());
		
	}

	@Override
	public void ejectQuarter() {
		System.out.println("I dont have a quarter, so i cant give it back, you didint insert it you thief!");
		
	}

	@Override
	public void turnCrank() {
		System.out.println("Crank will turn, nothing will hapen, because there is no quarter");
		
	}
	

	@Override
	public void dispense() {
		System.out.println("you need to pay first");
		
	}

}
