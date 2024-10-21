package 조건문;

import java.util.Scanner;

public class Ex02_단순if예제1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.print("나이를 입력하세요 : ");
		//
		//int a = sc.nextInt();
		//
		//if(a>=20)
		//{
		//	System.out.println("성인입니다");
		//}
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		if(num%15==0) { //num%3==0||num%5==0 도 가능. 15는 최소공배수.
			System.out.println("3과 5의 배수입니다.");
		}
		else {
			System.out.println("3과5의 배수라고 안나오면 틀리신거임.");
		}

		
		
		
	}
}
