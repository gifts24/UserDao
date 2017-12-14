package user.dao;

import java.sql.SQLException;

import user.domain.User;

public class UserDaoTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		UserDao dao = new UserDao();	// 													UserDao ���� �Ѵ�
		
		User user = new User();			// 													user ���� �Ѵ�
		
		user.setId("123456");			// 													id �Է� �Ѵ�
		
		user.setName("���ֿ�");			// 													name �Է� �Ѵ�
		
		user.setPassword("1234");		// 													password �Է� �Ѵ�
		
		dao.add(user);					// 													Dao�� �Է°��� �߰� �Ѵ�.
		
		System.out.println(user.getId() + " ��� ����");	//									 ��� ���� �޽��� ��� �Ѵ�
		
		User user2 = dao.get(user.getId());	// 												user2 ���� �Ѵ�
		
		System.out.println(user2.getName());	// 											name�� ��ȸ �Ѵ�
		System.out.println(user2.getId());		// 											id�� ��ȸ ����
		System.out.println(user2.getPassword() + " ��ȸ ����");	//								password ��ȸ + ��ȸ ���� �޽��� ��� �Ѵ�
	}
}
