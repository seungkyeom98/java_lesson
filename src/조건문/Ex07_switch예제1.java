package 조건문;

public class Ex07_switch예제1 {

	public static void main(String[] args) {

		// switch~case문
		// 특정 식이 특정 값일 때만 구문을 실행시킬 수 있는 조건문
		// *각각의 case마다 break를 넣기!

		int num = 1;

		switch (num) {
		case 1: // num이 1일때
			System.out.println("num은 1입니다.");
			break;
		case 2: // num이 2일때
			System.out.println("num은 2입니다.");
			break;
		case 3: // num이 3일때
			System.out.println("num은 3입니다.");
			break;
		default: // 예외처리
			System.out.println("num은 1,2,3이 아닙니다.");
		}

	}

}
