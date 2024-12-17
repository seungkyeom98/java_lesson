package 인터페이스;

public class Human extends Animal implements Speak, Swim{
	
	
	//Animal 추상클래스 move를 재정의. 오버라이딩한것! 
	//부모 클래스에 올라타서 재정의한것! 오버라이딩!
	public void move() {
		System.out.println("뛰거나 걷거나! 인터벌 트레이닝~ㅎㅎㅎㅎㅎ");
		System.out.println("너모 좋고~~~ㅎㅎ");
	}

	@Override
	public void barking() {
		System.out.println("왈뢀왕르르르르아ㅗ앙왕");
		
	}

	@Override
	public void speak() {
		System.out.println("하이요~~~~~~~~~~!!");
		
	}

	@Override
	public void swimming() {
		System.out.println("어푸 어푸~!!");
		System.out.println("수영 꾸르잼~!!");
		
	}
	
	
}
