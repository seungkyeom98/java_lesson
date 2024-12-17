package 메소드;

public class Ex01_메소드기초 {

	public static void main(String[] args) {

		// 메소드
		// '선언'과 '호출'로 이루어져 있다!
		// 반복적으로 사용되는 코드를 줄이기 위해서 사용
		// 특정 작업을 위해 사용되는ㄴ 코드를 묶어놓고, 필요에 따라 호출해서 동작

		// a-2 호출
		run();
		// b-2 호출
		sleep(10,"미리");// 10이면, int나 double 자료타입(데이터형=자료형태=자료형=데이터타입)이다.
					   // "10"처럼, 쌍따옴표 넣으면, String형태, 문자열 형태의 자료형태이다.!
		sleep(3,"승겸");
		
		// c-2 호출
		System.out.println(age());
		
		// d-2 호출
		System.out.println(introduce("선생님", "미리"));
		// char의 경우 데이터(=값=자료)에 ''를 달아야하고!, 
		// String은 데이터(=값=자료)에 " "꼭 달아야한다!
		
	}

	// 메소드의 유형
	// a. 매개변수 없고, 반환값 없을 떄,(경우)
	// a-1. 선언

	public static void run() {
		System.out.println("미리가 달립니다~");
		System.out.println("달려라 달려라 달려라 미리");
	}

	// b. 매개변수 있고, 반환값 없을 때!
	// 매개변수는 1개 이상 있을 때, 자료형태와 메소드 문법식(수식)을 정확하게 적어주자!
	// 매개변수의 순서도 지켜서 적어야 한다! -> 어떤 자료형태를 먼저 데이터(값, 자료)를 받는지 
	// 컴퓨터가 알아야하기 하기 때문이다! 먼저 받는 값(데이터,자료)를 첫번째 매개변수(저장공간)에
	// 저장해야하기 때문이다
	public static void sleep(int time, String a) {
		System.out.println("안녕히 주무세요~");
		System.out.println(time+"시에 잠이 든 "+a+" ...");
		
	}
	
	// c. 매개변수 없고, 반환값 있을 때!
	// void는 반환값이 없을 때 넣는다!
	// 반환값이 있다면, 반환할 데이터의 '자료형태(자료형)'를 void 대신 넣으면 된다!
	public static int age() {
		System.out.println("미리는 몇살이니?"); //syso = 시스템 아웃 의미, 시스템 아웃 이라고 읽는다.
		return 20;
	}
	
	// d. 매개변수 있고, 반환값 있을 때!
	public static String introduce(String work, String name) {
		String myself = work + "(이)가 직업인"+name+ "(이)가 이름이다";
		return myself;
		
	}
	
	//메소드의 순서는 상관없다! 메소드가 위에 있어도 되고, main메소드가 제일 위에 있어도 된다!
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
