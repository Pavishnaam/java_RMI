import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.UnicastRemoteObject;



public class validateServer {
    public static void main(String[] args) throws Exception
    {
        validateImpl obj;
        obj = new validateImpl();

        // Exporting the object of implementation class
        // (here we are exporting the remote object to the stub)
        validate stub = (validate) UnicastRemoteObject.exportObject((Remote) obj, 0);

        // Binding the remote object (stub) in the registry
        Registry registry = LocateRegistry.createRegistry(1710);

        registry.rebind("Validate", stub);
        System.err.println("Server ready");

    }
}
