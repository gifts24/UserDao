package user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DConnectionMaker implements ConnectionMaker {
	
	
	@Override
	
	
	public Connection makeConnection() throws ClassNotFoundException, SQLException{	// 						connection을 생성하는 메소드
	
		
		
		
		Class.forName("com.mysql.jdbc.Driver");	//				 											D사 DB		
		Connection c = 	DriverManager.getConnection("jdbc:mysql://localhost/javadb", "root", "1234");	//  DB Connection을 생성한다.
		
		
		
		return c;	// 																						c값을  return 한다
	
	
}





}
