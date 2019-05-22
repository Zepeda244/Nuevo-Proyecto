package Server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luiscobian
 */
public class Server {
    
    public static void main(String[] args) {
        System.out.println("Abriendo servidor");
        RemoteImplementObject objR; 
        try {
            objR = new RemoteImplementObject();
            LocateRegistry.createRegistry(5001);
            Registry registry = LocateRegistry.getRegistry(5001);
            registry.rebind("OBJRemoto", objR);
            System.out.println("Servidor activo");

        } catch (RemoteException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
}
