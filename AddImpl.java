
import java.rmi.*;
import java.rmi.server.*;

public class AddImpl implements Addition{

    public int addition(int a,int b){
        int sum = a+b;
        return sum;
    }
    public int subtract(int a,int b){
        return(a-b);
    }
}