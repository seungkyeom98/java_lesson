package 클래스_객체_설계도_오브젝트;

import java.util.Scanner;

//객체 지향 프로그래밍 언어= OOP라고 한다!
public class Ex02_통장예제 {

	public static void main(String[] args) {
		// 1. 통장 클래스(=설계도) 설계
		// 2. 객체 선언 및 생성
		Ex02Bank mrBank ; //레퍼런스 변수 선언;
		mrBank = new Ex02Bank();//객체 생성;
		// 스캐너 선언!, 스캐너 생성!
		Scanner sc = new Scanner(System.in);
		
		Ex02Bank.showmoney();
		//this.mrBank.showmoney(); 쇼머니 함수를 스태틱으로 설정했는데,
								// 노란줄 없애고, 싶어도 스태틱은 this를 못쓴다.

		
		System.out.println("====국 민 은 행====");

		while (true) {
			System.out.println("메뉴를 선택해주세요");
			System.out.println("[1]잔액조회 [2]입금 [3]출금 [4]종료");
			System.out.print(">>");
			int choice = sc.nextInt();

			if (choice == 1) {
				// 잔액조회
				System.out.println("잔액은 "+mrBank.showmoney()+"원 입니다.");
			} else if (choice == 2) {
				// 입금기능
				System.out.print("얼마를 입금하시겠습니까? >>");
				int dMoney = sc.nextInt();
				mrBank.deposit(dMoney);
			} else if (choice == 3) {
				// 출금기능
				System.out.print("출금할 금액을 적어주세요 >>");
				int wMoney = sc.nextInt();
				mrBank.withdraw(wMoney);
			} else if (choice == 4) {
				// 종료
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("다시입력해주세요.");
			}
		}

		/*
		 * //통장 잔액 설정- 지울거다! 입금을 통해서만 money를 넣기 위해서 //private 설정으로 캡슐화한다! 통장 클래스(설계도)의
		 * 객체의 값(=데이터)를 말이다! //mrBank.money = 1000;
		 * 
		 * 
		 * //입금 mrBank.deposit(1000); //잔액조회
		 * System.out.println("잔액은 "+mrBank.showmoney());
		 * 
		 * //출금 mrBank.withdraw(500); //잔액조회
		 * System.out.println("잔액은 "+mrBank.showmoney());
		 */

	}

}
