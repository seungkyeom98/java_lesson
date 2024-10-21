package 인터페이스;

public interface Speak {
	
	// 인터페이스: 
	// = 클래스들이 공통으로 구현해야하는 기능(강제성)들을 미리 정의
	// = 프로젝트를 설계할 때, 설계도면 or 작업 명세서(꼭 지켜야하는 규칙)
	
	// 인터페이스의 특징
	//1. 필드에 들어가는 데이터는 반드시 상수여야 한다
	//2. static 키워드가 들어간 필드만 선언 가능하다
	//2-1. static: 정적인 저장공간
	//			   실행했을 때, 1순위로 실행되는 공간
	//-->필드: static, final 필수 (생략하더라도 여전히 상수)
	//3. 인터페이스는 '추상메소드'만 가질 수 있다
	//-->메소드: public, abstract 필수(생략하더라도 여전히 추상메소드)
	//4. 다중상속이 가능하다! 
	//5. 생성자를 생성할 수 없다 -> 인터페이스 클래스는 '객체'를 만들 수 없다.
	//6. 자식클래스는 부모 인터페이스의 메소드를 모두 오버라이딩해야 한다!
	//7. 선언하는 방법: interface 키워드
	//8. 상속받는 방법: implements 키워드
	
	public abstract void barking() ;
		
		//Speak speak; //레퍼런스변수 = 객체의 주소를 저장하기위한 저장공간
		//speak=new Speak();//실제로 객체 생성.
		
		//Speak speak1=new Speak();
	
		//speak1.speak();
		//speak();
	
	public abstract void speak();
		//System.out.println("나는 말하다");
	
	
	
}
