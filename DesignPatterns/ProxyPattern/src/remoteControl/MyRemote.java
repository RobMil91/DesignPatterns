package remoteControl;

import java.rmi.*;

/**
 * MyRemote is an interface and Remote is the Interface
 * of rmi that i extend(inherit) from
 * 
 * 
 * use the java rmi class?!
 * what methods does that give me??
 * @author robin
 *
 */
public interface MyRemote extends Remote{
	
	/**
	 * all clases have to declare a remote Exception!
	 * @return
	 * @throws RemoteException
	 */
	public String sayHello()throws RemoteException;

}
