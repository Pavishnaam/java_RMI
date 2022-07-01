
import java.rmi.*;
import java.rmi.server.*;
import java.util.ArrayList;
import java.util.List;

public class hospitalImpl implements hospital{
    public String hospital(String place,String speciality)
    {
        String h_name="";
        ArrayList<String> l = new ArrayList<String>();
        l.add("abc");l.add("kovai");l.add("cardio");l.add("7896546784");
        ArrayList<String> x = new ArrayList<String>();
        x.add("xyz");x.add("delhi");x.add("neuro therapy");x.add("5467865789");
        ArrayList<String> y = new ArrayList<String>();
        y.add("erode");y.add("salem");y.add("100");y.add("8745674576");
        
        if(l.contains(speciality)&& l.contains(place)){
            h_name=l.get(0);
         }
        if(x.contains(speciality)&& x.contains(place)){
            h_name=x.get(0);
         }
        if(y.contains(speciality)&& y.contains(place)){
            h_name=y.get(0);
         }
        return h_name;
    }
}