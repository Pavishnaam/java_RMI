
import java.rmi.*;
import java.rmi.server.*;
import java.util.ArrayList;
import java.util.List;

public class ticketImpl implements ticket{
    String name;int age;String gender;String s_loc;String d_loc;int cost;int amount=0;
    public int ticket(String name,int age,String gender,String s_loc,String d_loc)
    {
        int amount=0; int total_cost=0;
        ArrayList<String> l = new ArrayList<String>();
        l.add("chennai");l.add("kovai");l.add("500");
        ArrayList<String> x = new ArrayList<String>();
        x.add("salem");x.add("delhi");x.add("1000");
        ArrayList<String> y = new ArrayList<String>();
        y.add("erode");y.add("salem");y.add("100");
        
        if(l.contains(s_loc)&& l.contains(d_loc)){
            amount = Integer.parseInt(l.get(2));
         }
        if(x.contains(s_loc)&& x.contains(d_loc)){
            amount = Integer.parseInt(x.get(2));
         }
        if(y.contains(s_loc)&& y.contains(d_loc)){
            amount = Integer.parseInt(y.get(2));
         }
        if(age>=60){
            total_cost = (amount *50)/100;
        }
        else if(age<10){
            total_cost = (amount *25)/100;
        }
        else{
            total_cost = amount;
    }
        return total_cost;
    }
}