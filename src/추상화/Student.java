package 추상화;

public abstract class Student {
	//1.추상클래스
	//	추상메소드를 1개라도 가지고 있으면, 추상클래스이다.
	//	추상클래스는 일반 메소드도 가질 수 있다.
	//	추상클래스 만드는 방법:
	//	public abstract class 클래스명{}
	//	으로 만든다.
	
	//2.추상메소드
	//	{}이 없는 것이 추상메소드이다.
	//	선언(틀 : 리턴타입, 메소드명, 매개변수)은 되어있으나
	//	로직은 구현되어있지 않은 메소드
	//	구분법: 추상메소드는 abstract 라는 키워드가 붙는다.
	String name = "";//이름
	
	//추상메소드(study)
	public abstract void study();
	
	
	//일반메소드(rest)
	public void rest() {
		System.out.println("휴 피곤하다 빽다방이나 가야겠다~");
	}
	
	
	
	
	
	
	
}
