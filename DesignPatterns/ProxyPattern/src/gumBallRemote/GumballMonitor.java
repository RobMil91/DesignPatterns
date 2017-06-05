package gumBallRemote;

/**
 * class to report the behavior of the gumballmachine
 * @author robin
 *
 */
public class GumballMonitor {

	GumballMachine machine;
	
	public GumballMonitor(GumballMachine machine) {
		this.machine = machine;
	}
	
	
	public void report() {
		
		System.out.println("Gumball Machine Location: " + machine.getLocation());
		System.out.println("Current Inventory: " +  machine.getCount());
		//will throw object number code i guess?
		System.out.println("Current State: " + machine.getState());
	}
}
