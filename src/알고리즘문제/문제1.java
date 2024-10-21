package 알고리즘문제;

import java.util.Scanner;

public class 문제1 {

	public static void main(String[] args) {
		//짝수의 합 구하기
//		- 사용자에게 정수(n)를 하나 입력받고, n 이하의 짝수를 모두 더한 값을 출력
//		※ 사용자가 10 입력 -> 30 출력
//		※ 사용자가 4 입력 ->  6 출력

		Scanner sc= new Scanner(System.in);
		System.out.print("정수 입려하세요: ");
		int a= sc.nextInt();
		int b =0;
		for(int i=0; i<=a;i++) {
			if(i%2==0) {
				b+=i;
			}
		}
		System.out.println(b+"출력");
		
		
		
		
		
		
		
	}

}
