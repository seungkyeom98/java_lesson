package 변수;

public class Ex02변수형 {

	public static void main(String[] args) {
		
		//자바의 기본 자료형
		// 1) 논리 자료형 : boolean (1byte)
		//	  : 참 혹은 거짓을 저장하는 자료형
		// 참  이라는 데이터를 저장하는 bool 변수 선언
		boolean bool = true;
		System.out.println(bool);
		
		// 2) 문자 자료형 : char (2byte)
		//		: 따옴표를 사용해서 작성하고, 딱 한 글자만 저장할 수 있다.
		char name = '주';
		
		// 문자열 자료형인 String을 쓸때 쌍따옴표 ""를 사용한다.(문자열은 기본 자료형은 아니다.)
		// String : 쌍따옴표를 사용해서 작성하고, 여러 글자가 들어갈 수 있다.
		String name2 = "주미리";
		
		// 3) 정수 자료형
		// byte(1byte=8bit-> 8자리 2진법 -> 최고 큰수는 2^8까지 데이터(=값=자료)를 담을 수 있는 상자(=저장공간=변수)의 형태이다.=변수형=변수(=저장공간=메모리 공간)에 선언할 자료형(=자료형태)), 
		// short(2byte), int(4byte), long(8byte)
		// --> 변수(=저장공간)의 자료형(=자료형태)가 의미하는 건, 할당 가능한 자료(=값=데이터)의 범위를 의미한다.
		// ex. int는 4byte=8*4bit=32bit -> 32자리 2진법 -> 최고 큰수 21억 데이터까지 변수(=저장공간)이 담을 수 있는 타입(=형태)이다.
		
		// 4) 실수 자료형(=데이터 타입=자료 형태)
		// float (4byte), double(8byte) >> 기본값 double
		double num3 =3.14;
		float num4=  (float) 3.14;
		float num5= 3.14f; // f라는 키워드 사용하면 더 간편하다.
		
		
		//1. 강제 형변환= 명시적 형변환
		// 큰 크기의 자료형에서 더 작은 크기의 자료형으로 변환할 때 사용
		// 데이터 손실이 발생할 수 있기 때문에 정확하게 () 사용해서
		// 손실이 일어나도 괜찮다고 명시해주는 형변환 방식
		byte num1 = (byte) 128;
		
		//2. 묵시적 형변환
		int num6=10;
		double num7=num6;
		System.out.println(num7);
		
		
		
		
	}

}








