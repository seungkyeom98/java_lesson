package Model;

public class MemberDTO {
		
	//Model: 데이터를 관리하는 멤버함수와 멤버변수 모인게 있는 클래스.
	//DTO(Data Transfer Object): 자료를 변형하는 '객체'를 생성하는 클래스.
	//->데이터를 가져오거나(getter), 변경하기(setter) 기능을 하는 멤버함수를 만든다.
	
	//1.필드(=멤버변수)->아이디,비밀번호,이름,나이(외부 클래스에서 이 클래스의 멤버함수(=메소드=기능)로만 접근할 수 있게, private으로 선언한다.)
	private String id;
	private String pw;
	private String name;
	private int age;
	
	//2.메소드(=멤버함수)
	
	//생성자 기능(=멤버함수=메소드)
	public MemberDTO(String id, String pw, String name, int age) {
		this.id=id;
		this.pw=pw;
		this.name=name;
		this.age=age;
	}
	//생성자 오버로딩(=메소드이름은 같지만, 매개변수 다른게 오버로딩)
	public MemberDTO(String id, String pw) {
		this.id=id;
		this.pw=pw;

	}	
	public MemberDTO(String id, String name, int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	
	//Model의 DTO(데이터 변형 객체)는 객체의 필드(=멤버변수)를 저장하기 위해 만든 클래스이다.
	//Controller의 DAO(데이터 접근 객체)는 객체
	

	//3.id,pw,name,age 데이터를 요청하면 return으로 돌려주는 getter 기능(=메소드=멤버함수)
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	
	
	
	
	
	
}
//필드-model-DTO-transfer
//필mT= 필드-model-DTO-transfer= 필므트


