package java_rmi;

import java.sql.*;
import java.util.logging.*;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.logging.Level;
//import java.util.logging.Logger;

public class DBImpl implements DBinterface{
public void studentDetails(int regno)
{
System.out.println("Inside implementation method...");
try{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/pavidb", "root", "987654321");
Statement stmt=conn.createStatement();
System.out.println("Connection established...");
ResultSet rs = stmt.executeQuery ("select * from stud where reg = "+regno);
System.out.println("Record retrieved...");
while (rs.next())
System.out.println (rs.getInt (1) + " " + rs.getString (2));
}catch(SQLException | ClassNotFoundException ex)
{
Logger.getLogger(DBImpl.class.getName()).log(Level.SEVERE, null, ex);
}
}
}