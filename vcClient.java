package java_rmi;
import java.rmi.*;
import java.rmi.registry.*;
import java.io.*;
import java_rmi.vc;


public class vcClient {
    public static void main(String[] args)throws Exception
    {
        Registry registry = LocateRegistry.getRegistry(1785);

        vc stub = (vc) registry.lookup("vc");
        System.out.println(stub.vc("pavi"));

    }
}
