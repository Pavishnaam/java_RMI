import java.rmi.*;

public interface Addition extends Remote{
    public int addition(int a,int b) throws RemoteException;
    public int subtract(int a,int b) throws RemoteException;
}
