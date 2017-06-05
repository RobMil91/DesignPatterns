package gumBallRemoteJava;

import java.io.Serializable;

/**
 * implement seriazible from java.io
 * @author robin
 *
 */
public interface State extends Serializable{
	
	public void insertQuarter();
	public void ejectQuarter();
	public void turnCrank();
	public void dispense();

}
