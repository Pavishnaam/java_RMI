import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.UnicastRemoteObject;

public class AddServer {
    public static void main(String[] args) throws Exception
    {
        AddImpl obj;
        obj = new AddImpl();

        // Exporting the object of implementation class
        // (here we are exporting the remote object to the stub)
        Addition stub = (Addition) UnicastRemoteObject.exportObject((Remote) obj, 0);

        // Binding the remote object (stub) in the registry
        Registry registry = LocateRegistry.createRegistry(1780);

        registry.rebind("Addition", stub);
        System.err.println("Server ready");

    }
}
