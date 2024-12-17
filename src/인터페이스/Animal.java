package 인터페이스;

public abstract class Animal extends Creature{
	
	//Creature 추상메소드 재정의!=오버라이딩
	public void alive() {
		System.out.println("숨을 쉬면서 살아있습니다!");	
	}
	
	//Animal의 추상메소드!
	public abstract void move();
	
	
	
	
}




