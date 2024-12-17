package 배열;

import java.util.Random;

public class Ex03_배열예제2 {

	public static void main(String[] args) {
		//홀수 찾기
		//1. 정수형 데이터 5개를 담을 수 있는 배열 선언.
		int[] ar = new int[5];
		int oddNumber=0; //홀수 갯수 셀 변수 공간.
		
		//2. 배열 안 값들을 랜덤으로 저장(1~100)
		//	ar[0]=ran.nextInt(100)+1;
		//3. 배열 안 데이터 중에서 홀수인 값만 출력.
		Random ran = new Random();
		System.out.print("배열에 입력된 홀수는");
		for(int i=0; i<ar.length;i++) {
			ar[i]=ran.nextInt(5)+1;
			if(ar[i]%2==1) {
			System.out.print(" "+ar[i]);
			oddNumber++;
			}
		}
		
		//4. 홀수가 총 몇개인지 출력
		System.out.println("이고, 홀수의 총 개수는 "+oddNumber+"개 입니다.");
		
		
		
		
		
		
		
		
		
		
	}

}
