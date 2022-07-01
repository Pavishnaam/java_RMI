
import java.util.*;

public class lists{
    public static void main(String args[])
    {
        List<String> al = new ArrayList<>();
        //List<Integer>
        //List<Book>
        // Set<String> s1 = new HashSet<String>();
        al.add("new year");
        al.add("pongal");
        al.add("diwali");
        al.add("christmas");
        al.add("holi");
        // String[] sa=new String[5];
        String[] sa=al.toArray(new String[al.size()]);
        System.out.println(sa[1]);
        System.out.println(Arrays.toString(sa));
        // s1.addAll(al);
        System.out.println(al);
        // System.out.println(s1);
        al.set(4,"navaratri");
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        al.remove(4);
        System.out.println("After Removal....");
        System.out.println(al);
        al.add("muharram");
        System.out.println(al);
        al.add(1,"onam");
        System.out.println(al);
    }
}

