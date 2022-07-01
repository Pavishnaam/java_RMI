import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.UnicastRemoteObject;



public class ticketServer {
    public static void main(String[] args) throws Exception
    {
        ticketImpl obj;
        obj = new ticketImpl();

        // Exporting the object of implementation class
        // (here we are exporting the remote object to the stub)
        ticket stub = (ticket) UnicastRemoteObject.exportObject((Remote) obj, 0);

        // Binding the remote object (stub) in the registry
        Registry registry = LocateRegistry.createRegistry(1780);

        registry.rebind("ticket", stub);
        System.err.println("Server ready");

    }
}
