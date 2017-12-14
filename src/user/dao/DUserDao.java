package user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DUserDao extends UserDao{
	
	
	public Connection getConnection() throws ClassNotFoundException, SQLException{	// 							상속을 해서 확장한  getConnection 메소드
	
		
		
		Class.forName("com.mysql.jdbc.Driver");	//																D사 DB		
		Connection c = 	DriverManager.getConnection("jdbc:mysql://localhost/javadb", "root", "1234");	//  	D사 DB Connection을 생성한다.
		
	
		
		
		return c;	// 																							c값을  return 한다
	
	
	
	
	}
}
