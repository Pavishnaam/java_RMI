package java_rmi;



import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class telImpl implements telInterface{
public void mobile_details(int mobile)
{
System.out.println("Inside implementation method...");
try{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/pavidb", "root", "987654321");
Statement stmt=conn.createStatement();
System.out.println("Connection established...");
ResultSet rs = stmt.executeQuery ("select * from tel where mobile = "+mobile);
//System.out.println("Record retrieved...");
if (rs.next()){
System.out.println (rs.getInt (1) + " exist in the database... " );
}
else{
System.out.println (mobile + "  doesn't exist in the database... " );
}
}catch(SQLException | ClassNotFoundException ex)
{
Logger.getLogger(telImpl.class.getName()).log(Level.SEVERE, null, ex);
}
}
}