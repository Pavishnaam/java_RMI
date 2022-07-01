package java_rmi;

import java.rmi.*;
import java.rmi.server.*;
import java.util.ArrayList;
import java.util.List;

public class vcImpl implements vc{
    public String vc(String name)
    {
        ArrayList<String> v = new ArrayList<String>();
        ArrayList<String> c = new ArrayList<String>();
        if (name.charAt(0)=='a' || name.charAt(0)=='e' || name.charAt(0)=='i' || name.charAt(0)=='o' || name.charAt(0)=='u'){
          v.add(name);  
        }
        else{
            c.add(name);
        }
        return "vowels = " + v.get(0) + "\n const = " + c.get(0);
    }
}