package jdbcdemo;

import java.sql.*;

public class Driver {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	final String url = "jdbc:mysql://localhost:3306/demo";
	final String user = "root";
	final String password = "root";
	
	try {
	    Connection sqlConnection = DriverManager.getConnection(url, user, password);
	    final String sqlCommand = "insert into employees "
	    			+ " (last_name, first_name, email)"
	    			+ " values ('Brown', 'David', 'david.brown@foo.com')";
	    PreparedStatement prepStat = sqlConnection.prepareStatement(sqlCommand);
	    try {
		prepStat.executeUpdate();
		System.out.println("Update successful.");
	    } catch (SQLException sqle) {
		sqle.printStackTrace();
		System.out.println("Update failed.");
	    }
	    
	} catch (Exception exc) {
	    exc.printStackTrace();
	}
	
    }

}
