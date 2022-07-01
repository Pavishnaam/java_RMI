package java_rmi;



import java.rmi.Remote;
import java.rmi.RemoteException;
public interface telInterface extends Remote{
public void mobile_details(int regno) throws RemoteException;
}
