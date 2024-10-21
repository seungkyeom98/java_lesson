package 인터페이스;

public class Whale extends Animal implements Swim{

	
	
	//Animal 추상클래스 move를 재정의. 오버라이딩한것! 
	//부모 클래스에 올라타서 재정의한것! 오버라이딩!
	@Override
	public void move() {
		System.out.println("뿌우우우우~~~");
		
	}
	
	@Override
	public void swimming(){
		System.out.println("대서양을 가로질러가자!");
	}


}
//1X
//2X
//3O
//4O
//5O
//6X

//일반 변수: 몇byte인지 저장공간이 명시됨
//레퍼런스 변수: 저장공간 주소를 할당받는 저장공간
