package gumBallRemoteJava;

/**
 * resembles a concrete State!
 * @author robin
 *
 */
public class SoldOutState implements State {
	
	transient GumballMachine gumballMachine;
	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("inserted a quarter, but wont get a gumiball");

	}

	@Override
	public void ejectQuarter() {
		System.out.println("i dont have a quarter right now..");

	}

	@Override
	public void turnCrank() {
		System.out.println("cant do stuff");

	}

	@Override
	public void dispense() {
		System.out.println("cant do stuff");

	}

}
