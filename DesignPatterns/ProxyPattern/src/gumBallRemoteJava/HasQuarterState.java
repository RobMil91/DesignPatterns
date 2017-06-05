package gumBallRemoteJava;

public class HasQuarterState implements State {

	transient GumballMachine gumballMachine;
	
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		/**
		 * normally you throw exceptions here??
		 */
		System.out.println("you cant insert antother quarter");

	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("return the quarter you put in");
		gumballMachine.setState(gumballMachine.getNoQuarterState());

	}

	@Override
	public void turnCrank() {
		System.out.println("You turned with money in this time...");
		//carefull with similiar names
		gumballMachine.setState(gumballMachine.getSoldState());

	}

	@Override
	public void dispense() {
		System.out.println("no gumball dispensed");

	}

}
