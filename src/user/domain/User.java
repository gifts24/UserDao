package user.domain;

public class User {
	
	String id;			// 							String type id ���� �Ѵ�
	String name;		// 							String type name ���� �Ѵ�
	String password;	//						    String type password ���� �Ѵ�
	
	
	public String getId() {	// 						id getter �Լ�
		return id;			// 						id���� return �Ѵ� 
	}
	
	public void setId(String id) {	//			    id setter �Լ�
		this.id = id;				//			    id���� ���� �Ѵ�
	}
	
	public String getName() {	// 					name getter �Լ� 
		return name;			// 					name���� return �Ѵ�
	}
	
	public void setName(String name) {	// 			name setter �Լ�
		this.name = name;				// 			name���� ���� �Ѵ�
	}
	
	public String getPassword() {	// 				password getter �Լ�
		return password;			// 				password���� return �Ѵ�
	}
	
	public void setPassword(String password) {	//  password setter �Լ�
		this.password = password;				//  password���� ���� �Ѥ�
	}
}
