package user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import user.domain.User;

public class UserDao {
	//private SimpleConnectionMaker simpleConnectionMaker;	// 											simpleConnectionMaker 생성 한다
	private ConnectionMaker connectionMaker;
	
	public UserDao(){	//																				생성자
		//simpleConnectionMaker = new SimpleConnectionMaker();	// 										simpleconnectionMaker 생성 한다
		this.connectionMaker = new NConnectionMaker();		// 											NConnectionMaker 생성 한다
		//this.connectionMaker = new DConnectionMaker();	// 											DConnectionMaker 생성 한다
	}
	
	public void add(User user) throws ClassNotFoundException, SQLException{	// 						         사용자 생성 메소드
		//Class.forName("com.mysql.jdbc.Driver");		//											    DB접속 준비
		//Connection c = DriverManager.getConnection("jdbc:mysql://localhost/javadb", "root", "1234");// DB 연결을 위한 connection 생성
		//Connection c = getConnection();	// 														    DB 접속
		//Connection c = simpleConnectionMaker.makeNewConnection();	//								    DB 접속
		Connection c = this.connectionMaker.makeConnection();	// 										DB 접속
		PreparedStatement ps = c.prepareStatement("insert into users values(?,?,?)");	//			    DB insert문 사용
		
		ps.setString(1, user.getId());			// 														id 입력
		ps.setString(2, user.getName());		// 														name을 입력
		ps.setString(3, user.getPassword());	//													    password 입력
		ps.executeUpdate();						// 														insert문 execute
		
		ps.close();	// 																					insert 종료
		c.close();	// 																					DB 연결 종료
	}
	
	public User get(String id) throws ClassNotFoundException, SQLException{	// 							 사용자 정보를 읽어오는 메소드 생성
		//Class.forName("com.mysql.jdbc.Driver");				    // 									 DB접속 준비
		//Connection c = DriverManager.getConnection("jdbc:mysql://localhost/javadb", "root", "1234");// DB 연결을 위한 connection 생성
		//Connection c = getConnection();						    //									 DB 접속
		//Connection c = simpleConnectionMaker.makeNewConnection();	// 									 DB 접속
		Connection c = this.connectionMaker.makeConnection();	    //									 DB 접속
		PreparedStatement ps = c.prepareStatement("select * from users where id=?");	//	 	 	  	 DB select문 사용
		
		ps.setString(1, id);						// 													 id값 입력
		ResultSet rs = ps.executeQuery();			// 													 select문 실행
		rs.next();									// 													  다음으로 
		
		User user = new User();						// 													 user 생성
		user.setId(rs.getString("id"));				// 													 id값 가져오기
		user.setName(rs.getString("name"));			// 													 name값 가져오기
		user.setPassword(rs.getString("password"));	//													 password값 가져오기
		
		rs.close();	// 																					 rs 종료 한다
		ps.close();	// 																					 ps 종료 한다
		c.close();	// 																					 c  종료 한다
		
		return user;	// 																				 user값을 return 한다.
	}
	
	/*private Connection getConnection() throws ClassNotFoundException, SQLException{	// 				 DB 접속 메소드 중복로 인한 메소드 추출
		Class.forName("com.mysql.jdbc.Driver");		// DB접속 준비
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost/javadb", "root", "1234");//   DB 연결을 위한 connection 생성
	
		return c;							// 															 c값을 return 한다.
	}*/
	
	//public abstract Connection getConnection() throws ClassNotFoundException, SQLException{	// 		 getConnection 메소드 추상화
		
	//}
}
