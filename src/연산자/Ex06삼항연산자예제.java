package 연산자;

import java.util.Scanner;

public class Ex06삼항연산자예제 {

	public static void main(String[] args) {
		// [예제 1번] 정수를 입력받아 홀수인지 짝수인지 판별하는 프로그램

		// 1. 입력도구 꺼내기
		// 2. 사용자에게 정수를 하나 입력받는다
		// 3. 홀수인지 짝수인지 삼항연산자로 판별하기

		// Scanner sc = new Scanner(System.in);
		// System.out.print("정수를 입력하세요 >> ");
		// int num = sc.nextInt();
		// int a = num%2;
		// String result = num%2==0 ?"짝수" :"홀수" ;
		// System.out.println(num + "은 " +result +"입니다.");

		// 2번
		// Scanner sc = new Scanner(System.in);
		// System.out.print("정수를 입력하세요 >> ");
		// int a = sc.nextInt();
		// System.out.print("정수를 입력하세요 >> ");
		// int b = sc.nextInt();
		// int result = a>b ? a-b :b-a ;
		// System.out.println("두 수의 차 : " +result);

		// 3번
		Scanner sc = new Scanner(System.in);
		System.out.print("농구공의 개수를 입력하세요 : ");
		int a = sc.nextInt();
		int b = a % 5;
		int result = a % 5 == 0 ? a / 5 : a / 5 + 1;
		System.out.println("필요한 상자의 수 : " + result);

	}

}
