import java.rmi.*;

public interface validate extends Remote{
    public boolean validate(String reg) throws RemoteException;
}