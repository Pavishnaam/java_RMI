package java_rmi;

import java_rmi.DBinterface;
import java.rmi.Remote;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java_rmi.DBImpl;



public class telServer extends telImpl {
public telServer() {}
public static void main(String args[]) {
try {
// Instantiating the implementation class
telImpl obj = new telImpl();
telInterface stub = (telInterface) UnicastRemoteObject.exportObject((Remote) obj, 0);
Registry registry = LocateRegistry.createRegistry(1712);
registry.rebind("Welcome to client side.....", stub);
System.err.println("Server ready");
} catch (Exception e) {
System.err.println("Server exception: " + e.toString());
e.printStackTrace();
}
}
}
