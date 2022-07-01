import java.util.regex.*;  
import java.rmi.*;
import java.rmi.server.*;

public class validateImpl implements validate{

    public boolean validate(String reg){
        Pattern p = Pattern.compile("[0-9]{2}[A-Z]{3}[0-9]{4}");//. represents single character  
        Matcher m = p.matcher(reg);  
        boolean b = m.matches(); 
        return b;
    }
    
}