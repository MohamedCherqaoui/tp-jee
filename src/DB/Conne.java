package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conne{
	private Connection con ;
	private Statement stm ;
 public void connect() {
	 class.forname("con.mysql.jdbc.Driver");
	 String url="jdbc:mysql://localhost/BDJEE";
	 con=DriverManager.getConnection(URL,"root","");
	 stm=con.createStatement();
 }	
public int MAJ(String sql) {
	return stm.executeUpdate(sql);
}
public resultSet Select (String sql) {
	return stm.executeQuery(sql);
}
public void Disconnect() {
	stm.close();
	con.close();
}
}
