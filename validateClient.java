import java.rmi.*;
import java.rmi.registry.*;
import java.io.*;


public class validateClient {
    public static void main(String[] args)throws Exception
    {
        Registry registry = LocateRegistry.getRegistry(1710);

        validate stub = (validate) registry.lookup("Validate");
        System.out.println("Validation : "+ stub.validate("20MIS1002"));

    }
}
