package gumBallRemoteJava;

import java.rmi.Naming;

/**
 * somehow the rmiregistery has to be run first before this can work...............
 * @author robin
 *
 */
public class GumballMachineTestDrive {
	
	public static void main(String[] args) {
		
		//initiate a remote
		GumballMachineRemote gumballMachine = null;
		
		int count = 5;
		
		
		try {
			
			//create the GumballMachine
			gumballMachine = new GumballMachine(count, "San Francisco");
			
			/**
			 * add it to the server?!
			 */
			Naming.rebind("//" + "San Francisco" + "/gumballmachine", gumballMachine);
			
			
			
			
		} catch ( Exception ex) {
			ex.printStackTrace();
		}
	
		
		
	}

}