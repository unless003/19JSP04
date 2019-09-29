package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
	
	public static Connection getMyConnection () throws ClassNotFoundException , SQLException{
		String hostName = "localhost";
		String dbName="demo1";
		String userName="root";
		String passWord="trung123";
		return getMyConnection(hostName, dbName, userName, passWord);
	}

	public static Connection getMyConnection(String hostName , String dbName, String userName, String passWord) 
	throws SQLException, ClassNotFoundException  {
		
		// TODO Auto-generated method stub
		String connectionURL  ="jdbc:mysql://"+ hostName + ":3306/"+ dbName;
		Connection conn = DriverManager.getConnection(connectionURL, userName, passWord);
		return conn;
	}
	public static void main(String[] args) {
		try {
			Connection conn = getMyConnection();
			System.out.println(conn);
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

}
