package 연산자;

import java.util.Scanner;

public class Ex02산술연산자예제 {

	public static void main(String[] args) {
		// 사용자에게 두 개의 정수를 입력받아서
		//두 수의 더하기, 빼기, 곱하기, 나누기 결과값 출력
		//주의점!! 나누기 결과값은 실수 형태로 표현
		
		//1. 입력 도구 꺼내기
		//2. 사용자에게 두개의 정수를 입력받고 저장
		//3. 결과값 출력.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력 : ");
		int a = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int b = sc.nextInt();
		System.out.println("더한 결과 값 : "+ (a+b));
		System.out.println("뺀 결과 값 : "+ (a-b));
		System.out.println("곱한 결과 값 : " +(a*b));
		//double c = a;
		//double d = b;
		//double s =c/d;
		//더블 형태의 a를 int형태의 b로 나눈것. 
		System.out.println("나눈 결과 값 : " +( (double)a/b) );
		
		
	}

}
