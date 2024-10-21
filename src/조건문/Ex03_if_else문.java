package 조건문;

import java.util.Scanner;

public class Ex03_if_else문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//System.out.print("점수를 입력하세요 : ");
		//int grade = sc.nextInt();
		//if (grade >= 60) {
		//	System.out.println("합격입니다~");
		//} else {
		//	System.out.println("불합격입니다.");
		//}
		System.out.println("==== EVERLAND RESORT==== ");
		System.out.print("나이를 입력하세요 : ");
		int a = sc.nextInt();
		System.out.print("인원수를 입력하세요 : ");
		int b = sc.nextInt();
		
		if(a>=20) {
			int c =b*5000;
			System.out.println("총 "+c+"원 입니다.");
		}
		else {
			int d =b*2500;
			System.out.println("총 "+d+"원 입니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
