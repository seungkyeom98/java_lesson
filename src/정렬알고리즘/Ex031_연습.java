package 정렬알고리즘;

import java.util.Arrays;
import java.util.Random;

public class Ex031_연습 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int[] ar = new int[10];
		int maxIndex =0;
		int temp = 0;
		
		for(int i=0; i<ar.length;i++) {
			ar[i] = ran.nextInt(100)+1;
			for(int j=0; j<i; j++) {
				if(ar[i]==ar[j]) {
					i--;
				}
			}
		}
		System.out.println("첫 값들 : "+Arrays.toString(ar));
		
		for(int i=0; i<ar.length; i++) {
			maxIndex=i;
			for(int j=maxIndex;j<ar.length; j++) {
				if(ar[maxIndex]<=ar[j]) {
					maxIndex=j;
				}
			}
			temp=ar[i];
			ar[i]=ar[maxIndex];
			ar[maxIndex]=temp;
		}
		
		System.out.println("결과 값들 : "+Arrays.toString(ar));
		
		
		
		
		
		
		
		
		
		
		
	}

}
