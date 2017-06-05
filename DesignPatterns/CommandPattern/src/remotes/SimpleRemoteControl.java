package remotes;
import command.Command;


public class SimpleRemoteControl {
	
	Command slot;
	
	public SimpleRemoteControl() {
		
	}
	
	/**
	 * Method to add a command to the Controller
	 * @param command
	 */
	public void setCommand(Command command) {
		
		slot = command;
	}
	
	/**
	 * call the exceute method from the interface
	 * the special behavior should be initiated
	 */
	public void buttonWasPressed() {
		
		slot.excecute();
	}

}
