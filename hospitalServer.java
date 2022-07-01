import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.UnicastRemoteObject;



public class hospitalServer {
    public static void main(String[] args) throws Exception
    {
        hospitalImpl obj;
        obj = new hospitalImpl();

        // Exporting the object of implementation class
        // (here we are exporting the remote object to the stub)
        hospital stub = (hospital) UnicastRemoteObject.exportObject((Remote) obj, 0);

        // Binding the remote object (stub) in the registry
        Registry registry = LocateRegistry.createRegistry(1781);

        registry.rebind("hospital", stub);
        System.err.println("Server ready");

    }
}
