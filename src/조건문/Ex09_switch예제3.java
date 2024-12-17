package 조건문;

import java.util.Scanner;

public class Ex09_switch예제3 {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("돈을 투입해주세요 : ");
//
//		int a = sc.nextInt();
//		System.out.println("음료 번호를 선택하세요.");
//		System.out.println("------------------------");
//		System.out.println("[1]코카콜라(700원) [2]스프라이트(800원) [3]생수(500원)");
//		System.out.println("------------------------");
//		System.out.print(">>");
//		int b = sc.nextInt();
//		switch (b) {
//		case 1:
//			int c = a - 700;
//			if (c > 0) {
//				System.out.println("잔돈 : " + c + "원");
//			} else {
//				System.out.println("돈이 부족합니다.");
//			}
//			break;
//		case 2:
//			int d = a - 800;
//			if (d > 0) {
//				System.out.println("잔돈 : " + d + "원");
//			} else {
//				System.out.println("돈이 부족합니다.");
//			}
//			break;
//		case 3:
//			int e = a - 500;
//			if (e > 0) {
//				System.out.println("잔돈 : " + e + "원");
//			} else {
//				System.out.println("돈이 부족합니다.");
//			}
//			break;
//		default:
//			System.out.println("없는 번호입니다.");
//		}
//
//	

		Scanner sc = new Scanner(System.in);
// money(투입금액), drink(상품번호)

		System.out.print("돈을 투입해주세요 >> ");
		int money = sc.nextInt();

		System.out.print("음료를 고르세요");
		System.out.println("------------------------");
		System.out.println("[1]코카콜라(700) [2]스프라이트(800) [3]생수(500)");
		System.out.println("------------------------");
		System.out.print(">>");
		int drink = sc.nextInt();

// 선택한 상품 번호에 따라서 지불금액을 정하기

// 지불금액(price)
		int price = 0;
		switch (drink) {
		case 1:
			price = 700;
			break;
		case 2:
			price = 800;
			break;
		case 3:
			price = 500;
			break;
		default:
			System.out.println("없는 번호입니다");
		}

// 투입한 돈으로 물건 구매하기
		money -= price;

// 잔돈 출력
		if (money > 0) {
			System.out.println("구매 성공!");
			System.out.println("잔돈 : " + money + "원");
			System.out.println("천원: " + (money / 1000) + "개, 오백원: " + (money % 1000 / 500) + "개, 백원: "
					+ (money % 500 / 100) + "개");
		} else {
			System.out.println("돈이 부족합니다.");
		}

	}

}


