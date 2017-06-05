package command;

/**
 * Encapsulates an ammount of commands into one
 * In context usefull because it doesnt need 
 * infinitly ammount of buttons 
 * MacroCommand can be hardcoded but this is flexible with
 * the ammount of commands
 * @author robin
 *
 */
public class MacroCommand implements Command{
	
	Command[] commands;
	
	
	public MacroCommand(Command[] commands) {
		
		this.commands = commands;
	}

	@Override
	public void excecute() {
		for (int i = 0; i < commands.length; i++) {
			commands[i].excecute();
		}
		
	}

}
