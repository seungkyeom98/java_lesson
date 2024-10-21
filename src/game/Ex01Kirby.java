package game;

import java.util.Scanner;

public class Ex01Kirby extends Ex01GameTitle {

	String name = "";
	int level = 1;
	int exp = 0;
	int hp = 30;
	Scanner sc = new Scanner(System.in);

	
	//GameTitle에 있는 start 기능(=메소드)를 재정의(=오버라이딩)한다. 그럼 이걸로 실행된다! 업캐스팅된 커비 객체는 말이다! 
	public void start() {
		System.out.println("커비 게임 시~작!");

		// 1.사용자에게 커비 이름+좋아하는음식 입력받기
		// 2.레벨은 초기값 1로 잡기.
		// 3.hp는 초기값 30으로 잡기.

		System.out.print("이름을 정해주세요 >> ");
		name = sc.next();

		System.out.print("좋아하는 음식을 정해주세요 >> ");
		String favoriteFood = sc.next();

		System.out.println(this.name + "이 길을 떠납니다..");
		while (true) {

			System.out.println("행동을 선택해주세요");
			System.out.print("[1]전투 [2]식사 [3]종료");
			int num = sc.nextInt();
			if (num == 1) {

				// 전투 발생!
				// Func에 fight라는 메소드를 생성+사용!
				// *fight 메소드 완성시켬보기*
				this.exp += Func.fight();
				if (exp >= 100) {
					this.level += 1;
					System.out.println(this.name+"가 레벨 " + this.level + "이 됐습니다!");
				}
				Func.condition(name, hp, exp, level);
			} else if (num == 2) {
				// 식사하기
				// Func에 eat이라는 메소드를 완성시켜보기
				// *먹일 음식을 입력받아서, 매개변수로 eat에 보내기*
				// *eat 메소드 완성시켜보기*
				this.exp += Func.eat(favoriteFood);
				if (exp >= 100) {
					this.level += 1;
					System.out.println(this.name+"가 레벨 " + this.level + "이 됐습니다!");
				}
				Func.condition(name, hp, exp, level);
			} else if (num == 3) {
				System.out.println("게임을 종료합니다.");
				break;
			} else {
				System.out.println("1,2,3번 중 선택해주세요");
			}
		}

	}

}
