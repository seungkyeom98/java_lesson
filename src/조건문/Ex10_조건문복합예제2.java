package 조건문;

import java.util.Scanner;

public class Ex10_조건문복합예제2 {

	public static void main(String[] args) {
		
		System.out.print("숫자 입력 : ");
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		if(a%10>4) {
			System.out.println("반올림 수 : "+(a-(a%10)+10));
		}else {
			System.out.println("반올림 수 : "+(a-(a%10)));
		}
		
	}

}
