package 상속;

public class Ex01phoneMain {

	public static void main(String[] args) {
		//메인 클래스
		//p가 할수있는것: 전화, 문자
		Ex01Phone p =new Ex01Phone();
		p.call();
		p.message();
		
		Ex01FeaturePhone f =new Ex01FeaturePhone();
		//s가 할 수 있는 것
		//전화, 문자 (상속받음)
		//카메라! (내가 추가한 기능(=메소드))(확장한 기능)
		f.call();
		f.message();
		f.photo(); //알트+쉬프트+r누르면, 변수명 한꺼번에 바꿀 수 있다!
		
		Ex01SmartPhone s = new Ex01SmartPhone();
		//s가 할 수 있는 것
		//전화,문자/카메라를 상속받은 하위클래스의 객체
		//카메라는 "기능(=메소드)을 변경(=재정의)"했다. (= "오버라이딩"했다.)
		s.call();
		s.message();
		s.photo();//-> 오버라이딩된 기능(=메소드)이다!
		
		
		
		
		
		
	}

}
