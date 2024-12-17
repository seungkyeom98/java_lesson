package 반복문;

import java.util.Scanner;

public class Ex04_while예제 {

	public static void main(String[] args) {
			
		  //do-while문은 while 뒤에 ;를 붙여야 한다.
		
	      // 1. 사용자에게 현재몸무게(weight), 목표몸무게(goal) 입력받기
	      // 2. 반복문을 활용해서 주차별로 감량 몸무게를 입력받기
	      // 2-1. 몇주차인지 카운트해주는 변수 필요 (count)
	      // 3. 몸무게가 목표와 같거나 더 작아지면 종료!!
		
		Scanner sc= new Scanner(System.in);
		System.out.print("현재몸무게 : ");
		int a = sc.nextInt();
		System.out.print("목표몸무게 : ");
		int b = sc.nextInt();
		int c = 0; // 몇주차
		while(a>b) {
			//++c; //1주차부터 시작
			System.out.print(++c +"주차 감량 몸무게 : ");
			int d =sc.nextInt();
			a -= d; //1주차부터 현재 몸무게
			
			
		}
		System.out.println(a+"kg 달성!! 축하합니다!");
		
		
		
		
		
		
		
		
		
		
		
	}

}
