package 배열;

import java.util.Arrays;
import java.util.Random;

public class Ex04_배열예제3 {

	public static void main(String[] args) {
		
		//랜덤 도구 꺼내기
		Random ran = new Random();
		
		//배열 생성
		int[] ar = new int[5];
		
		//ex array의 0번 인덱스방에 자료(=데이터) 랜덤수(1~10)로 초기화
		//ar[0] = ran.nextInt(10)+1;
		
		//for문 생성
		//i가 0~4까지 5번 반복하는 역할
		//각 인덱스마다 랜덤수를 넣어주기
		//만약 중복 숫자가 발생하면 인덱스 번호를 다시 앞으로 보내서 재실행.
		for(int i=0; i<ar.length; i++) {
			ar[i] = ran.nextInt(5)+1;
			for(int j=0; j<i; j++) {						
				if(ar[i]==ar[j]) {
					i--;
				}
				
			}
		}
		System.out.print(Arrays.toString(ar));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
