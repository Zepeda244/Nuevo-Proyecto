package Server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteImplementObject 
extends UnicastRemoteObject
implements RemoteObject{

    public RemoteImplementObject() throws RemoteException {
        super(); 
    }
    
    @Override
    public String getSaludo(String nombre) throws RemoteException {
            String nombreMayus = nombre.toUpperCase(); 
            return "Nombre Mayusculas:  " + nombreMayus;
    }
    
}
