package 반복문;

import java.util.Scanner;

public class Ex09_별찍기1 {

	public static void main(String[] args) {
		// 1. for문 하나를 이용해서 결과창에
		// *
		// **
		// ***
		// ****
		// ***** 만들기
		Scanner sc = new Scanner(System.in);

//		System.out.print("행 개수 : ");
//		int a = sc.nextInt();

//		for(int i=1;i<=a;i++ ) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//					
//				}
//			System.out.println();
//			}
//==============================================================
//		for(int i=5;i>=1;i-- ) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//					
//				}
//			System.out.println();
//			}	
//===============================================================
//		System.out.print("행 개수 : ");
//		int a = sc.nextInt();

//		for(int i=a;i>=1;i-- ) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//					
//				}
//			System.out.println();
//			}	
//================================================================
//		for (int a = 1; a <= 5; a++) {
//		
//			
//			for (int j = 5-a; j >= 1; j--) {
//				System.out.print(" ");
//				
//			}
//		
//			//for (int i = a; i >= 1; i--)
//			for (int i = 1; i <=a; i++)
//			{
//				
//				System.out.print("*");
//
//			}
//			System.out.println();
//		}
//================================================================
//		System.out.print("행 개수 : ");
//		int c = sc.nextInt();
//
//		for (int a = 1; a <= c; a++) {
//
////			for (int j = c - a; j >= 1; j--)
//			for (int j = c; j > a; j--) {
//				System.out.print(" ");
//
//				}
//
////			for (int i = a; i >= 1; i--) 
//			for (int i = 1; i <= a; i++) {
//
//				System.out.print("*");
//
//				}
//			System.out.println();
//			}
//================================================================			
//			int a=0;
//			int b=0;
//			
//			for(int i=1; i<=100; i++) 
//			{
//				if(i%2==1) 
//				{
//					a=a+i;
//					System.out.print(i+" ");
//				}
//				if(i%2==0) 
//				{
//					b=b-i;
//					System.out.print(-i+" ");
//				}
//				
//			}
//			System.out.println();
//			System.out.println("결과 : "+(a+b));
//==============================================================				
		int c=0;
		int d=0;
		System.out.print("정수 입력 : ");
		int a = sc.nextInt();
		for(int i=7; i>=0; i--) 
		
		{
			int b = (int)Math.pow(10, i);
			
			c= a/b;
			d+=c;
			a= a-(a/b)*b;
			
		}
			System.out.println("합은 "+d+"입니다.");
			//for(int i=a.length(); i>=0; i--)를 쓰면, 
			//a가 몇자리든, 다 된다. length() 활용
//=================================================================			
		System.out.print("n 입력 : ");
		int a1 = sc.nextInt();
		int b=1;
		for(int i=1;i<=a1;i++)
		{
			System.out.print(b+" ");
			b = b+i;
		}
//			b*=2;
//			b= b*2;
//			b=b+(b*2);
//			
//			b/=2;
//			b= b/2;
//			b=b+(b/2);
//			b=b*(3/(double)2);
//			b*=3/2;
			
//=================================================================			
//		System.out.print("입력 : ");
//		int a= sc.nextInt();
//		int b =1;
//		for(int i =1; i<=a; i++)
//		{
//			b*=i;//b=b*i;
//		}
//		System.out.println("출력 : "+b);
			
//=================================================================			
			
			
			
			
			
			
			
		

	}

}
