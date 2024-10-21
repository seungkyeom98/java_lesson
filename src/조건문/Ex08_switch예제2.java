package 조건문;

import java.util.Scanner;

public class Ex08_switch예제2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("월을 입력하세요 : ");
		int month = sc.nextInt();

		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println(month + "월은 겨울입니다.");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println(month + "월은 봄입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(month + "월은 여름입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(month + "월은 가을입니다.");
			break;
		default:
			System.out.println("1~12사이 숫자만 입력해주세요.");
		}

	}

}
