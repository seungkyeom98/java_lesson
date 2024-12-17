package 클래스_객체_설계도_오브젝트;

public class Ex04Cons {

	//만약 개발자가 생성자를 정의하지 않으면
	//자동으로 기본 생성자가 정의됨(컴파일러가 해준다)
	String name;
	int age;
	
	//기본 생성자
	public Ex04Cons() {
		this.name = "";
		this.age = 0;
	}
	
	//생정자로 데이터의 값을 미리 정의
	public Ex04Cons(String n, int a) {
		this.name=n;
		this.age=a;//자기 참조
	}
	
	//생성자 오버로딩
	//생성자끼리 이름이 동일하나,
	//각자의 매개변수의 타입과 갯수가 다르다면,
	//별개의 생성자라고 인식함
	//**일반 메소드(=함수=기능=행동)도 오버로딩이 가능하다!**
	
	
	
	
	
	
	
	
}
