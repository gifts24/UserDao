package user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DUserDao extends UserDao{
	
	
	public Connection getConnection() throws ClassNotFoundException, SQLException{	// 							����� �ؼ� Ȯ����  getConnection �޼ҵ�
	
		
		
		Class.forName("com.mysql.jdbc.Driver");	//																D�� DB		
		Connection c = 	DriverManager.getConnection("jdbc:mysql://localhost/javadb", "root", "1234");	//  	D�� DB Connection�� �����Ѵ�.
		
	
		
		
		return c;	// 																							c����  return �Ѵ�
	
	
	
	
	}
}
