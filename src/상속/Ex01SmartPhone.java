package 상속;

public class Ex01SmartPhone extends  Ex01FeaturePhone {
	
	//Phone을 물려받은 FeaturePhone에서 물려받는다!
	//쿠키런 게임(game)을 추가!
	//기존 FeaturePhone의 카메라 메소드를 변경
	
	public void game() {
		System.out.println("쿠키런 게임 시작~");
		
	}
	
	//오버라이딩
	//부모 클래스의 메소드(=기능=로직)을 변경하는 것= 오버라이딩!=overriding!
	//부모 로직을 올라타서 바꾼다 생각하면, 구분이 쉽다! 오버롸이딩!
	//메소드 재정의 = 오버라이딩!!!
	//매개변수의 개수, 순서, 자료형, 리턴타임은 같은 기능(=메소드)여야 한다!
	public void photo() {
		System.out.println("화질 짱좋은 사진 찍기~");
		
	}
	//상속은 기능(=메소드) 추가 및 기존 기능(=메소드)변경이 가능하다!
	
	// ---------------------------------------
	
	
	//오버 로딩은 메소드 이름은 같지만, 메소드의 매개변수가 다른 것!!!!
	public void photo(int a) {
		System.out.println("화질 짱좋은 사진 찍기~");
		
	}
	
	
	
	
	
}
