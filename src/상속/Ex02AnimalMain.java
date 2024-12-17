package 상속;

public class Ex02AnimalMain {

	public static void main(String[] args) {
		
		//Animal 클래스 기반으로 만든 객체
		Ex02Animal a = new Ex02Animal();
		//Dog클래스 기반으로 만든 객체
		Ex02Dog d = new Ex02Dog();
		//Cat클래스 기반으로 만든 객체
		Ex02Cat c = new Ex02Cat();		
		
		a.cry();
		d.cry();
		c.cry();//오버라이딩: 기능(=메소드) 재정의 하는것!
		
		//업스캐팅 사용 이유! 오버라이딩!
		//업캐스팅을 하면, 상위 클래스의 메소드(=기능)만 사용할 수 있고,
		//하위 클래스에서 추가로 구현해놓은 메소드(=기능)은 사용 불가능!!
		//But 하위 클래스에서 재정의(=오버라이딩)된 메소드(=기능)은 사용 가능!!
		//-> 상위 클래스에서는 공통적으로 사용되는 메소드를 정의하고,
		//	 하위 클래스에서 재정의(=오버라이딩)해서 사용한다!
		//--
		//애니멀이라는 자료형을 한번에 활용하고 싶기때문에, 하위 클래스의 자료형을
		//애니멀이란 상위 클래스로 묶는다.
		
		
		
		//Dog를 업캐스팅
		//dUp은 Ex02Dog에서 Ex02Animal로 자료형이 형변환됐기 때문에
		//Ex02Dog에 있는 기능은 쓸 수 없다!
		Ex02Animal dUp = new Ex02Dog();
		//dUp.walk;//dUp은 Ex02Animal클래스 자료형으로 형변환됐기 때문에
					//Ex02Dog에만 있는 기능(=메소드)
					//dUp의 자료형은 Ex02Animal이다! Ex02Dog가 아니다!
		dUp.cry();// 왈왈이라고 Ex02Dog로 재정의된 메소드로 나온다! 이게 업캐스팅!
		
		//다운캐스팅
		// -> 다시 원래 자료형으로 되돌리는 작업
		Ex02Dog dDown = (Ex02Dog) dUp;
		dDown.walk();//dDown의 자료형은 Ex02Dog이기 때문에, 
					//Ex02Dog에만 있는 기능(=메소드)를 사용가능하다!
		
		
		
		
		
		
		
	}

}
