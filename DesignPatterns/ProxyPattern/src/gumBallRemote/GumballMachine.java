package gumBallRemote;

/**
 * THe GumballMachine should now handle a location
 * @author robin
 *
 */
public class GumballMachine {

	/**
	 * use clases of the Interface State
	 * 
	 */
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	
	/**
	 * --------------------------------------->ad the location here
	 */
	String location;
	
	

	State state = soldOutState;
	//to keep track how often the State changed?
	int count = 0;
	
	/**
	 * ---------------------------------------------> add location to constructor 
	 * @param gumballs
	 */
	public GumballMachine(int gumballs, String location) {
		
		this.location = location;
		this.count = gumballs;
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		
		//initate into right state
		if (gumballs > 0) {
			
			//this is my current state now
			state = noQuarterState;
			
		}
		
	}
	
	/**
	 * public method to put a quarter in the state machine
	 * 
	 * all states should be reachable?!
	 * ----------------------------these are the actionMethods
	 */
	public void insertQuarter() {
		state.insertQuarter();
	}
	
	public void ejectQuarter() {
		state.ejectQuarter();
	}
	
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}
	
	
	
	/**
	 * Set state Method so the No Quarter State can change the state of the machine!
	 */
	public void setState(State state) {
		this.state = state;
	}
	
	
	public void releaseBall() {
		System.out.println("A gumball is rolling out...  ");
		if (count != 0) {
			count = count - 1;
		}
	}
	
	
	
	//-----------------------------more methods with getters and for count of gumballs and so on
	
	
	public State getSoldOutState() {
		return soldOutState;
	}


	public State getNoQuarterState() {
		return noQuarterState;
	}


	public State getHasQuarterState() {
		return hasQuarterState;
	}


	public State getSoldState() {
		return soldState;
	}


	public int getCount() {
		return count;
	}
	
	/**
	 * -----------------------------------------------> getter as always
	 * @return
	 */
	public String getLocation() {
		return this.location;
	}
	
	/**
	 * maybe needed for testing..
	 */
	public String toString() {
		return null;
	}

	public String getState() {
		// TODO Auto-generated method stub
		return this.state.toString();
	}

}
