package 반복문;

import java.util.Scanner;

public class Ex05_반복문예제 {

	public static void main(String[] args) {
		// plus game 예제
		// 랜덤수 만드는 방법

		// 1. 랜덤수 2개를 뽑아서
		// 2. 사용자에게 랜덤수끼리 더한 값을 입력하게 하기
		// 3. 정답을 맞추면 계속 진행
		// 4. 정답을 틀리면,
		// 계속할래? -- Y => 계속 진행
		// N => 종료
		int ran1;
		int ran2;
		System.out.println("===Plus Game===");
		Scanner sc = new Scanner(System.in);

		do {
			ran1 = (int) (Math.random() * 10) + 1;
			ran2 = (int) (Math.random() * 10) + 1;
			System.out.print(ran1 + "+" + ran2 + "=");
			int a = sc.nextInt();
			if (a == (ran1 + ran2)) {
				System.out.println("Success");
			} else {
				System.out.println("Fail");

				System.out.print("계속 하시겠습니까? >>");
				String s = sc.next();
				char c = s.charAt(0);
				if (c == 'Y') {

				} else if (c == 'N') {
					break;
				}

			}

		} while (true);

		System.out.println("종료합니다.");

	}

}
