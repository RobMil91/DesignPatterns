package remoteControl;

import java.rmi.*;

public class MyRemoteClient {
	
	/**
	 * My implementations always have a main method it seem were they
	 * initiate themselves
	 * @param args
	 */
	public static void main(String[] args) {
		new MyRemoteClient().go();
	}
	
	public void go() {
		
		try {
			//i call my remote i guess?? it has to be in the Registery
			/**
			 * i need the IP i guess and it has to be registered
			 */
			MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
			
			/**
			 * must acknowlege the RemoteException o.o??
			 */
			String s = service.sayHello();
			
			System.out.println(s);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}

}
