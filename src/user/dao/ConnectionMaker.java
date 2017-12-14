package user.dao;



import java.sql.Connection;
import java.sql.SQLException;


public interface ConnectionMaker {
	
	
	public Connection makeConnection() throws ClassNotFoundException, SQLException;	 //          makeConnection() 五社球 持失
}
