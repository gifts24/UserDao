package user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SimpleConnectionMaker {
	public Connection makeNewConnection() throws ClassNotFoundException, SQLException{
		
	
		String DBConnection = "dbc:mysql://localhost/javadb";	// 							DB connection을 생성 한다
		
		String DB_ID = "root";									//			 	 	 		DB id를 생성 한다
		
		String DB_Password = "1234";							//							DB password를 생성 한다
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");		// 				DB 로 접속을 준비 한다
		
		Connection c = DriverManager.getConnection(DBConnection, DB_ID, DB_Password);	//  DB 연결을 위한 connection 생성 한다
	
		return c;		//																	c값을 return 한다
	}
}
