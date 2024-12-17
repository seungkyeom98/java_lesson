package 클래스_객체_설계도_오브젝트;

public class Ex01Person {

	//클래스: 설계도
	//클래스의 구조: 필드+메소드
	//필드: 속성(data)
	//메소드: 행동(logic)
	
	
	//1. 필드의 정의(=선언) 부분(=part)
	String name;
	int age;
	
	//2. 메소드의 정의(행동의 로직 적는) 부분
	public void eat() {
		System.out.println("밥먹자 냠냠");
	}
	
	public void introduce() {
		System.out.println("안녕하세요 제 이름은"+name+"이고," + age+"입니다!");
		
	}
	
	public void hello(String a) {
		System.out.println(a);
	}
	
	
	
	
	
	
	
	
	
}
