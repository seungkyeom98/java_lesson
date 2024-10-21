package 반복문;

import java.util.Scanner;

public class Ex03_while예제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int a = sc.nextInt();
		int b =0;
		int c =0;
		if(a%2==0) {
			b++;
		}else {
			c++;
		}
		System.out.println("짝수 개수 : "+b);
		System.out.println("홀수 개수 : "+c);
		
		while(true) {
			System.out.print("정수 입력 : ");
			a = sc.nextInt();
			if(a==-1) {
				break;
			}
			if(a%2==0) {
				b++;
			}else {
				c++;
			}
			System.out.println("짝수 개수 : "+b);
			System.out.println("홀수 개수 : "+c);
			
			
		}
		System.out.println("종료되었습니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
