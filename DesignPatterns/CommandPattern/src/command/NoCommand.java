package command;

/**
 * Pattern Honarable Mention null Object!
 * class to set empty command
 * is usefull because we dont have to check for null in these
 * cases
 * @author robin
 *
 */
public class NoCommand implements Command{

	/**
	 * intentianally left empty
	 */
	@Override
	public void excecute() {
		
	}

}
