package user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class NUserDao extends UserDao{	//																	N�� Dao
	
	
	public Connection getConnection() throws ClassNotFoundException, SQLException{	// 						����� �ؼ� Ȯ����  getConnection �޼ҵ�
		
		
		Class.forName("com.mysql.jdbc.Driver");	// 															N�� DB		
		Connection c = 	DriverManager.getConnection("jdbc:mysql://localhost/javadb", "root", "1234");	//  N�� DB Connection ����
		
		
		return c;	// 																						c����  return �Ѵ�
	
}
}
