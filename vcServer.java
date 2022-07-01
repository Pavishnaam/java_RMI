package java_rmi;
import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.UnicastRemoteObject;




public class vcServer {
    public static void main(String[] args) throws Exception
    {
        vcImpl obj;
        obj = new vcImpl();

        // Exporting the object of implementation class
        // (here we are exporting the remote object to the stub)
        vc stub = (vc) UnicastRemoteObject.exportObject((Remote) obj, 0);

        // Binding the remote object (stub) in the registry
        Registry registry = LocateRegistry.createRegistry(1789);

        registry.rebind("vc", (Remote) stub);
        System.err.println("Server ready");

    }
}
