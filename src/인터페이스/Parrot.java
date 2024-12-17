package 인터페이스;

public class Parrot extends Animal implements Speak{

	
	
	//Animal 추상클래스 move를 재정의. 오버라이딩한것! 
	//부모 클래스에 올라타서 재정의한것! 오버라이딩!
	public void move() {
		System.out.println("허겁지겁! 파닥파닥거리기!!");
		System.out.println("후다다다다다닥!! ");
	}

	@Override
	public void barking() {
		System.out.println("짹짹짹");
		
	}

	@Override
	public void speak() {
		System.out.println("안녕안녕");
		
	}
}
