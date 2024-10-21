package 이차원배열;

import java.util.Arrays;

public class Ex013_배열뒤집기 {

	public static void main(String[] args) {
		
		int[] ar= {1,2,3,4,5};
		int[] newAr = new int[5];
		for(int i=ar.length-1; i>=0; i--) {
			for(int j=0; j<newAr.length; j++) {
				if(i+j==ar.length-1) {
				newAr[j]=ar[i];
				}
			//newAr[i]=ar[ar.length-1-i];
			}
			
		}
		System.out.println("arr : "+Arrays.toString(ar));
		System.out.println("newAr : "+Arrays.toString(newAr));
	}

}
