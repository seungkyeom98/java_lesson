package 조건문;

import java.util.Scanner;

public class Ex04_if_else문2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// System.out.print("상품의 갯수를 입력하세요 : ");
		// int a = sc.nextInt();
		// if(a<10) {
		// int b = a*100000;
		// System.out.println("총 "+b+"원 입니다.");
		// }
		// else {
		// int c= a*90000;
		// System.out.println("총 "+c+"원 입니다.");
		// }

		// 하드문제
		// System.out.print("상품의 갯수를 입력하세요 : ");
		// int a = sc.nextInt();
		// if(a<=10) {
		// int b = a*100000;
		// System.out.println("총 "+b+"원 입니다.");
		// }
		// else {
		// int c= a*100000-((a-10)*20000);
		// System.out.println("총 "+c+"원 입니다.");
		// }

		// 숙제1 나이 구하기
		// System.out.print("만 나이를 입력하세요 : ");
		// int a = sc.nextInt();
		// if(a>0 && a<120) {
		// int b=2024-a;
		// System.out.println(b+"년생입니다");
		// }

		// 숙제2 옷가게 할인 받기-> 24년 9월 13일(금) 기준, 다중if문 아직 안배움.
		// System.out.print("옷 가격을 입력하세요 : ");
		// int a = sc.nextInt();
		// if(a<100000) {
		// }

		// 숙제3 각도기 -> 24년 9월 13일(금) 기준, 다중if문 아직 안배움.

		// 숙제4 피자 나눠 먹기
		System.out.print("피자 몇조각으로 잘라드릴까요? ");
		int a = sc.nextInt();

		System.out.print("피자 먹는 사람이 몇명이신가요? ");
		int b = sc.nextInt();
		if (b % a == 0) {
			System.out.println(b / a + "판 주문 도와드리겠습니다.");
		} else {
			System.out.println((b / a + 1) + "판 주문 도와드리겠습니다. ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
