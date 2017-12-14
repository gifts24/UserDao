package user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class NConnectionMaker implements ConnectionMaker {
	@Override
	public Connection makeConnection() throws ClassNotFoundException, SQLException {	//  				connection을 생성하는 메소드
		Class.forName("com.mysql.jdbc.Driver");	// 															N사 DB		
		Connection c = 	DriverManager.getConnection("jdbc:mysql://localhost/javadb", "root", "1234");	//  N사 DB Connection 생성
		
		return c;	// 																						c값을 return 힌디
	}
}
