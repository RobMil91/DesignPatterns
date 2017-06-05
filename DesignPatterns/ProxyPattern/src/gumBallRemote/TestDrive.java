package gumBallRemote;

public class TestDrive {
	
	public static void main(String[] args) {
		
		//in headfirst with read in stuff..
		
		GumballMachine gumballMachine = new GumballMachine(5, "Heidelberg");
		
		/**
		 * throw the gumballMachine in the monitor!
		 */
		GumballMonitor monitor = new GumballMonitor(gumballMachine);
		
		
		
		monitor.report();

	}

}
