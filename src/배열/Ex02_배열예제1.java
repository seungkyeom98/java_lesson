package 배열;

import java.util.Arrays;
import java.util.Scanner;

public class Ex02_배열예제1 {
	public static void main(String[] args) {
		// 변수,자료Structure 선언부.
		int[] ar = new int[5];
		int b = 0;
		int c = 1000;
		int d = 0;
		double e = 0;
		// 입력부
		Scanner sc = new Scanner(System.in);

		// 데이터-> 정보로 계산, 가공 과정(=메소드 구문=함수 구문).
		for (int i = 0; i < ar.length; i++) {
			System.out.print((i + 1) + "번째 입력 >> ");
			ar[i] = sc.nextInt();
			if (ar[i] >= b) {
				b = ar[i];
			}
			if (ar[i] <= c) {
				c = ar[i];
			}
			d += ar[i];
		}
		e = (double) d / ar.length;

		// 출력부
		System.out.print("입력된 값: ");
		for (int i = 0; i < ar.length; i++) {
//			switch (i) {
//			case 4: //ar.length-1
//				System.out.println(ar[i]);
//				break;
//			default:
//				System.out.print(ar[i] + ", ");
//			}
			if (i < ar.length - 1) { // 인덱스 마지막 방번호는 (ar.length-1)번호이다.
									// 인덱스는 0번부터, ar.length는 1칸부터 시작.
				System.out.print(ar[i] + ", ");
			} else if (i == ar.length - 1) {
				System.out.println(ar[i]);
			}

		}
		System.out.println("입력된 점수 : " + Arrays.toString(ar));
		System.out.println("최고값: " + b + "최저값: " + c);
		System.out.println("총합: " + d);
		System.out.println("평균: " + e);

	}
}
