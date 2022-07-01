package java_rmi;

import java_rmi.DBinterface;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.*;



public class telClient {
private telClient() {}
public static void main(String[] args) {
try {
// Getting the registry
Registry registry = LocateRegistry.getRegistry(1712);

// Looking up the registry for the remote object
telInterface stub = (telInterface) registry.lookup("Welcome to client side.....");
Scanner sc = new Scanner(System.in);
int mobile = sc.nextInt();
System.out.println("Calling method...");
stub.mobile_details(mobile);

// System.out.println("Remote method invoked");
} catch (NotBoundException | RemoteException e) {
System.err.println("Client exception: " + e.toString());
e.printStackTrace();
}
}
}
