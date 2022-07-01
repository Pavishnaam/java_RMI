import java.rmi.*;
import java.rmi.registry.*;
import java.io.*;
import java.util.*;


public class hospitalClient {
    public static void main(String[] args)throws Exception
    {
        Registry registry = LocateRegistry.getRegistry(1781);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ENTER PLACE : ");
        String place =sc.next();
        System.out.println("ENTER SPECIALITY : ");
        String speciality =sc.next();
       

        hospital stub = (hospital) registry.lookup("hospital");
        System.out.println("NAME : "+ stub.hospital(place,speciality));


    }
}
