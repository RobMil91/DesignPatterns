package gumBallRemoteJava;

import java.rmi.*;

public interface GumballMachineRemote extends Remote{
	
	public int getCount() throws RemoteException;
	
	public String getLocation() throws RemoteException;
	
	/**
	 * the paramters need to be primitive or seriazible
	 * @return
	 * @throws RemoteException
	 */
	public State getState() throws RemoteException;

}
