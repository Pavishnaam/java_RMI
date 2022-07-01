package java_rmi;



import java.rmi.Remote;
import java.rmi.RemoteException;
public interface DBinterface extends Remote{
public void studentDetails(int regno) throws RemoteException;
}
