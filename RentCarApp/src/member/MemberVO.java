package member;

public class MemberVO {
	String id;
	String password;
	String name;
	String address;
	String phoneNum;
	


	public MemberVO (String id, String password, String name, String address, String phoneNum) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.address = address;
		this.phoneNum = phoneNum;
	}
	
	//getter와 setter는 생략

}
