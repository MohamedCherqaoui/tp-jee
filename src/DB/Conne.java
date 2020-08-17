package Dao;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

public class Connexion {
private Connection con;
private Statement stm;


public void connect () throws Exception {
	
	
	Class.forName("com.mysql.jdbc.Driver");
	
	 String url = "jdbc:mysql://localhost/mydb";
	 con=(Connection) DriverManager.getConnection(url, "root","");
	 stm=(Statement) con.createStatement();
}

public void disconnect () throws Exception {
	stm.close();
	con.close();
}

public int Maj(String sql ) throws Exception {

	return stm.executeUpdate(sql);
	
}
public ResultSet Select(String sql) throws SQLException {
	
	return (ResultSet) stm.executeQuery(sql);

}

}

