package 반복문;

import java.util.Scanner;

public class Ex01_반복문예제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 >> ");
		int num = sc.nextInt();
		int count = 0;
		count += num;
		System.out.println("누적 결과 >> " + count);
		
		while (num != -1) {
			System.out.print("정수 입력 >> ");
			num = sc.nextInt();
			count += num;
			System.out.println("누적 결과 >> " + count);
//			if(num==3) {
//				//num이 3이면 멈출래!
//				//break; -> 반복문을 빠져나가는 역할.
//				break;
//			}
		}

		System.out.println("종료되었습니다.");

	}

}
