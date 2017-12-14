package user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class NUserDao extends UserDao{	//																	N사 Dao
	
	
	public Connection getConnection() throws ClassNotFoundException, SQLException{	// 						상속을 해서 확장한  getConnection 메소드
		
		
		Class.forName("com.mysql.jdbc.Driver");	// 															N사 DB		
		Connection c = 	DriverManager.getConnection("jdbc:mysql://localhost/javadb", "root", "1234");	//  N사 DB Connection 생성
		
		
		return c;	// 																						c값을  return 한다
	
}
}
