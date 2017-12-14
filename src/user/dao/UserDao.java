package user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import user.domain.User;

public class UserDao {
	//private SimpleConnectionMaker simpleConnectionMaker;	// 											simpleConnectionMaker ���� �Ѵ�
	private ConnectionMaker connectionMaker;
	
	public UserDao(){	//																				������
		//simpleConnectionMaker = new SimpleConnectionMaker();	// 										simpleconnectionMaker ���� �Ѵ�
		this.connectionMaker = new NConnectionMaker();		// 											NConnectionMaker ���� �Ѵ�
		//this.connectionMaker = new DConnectionMaker();	// 											DConnectionMaker ���� �Ѵ�
	}
	
	public void add(User user) throws ClassNotFoundException, SQLException{	// 						         ����� ���� �޼ҵ�
		//Class.forName("com.mysql.jdbc.Driver");		//											    DB���� �غ�
		//Connection c = DriverManager.getConnection("jdbc:mysql://localhost/javadb", "root", "1234");// DB ������ ���� connection ����
		//Connection c = getConnection();	// 														    DB ����
		//Connection c = simpleConnectionMaker.makeNewConnection();	//								    DB ����
		Connection c = this.connectionMaker.makeConnection();	// 										DB ����
		PreparedStatement ps = c.prepareStatement("insert into users values(?,?,?)");	//			    DB insert�� ���
		
		ps.setString(1, user.getId());			// 														id �Է�
		ps.setString(2, user.getName());		// 														name�� �Է�
		ps.setString(3, user.getPassword());	//													    password �Է�
		ps.executeUpdate();						// 														insert�� execute
		
		ps.close();	// 																					insert ����
		c.close();	// 																					DB ���� ����
	}
	
	public User get(String id) throws ClassNotFoundException, SQLException{	// 							 ����� ������ �о���� �޼ҵ� ����
		//Class.forName("com.mysql.jdbc.Driver");				    // 									 DB���� �غ�
		//Connection c = DriverManager.getConnection("jdbc:mysql://localhost/javadb", "root", "1234");// DB ������ ���� connection ����
		//Connection c = getConnection();						    //									 DB ����
		//Connection c = simpleConnectionMaker.makeNewConnection();	// 									 DB ����
		Connection c = this.connectionMaker.makeConnection();	    //									 DB ����
		PreparedStatement ps = c.prepareStatement("select * from users where id=?");	//	 	 	  	 DB select�� ���
		
		ps.setString(1, id);						// 													 id�� �Է�
		ResultSet rs = ps.executeQuery();			// 													 select�� ����
		rs.next();									// 													  �������� 
		
		User user = new User();						// 													 user ����
		user.setId(rs.getString("id"));				// 													 id�� ��������
		user.setName(rs.getString("name"));			// 													 name�� ��������
		user.setPassword(rs.getString("password"));	//													 password�� ��������
		
		rs.close();	// 																					 rs ���� �Ѵ�
		ps.close();	// 																					 ps ���� �Ѵ�
		c.close();	// 																					 c  ���� �Ѵ�
		
		return user;	// 																				 user���� return �Ѵ�.
	}
	
	/*private Connection getConnection() throws ClassNotFoundException, SQLException{	// 				 DB ���� �޼ҵ� �ߺ��� ���� �޼ҵ� ����
		Class.forName("com.mysql.jdbc.Driver");		// DB���� �غ�
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost/javadb", "root", "1234");//   DB ������ ���� connection ����
	
		return c;							// 															 c���� return �Ѵ�.
	}*/
	
	//public abstract Connection getConnection() throws ClassNotFoundException, SQLException{	// 		 getConnection �޼ҵ� �߻�ȭ
		
	//}
}
