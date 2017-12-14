package user.dao;

import java.sql.SQLException;

import user.domain.User;

public class UserDaoTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		UserDao dao = new UserDao();	// 													UserDao 생성 한다
		
		User user = new User();			// 													user 생성 한다
		
		user.setId("123456");			// 													id 입력 한다
		
		user.setName("전주엽");			// 													name 입력 한다
		
		user.setPassword("1234");		// 													password 입력 한다
		
		dao.add(user);					// 													Dao에 입력값을 추가 한다.
		
		System.out.println(user.getId() + " 등록 성공");	//									 등록 성공 메시지 출력 한다
		
		User user2 = dao.get(user.getId());	// 												user2 생성 한다
		
		System.out.println(user2.getName());	// 											name값 조회 한다
		System.out.println(user2.getId());		// 											id값 조회 힌디
		System.out.println(user2.getPassword() + " 조회 성공");	//								password 조회 + 조회 성공 메시지 출력 한다
	}
}
