package 반복문;

import java.util.Scanner;

public class Ex07_for문_구구단 {

	public static void main(String[] args) {
		// for문을 사용해서 구구단 2단을 출력
		// 사용자에게 원하는 단을 입력받아서 구구단을 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력 >>");
		int a = sc.nextInt();
		System.out.print("어느 수까지 출력 >>");
		int b = sc.nextInt();
		for (int i = 1; i <= b; i++) {

			System.out.println(a + "*" + i + "=" + (a * i));
		}

	}

}
