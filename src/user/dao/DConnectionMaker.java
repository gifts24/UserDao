package user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DConnectionMaker implements ConnectionMaker {
	
	
	@Override
	
	
	public Connection makeConnection() throws ClassNotFoundException, SQLException{	// 						connection�� �����ϴ� �޼ҵ�
	
		
		
		
		Class.forName("com.mysql.jdbc.Driver");	//				 											D�� DB		
		Connection c = 	DriverManager.getConnection("jdbc:mysql://localhost/javadb", "root", "1234");	//  DB Connection�� �����Ѵ�.
		
		
		
		return c;	// 																						c����  return �Ѵ�
	
	
}





}
