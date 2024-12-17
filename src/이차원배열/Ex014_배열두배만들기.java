package 이차원배열;

import java.util.Arrays;

public class Ex014_배열두배만들기 {

	public static void main(String[] args) {
		
		int[] ar= {1,2,3,4,5};
		int[] newAr= new int[5];
		
		for(int i =0; i<ar.length; i++) {
			newAr[i]= 2*ar[i];
		}
		
		System.out.println("ar: "+Arrays.toString(ar));
		System.out.println("newAr: "+Arrays.toString(newAr));
		
		
		
		
		
		
		
		
		
	}

}
