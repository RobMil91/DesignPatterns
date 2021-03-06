package gumBallRemote;

public class SoldState implements State {
	
	GumballMachine gumballMachine;
	
	public SoldState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You cant insert a Quarter, when the machine is trying to give you a quarter");

	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("you already turned the crank so you cant get the money back!");

	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("Turning more than once doesnt change anything");

	}

	@Override
	public void dispense() {
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		} else {
			
			System.out.println("Oops, out of gumbals");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}

	}

}
