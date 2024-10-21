package 반복문;

import java.util.Scanner;

public class Ex01_while문예제1 {

	public static void main(String[] args) {
		//사용자에게 정수를 입력받는다
		//사용자가 10 이상의 정수를 입력하면 반복문을 종료
		System.out.print("정수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
	

		while(a<10) {
			//a가 10미만이기 때문에 새로운 값을 입력받아서 a에 저장
			System.out.println(a);
			a = sc.nextInt();

		}
		System.out.println(a+"는 10이상이므로, 종료합니다.");
		
		
		
		
		
		
		
		
		
		
		
	}

}
