import java.rmi.*;

public interface hospital extends Remote{
    public String hospital(String place,String speciality) throws RemoteException;
    
}
