package remotes;

import command.Command;
import command.NoCommand;

public class RemoteControl {
	
	Command[] onCommands;
	Command[] offCommands;
	
	/**
	 * Constructor which sets and initiates Arrays of Commands
	 */
	public RemoteControl() {
		
		onCommands = new Command[7];
		offCommands = new Command[7];
		
		//optianally set null?!
		Command noCommand = new NoCommand();
		
		/**
		 * everything empty at start
		 */
		for (int i = 0; i < 7; i++) {
			
			onCommands[i] =  noCommand;
			offCommands[i] = noCommand;
			
		}
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		
		
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	/**
	 * same with off...
	 * @param slot
	 */
	public void onButtonPush(int slot) {
		onCommands[slot].excecute();
		
	}
	
	
	

}