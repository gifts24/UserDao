package user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SimpleConnectionMaker {
	public Connection makeNewConnection() throws ClassNotFoundException, SQLException{
		
	
		String DBConnection = "dbc:mysql://localhost/javadb";	// 							DB connection�� ���� �Ѵ�
		
		String DB_ID = "root";									//			 	 	 		DB id�� ���� �Ѵ�
		
		String DB_Password = "1234";							//							DB password�� ���� �Ѵ�
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");		// 				DB �� ������ �غ� �Ѵ�
		
		Connection c = DriverManager.getConnection(DBConnection, DB_ID, DB_Password);	//  DB ������ ���� connection ���� �Ѵ�
	
		return c;		//																	c���� return �Ѵ�
	}
}
