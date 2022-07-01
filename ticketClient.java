import java.rmi.*;
import java.rmi.registry.*;
import java.io.*;
import java.util.*;


public class ticketClient {
    public static void main(String[] args)throws Exception
    {
        Registry registry = LocateRegistry.getRegistry(1780);
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NAME : ");
        String name =sc.next();
        System.out.println("ENTER AGE : ");
        int age =sc.nextInt();
        System.out.println("ENTER GENDER : ");
        String gender =sc.next();
        System.out.println("ENTER SOURCE LOCATION : ");
        String s =sc.next();
        System.out.println("ENTER DESTINATED LOCATION : ");
        String d =sc.next();

        ticket stub = (ticket) registry.lookup("ticket");
        System.out.println("COST : "+ stub.ticket(name,age,gender,s,d));


    }
}
