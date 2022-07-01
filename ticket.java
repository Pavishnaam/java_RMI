import java.rmi.*;

public interface ticket extends Remote{
    public int ticket(String name,int age,String gender,String s_loc,String d_loc) throws RemoteException;
    
}
