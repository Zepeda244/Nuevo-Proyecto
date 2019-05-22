package Server;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author luiscobian
 */
public interface RemoteObject extends Remote{
    
    public String getSaludo(String nombre) 
            throws RemoteException;
    
}
