package facade;

import subsystem.*;

/**
 * this is the facade which includes all the
 * subsystem classes
 * @author robin
 *
 */
public class HomeTheaterFacade {
	
	/**
	 * private maybe not needed
	 * here has to be the full subsystem
	 */
	private CdPlayer cdPlay;
	private TV tv;
	
	/**
	 * constructor initaties all??
	 * need to do that
	 * varity in subsystem maybe
	 * @param cdPlay
	 * @param tv
	 */
	public HomeTheaterFacade(CdPlayer cdPlay, TV tv) {
		this.cdPlay = cdPlay;
		this.tv = tv;
	}
	
	
	/**
	 * now the important methods of the pattern come
	 * they need to use multiple instances of subysystem
	 * to archive their purpose
	 */
	
	public void watchMovie() {
		//probably unusefull here.. 
		cdPlay.on();
		tv.on();
	}
	
	

}
