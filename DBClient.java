package java_rmi;

import java_rmi.DBinterface;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.*;



public class DBClient {
private DBClient() {}
public static void main(String[] args) {
try {
// Getting the registry
Registry registry = LocateRegistry.getRegistry(1792);

// Looking up the registry for the remote object
DBinterface stub = (DBinterface) registry.lookup("Hello");
Scanner sc = new Scanner(System.in);
int regno = sc.nextInt();
System.out.println("Calling method...");
stub.studentDetails(regno);

// System.out.println("Remote method invoked");
} catch (NotBoundException | RemoteException e) {
System.err.println("Client exception: " + e.toString());
e.printStackTrace();
}
}
}
