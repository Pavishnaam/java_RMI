import java.rmi.*;
import java.rmi.registry.*;
import java.io.*;


public class AddClient {
    public static void main(String[] args)throws Exception
    {
        Registry registry = LocateRegistry.getRegistry(1780);

        Addition stub = (Addition) registry.lookup("Addition");
        System.out.println("SUM : "+ stub.addition(5,6));
        System.out.println("DIFFERENCE : "+ stub.subtract(9,4));

    }
}
