package 정렬알고리즘;

import java.util.Arrays;
import java.util.Random;

public class Ex03_정렬예제 {

	public static void main(String[] args) {
		
		int[] ar = new int[10];
		Random ran = new Random();
		
		for(int i=0; i<ar.length; i++) {
			ar[i] = ran.nextInt(100)+1;
			for(int j=0; j<i; j++) {	//중복값 없애기 코드					
				if(ar[i]==ar[j]) {		//이하동문
					i--;				//
				}						//
			}
		}
		System.out.println("할당된 초기값: "+Arrays.toString(ar));
		int temp = 0;
		
		for(int j=0;j<ar.length;j++) {
			int maxIndex = j; 
		
				for(int i=maxIndex;i<ar.length;i++) {
					if(ar[maxIndex]<ar[i]) {
						//기준 인덱스 0(=0번 방)보다 큰 값(=데이터=원소)이 담긴 다른 인덱스 방들이 있니?
						//최대 인덱스(=방번호) 방만 찾아서 나가기
						maxIndex =i;
					}
				}
		
				//교환 작업
				temp = ar[j];
				ar[j]=ar[maxIndex];
				ar[maxIndex]=temp;
				
		}		
			
		System.out.println("최종 값: "+Arrays.toString(ar));
		
		
		
		
		
		
		
	}

}
