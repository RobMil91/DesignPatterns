package lightExample;

import command.LightOnCommand;

import remotes.SimpleRemoteControl;

/**
 * Test to check if lighOn Command is working
 * @author robin
 *
 */
public class RemoteControlTest {
	
	public static void main(String[] args) {
		
		
		/**
		 * Invoker who will pass a commnd object
		 */
		SimpleRemoteControl remote = new SimpleRemoteControl();
		/**
		 * Receiver for the request
		 */
		Light light = new Light();
		
		/**
		 * Create a Command with the receiver of the request
		 */
		LightOnCommand lightOn = new LightOnCommand(light);
		
		/**
		 * Pass command to invoker
		 */
		remote.setCommand(lightOn);
		/**
		 * Invoker activates the command 
		 */
		remote.buttonWasPressed();
		
		
		
	}

}
