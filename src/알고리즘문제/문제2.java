package 알고리즘문제;

import java.util.Scanner;

public class 문제2 {

	public static void main(String[] args) {
//		[2] 세균 증식
//		- 어떤 세균은 1시간에 두배만큼 증식한다고 합니다. 처음 세균의 마리수 n을 입력받고, 경과한 시간 t를 입력받아서
//		  t시간 후 세균의 수를 출력해주세요!
//		※ n이 2, t가 10일때 2048 출력
//		※ n이 7, t가 15일때 229376 출력

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("세균 마릿수: ");
		int a = sc.nextInt();
		System.out.print("경과한 시간: ");
		int t = sc.nextInt();		
		
		System.out.println(a*(int)Math.pow(2, t)+"출력");
		
		
		
		
		
		
		
	}

}
