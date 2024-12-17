package 이차원배열;

import java.util.Scanner;

public class Ex012_n의배수구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar =new int[5];
		
		for(int i=0;i<ar.length;i++) {
			System.out.print((i + 1) + "번째 입력 >> ");
			ar[i]= sc.nextInt();
		}
		System.out.print("배수를 입력하세요 >> ");
		int n = sc.nextInt();
		
		System.out.print("2의 배수는 ");
		for(int i=0; i<ar.length; i++) {
			if(ar[i]%n==0) {
				System.out.print(ar[i]+" ");
			}
				
		}
		System.out.println("입니다.");
		
		
		
		
		
		
		
		
		
		
		
	}

}
