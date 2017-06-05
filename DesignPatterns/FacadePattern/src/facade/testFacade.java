package facade;

import subsystem.CdPlayer;
import subsystem.TV;

/**
 * In this case their will be only one very simple facade
 * note: their can be multiple facades of the same subsystem
 * @author robin
 *
 */
public class testFacade {
	
	public static void main(String[] args) {
		/**
		 * Normally the Client is this method and gets a Facade
		 * without having to initate the components
		 */
		CdPlayer cdPlay = new CdPlayer();
		TV tv = new TV();
		
		HomeTheaterFacade fac = new HomeTheaterFacade(cdPlay, tv);
		
		/**
		 * looks like a basic comand pattern here but the idead
		 * is to put in a bunch of components into the facade and
		 * use them all at once
		 */
		fac.watchMovie();
		/**
		 * one method call archivies 2 things
		 */
		
		/**
		 * other methods like fac.shutDownSystem();
		 * turn on stereoPart();
		 * are prossible
		 * al
		 */
	}

}
