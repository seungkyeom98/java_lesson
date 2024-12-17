package 반복문;

import java.util.Scanner;

public class Ex052_반복문예제 {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("A 입력 >>");

			a = sc.nextInt();

			System.out.print("B 입력 >>");
			b = sc.nextInt();
			if (a == 0 && b == 0) {
				break;
			}
			System.out.println("결과 >>" + (a - b));

		} while (true);

	}
}
