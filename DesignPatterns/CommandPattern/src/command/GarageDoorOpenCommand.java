package command;

import doorExample.GarageDoor;

public class GarageDoorOpenCommand implements Command{
	
	GarageDoor door;
	
	public GarageDoorOpenCommand(GarageDoor door) {
		this.door = door;
	}

	@Override
	public void excecute() {
		// TODO Auto-generated method stub
		
		door.open();
	}

}