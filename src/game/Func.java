package game;

import java.util.Random;
import java.util.Scanner;

public class Func {
	//게임에 들어가는 로직(=기능=메소드)들을 정의
	//로직들을 가져다가 쓰기위해 정의를 하는 거여서
	//기능모음집, 단축키 모음집같은 거다!
	//객체 생성할 필요는 없다..
	//-->static 형태로 메소드(=멤버함수=기능=로직)을 정의해보자!
	int temp= 0;
	static int exp= 0;
	
	
	static Scanner sc = new Scanner(System.in);
	static Random ran = new Random();
	
	public static void condition(String name, int hp, int exp, int level) {
		System.out.println(name+"의 체력은"+hp+"이고, 경험치는 "+exp+"이고, 레벨은 "+level+"입니다.");
	}
	
	
	public static int fight() {
		//가상의 적과 싸워서
		//이기면 경험치 +30, 비기면 +15, 지면 +5
		//경험치(int)를 return
		
		System.out.println("적과 전투를 했습니다! ");
		int a = ran.nextInt(2)+1;
		if(a==0) {
			System.out.println("33.33%확률 전투에 승리했습니다!");
			System.out.println("경험치 30을 얻었습니다.");
			return 30;
		}else if(a==1) {
			System.out.println("33.33%확률 전투에 비겼습니다!");
			System.out.println("경험치 15을 얻었습니다.");
			return 15;
		}else {
			System.out.println("33.33%확률 전투에 패배했니다!");
			System.out.println("경험치 5를 얻었습니다.");
			return 5;
		}
		
	}
	
	public static int eat(String favoriteFood) {
		//사용자에게 먹일 음식을 매개변수로 받아와서,
		//커비가 좋아하는 음식이면 +50
		//다른 음식들이면 경험치 -10
		//경험치 return하기
		System.out.print("먹일 음식을 말씀해주세요 >>");
		String Food = sc.next();
		if(favoriteFood.equals(Food)) {
			System.out.println("좋아하는 음식을 먹였습니다!");
			System.out.println("경험치 50을 얻었습니다.");
			return 15;
		}else {
			System.out.println("좋아하지않는 음식을 먹였습니다!");
			System.out.println("경험치 10를 잃었습니다.");
			return -10;
		}
		
	}

	
	
	
	
	
}
