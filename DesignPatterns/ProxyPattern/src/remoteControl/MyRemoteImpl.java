package remoteControl;

import java.rmi.*;
import java.rmi.server.*;

/**
 * My own interface MyRemote has to be implemented here
 * @author robin
 *
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote{
	

	/**
	 * i dont have to implement the Remote Exception?! it is done in superclass??
	 */
	//@Override override is not needed to declare that this is overwritten..
	public String sayHello() {
		// TODO Auto-generated method stub
		return "Server say, 'Hey'";
	};
	
	
	
	/**
	 * the superclass constructor...?!!
	 * @throws RemoteException
	 */
	public MyRemoteImpl()throws RemoteException{}
	
	/**
	 * 
	 * -----------------------------------a Main Method in my Implementation??? feels bad man...
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		try {
			/**
			 * Call my own Class!!!
			 * 
			 * this binds my service to the RMI registery
			 */
			MyRemote service = new MyRemoteImpl();
			Naming.rebind("RemoteHello", service);
			//feels but to catch the on top Exception class
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}


	
	

}