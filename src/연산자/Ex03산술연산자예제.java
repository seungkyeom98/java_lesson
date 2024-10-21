package 연산자;

import java.util.Scanner;

public class Ex03산술연산자예제 {

	public static void main(String[] args) {
		
		// [예제] 100의 자리 이하를 버리는 연산
	      
	    // 1. 입력받는 도구 꺼내오기
		Scanner sc = new Scanner(System.in);
	    // 2. 사용자에게 정수 1개를 입력받기
		System.out.print("정수 입력 : ");
		int a = sc.nextInt();
	    // 3. 정수의 백의자리 이하를 버리기
		int b=a%100;
		//int c=a-b;
	    // 4. 결과값 출력하기
		System.out.println("결과 값 : "+(a-b));
		//System.out.println("결과 값 : "+c);



	

	}

}
