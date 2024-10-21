package 클래스_객체_설계도_오브젝트;

public class Ex01_설계도_구조 {

	public static void main(String[] args) {
		//메인 메소드(=행동=로직=동작)는 "프로그램의 시작점"이다!
		
		//1. 인간에 대한 설계도 만들어보기
		//Person.java에 만들었다!
		
		//2. 그 설계도 기반으로 실제 인간들을 생성해보기!
		//2-1. 레퍼런스 변수(=주소값 넣는 변수(=저장공간))를 통해 "객체 생성" 완료!
		// 객체의 이름을 miri 라고 정했다!
		// 클래스(=설계도)  객체명 = 생성연산자(=new) 클래스();
		// Person miri; - 객체 선언!
		// miri = new Person() =- 객체 생성!
		//이렇게 2개가 합쳐진 구문이다!
		Ex01Person miri = new Ex01Person();
		//2-1. 실제 객체에 데이터(=값)을 할당하기!
		miri.age=20;
		miri.name="미리";
		
		miri.eat();
		miri.introduce();
		miri.hello("방가방가");
		// 새로운 사람 생성! 하기
		// 이름, 나이 값 담고,
		// 밥 먹는 메소드(=행동)도 사용하기!
		
		Ex01Person popi= new Ex01Person();
		popi.age=10;
		popi.name="뽀삐";
		
		popi.eat();
		popi.introduce();
		
		
		//통장, 데이터- 잔액,  
		//		기능- 입금 기능, 출금 기능
	}

}
