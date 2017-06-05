package doorExample;

import command.GarageDoorOpenCommand;

import remotes.SimpleRemoteControl;

public class RemoteGarageTest {
	
	public static void main(String[] args) {
		
	
	
	SimpleRemoteControl remote = new SimpleRemoteControl();
	
	GarageDoor door = new GarageDoor();
	
	GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(door);
	
	remote.setCommand(garageOpen);
	remote.buttonWasPressed();
	
	
	}
}
