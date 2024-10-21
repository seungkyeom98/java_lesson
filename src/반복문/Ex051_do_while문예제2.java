package 반복문;

import java.util.Scanner;

public class Ex051_do_while문예제2 {

	public static void main(String[] args) {
		
		String a = "test";
		String b = "test1234";
		do {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디를 입력하세요 : ");
		String c = sc.next();
		
		System.out.print("비밀번호를 입력하세요 : ");
		String d = sc.next();
		
		if(a.equals(c) && b.equals(d)) {
			System.out.println("로그인 성공!");
			break;
		}else {
			System.out.println("로그인 실패!");
		}
		}while(true);
		
		
		
		
		
		
		
		
		
		
		
	}

}
