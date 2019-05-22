package Cliente;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author luiscobian
 */
public class Client {
    
    public static void main(String[] args) {
        try{
        Registry reg = LocateRegistry.
                getRegistry("127.0.0.1",5001);
        Server.RemoteObject remoto; 
        remoto = (Server.RemoteObject)reg.lookup("OBJRemoto"); 
        String cadena = remoto.getSaludo("Luis"); 
        System.out.println("El nombre es " + cadena);
        }catch(RemoteException e){
            System.out.println("Error " + e.toString());
        } catch (NotBoundException ex) {
            System.out.println("Error " + ex.toString() );
        } 
    }
    
}
