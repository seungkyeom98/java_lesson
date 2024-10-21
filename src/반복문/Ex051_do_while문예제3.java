package 반복문;

import java.util.Scanner;

public class Ex051_do_while문예제3 {

	public static void main(String[] args) {
		int i = 0;
		String a = "test";
		String b = "test1234";
		loop1: do {
			Scanner sc = new Scanner(System.in);
			System.out.print("아이디를 입력하세요 : ");
			String c = sc.next();

			System.out.print("비밀번호를 입력하세요 : ");
			String d = sc.next();

			if (a.equals(c) && b.equals(d)) {
				System.out.println("로그인 성공!");
				break loop1;
			} else {
				System.out.println("로그인 실패!");
				i++;
				if (i == 3) {
					System.out.println("아이디와 비밀번호를 3회 이상 틀렸습니다.");
					break loop1;
				}
			}
		} while (true);

	}

}
