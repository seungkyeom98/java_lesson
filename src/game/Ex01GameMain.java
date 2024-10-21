package game;

import java.util.Scanner;

public class Ex01GameMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 객체 선언  =  객체 생성!
		System.out.println("사용할 게임을 선택해주세요~");
		System.out.println("[1] 포켓몬 [2]커비");
		int input = sc.nextInt();
		

		//사용자가 1을 입력하면 포켓몬 게임을 시작,
		//		2를 입력하면 커비 게임을 시작
		if(input==1) {
			//포켓몬
			//포켓몬 칩 가져오기
			Ex01Poketmon game1 = new Ex01Poketmon();
			//포켓몬 칩을 닌텐도에 넣고 실행!
			insert(game1);
			
		}else if(input==2) {
			//커비
			//커비 칩 가져오기
			Ex01Kirby game2 = new Ex01Kirby();
			//커비 칩을 닌텐도에 넣고 실행
			insert(game2);
		
		}
			
	}

	public static void insert(Ex01GameTitle g) {
		System.out.println("게임시작");
		g.start();
		
		
	}
	
	
	
	
	
	
	
	
	
}
