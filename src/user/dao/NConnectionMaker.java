package user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class NConnectionMaker implements ConnectionMaker {
	@Override
	public Connection makeConnection() throws ClassNotFoundException, SQLException {	//  				connection�� �����ϴ� �޼ҵ�
		Class.forName("com.mysql.jdbc.Driver");	// 															N�� DB		
		Connection c = 	DriverManager.getConnection("jdbc:mysql://localhost/javadb", "root", "1234");	//  N�� DB Connection ����
		
		return c;	// 																						c���� return ����
	}
}
