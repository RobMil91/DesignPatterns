package command;
import lightExample.Light;

/**
 * specific command example
 * @author robin
 *
 */
public class LightOnCommand implements Command{
	
	//own Attribute for command use?!
	Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}

	/**
	 * Method created by Interface
	 */
	@Override
	public void excecute() {
		// TODO Auto-generated method stub
		//define special behavior of the command
		//note it is only on because the entire command
		//is only for on!
		light.on();
		
	}

}
