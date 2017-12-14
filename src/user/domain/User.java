package user.domain;

public class User {
	
	String id;			// 							String type id 생성 한다
	String name;		// 							String type name 생성 한다
	String password;	//						    String type password 생성 한다
	
	
	public String getId() {	// 						id getter 함수
		return id;			// 						id값을 return 한다 
	}
	
	public void setId(String id) {	//			    id setter 함수
		this.id = id;				//			    id값을 저장 한다
	}
	
	public String getName() {	// 					name getter 함수 
		return name;			// 					name값을 return 한다
	}
	
	public void setName(String name) {	// 			name setter 함수
		this.name = name;				// 			name값을 저장 한다
	}
	
	public String getPassword() {	// 				password getter 함수
		return password;			// 				password값을 return 한다
	}
	
	public void setPassword(String password) {	//  password setter 함수
		this.password = password;				//  password값을 저장 한ㄷ
	}
}
