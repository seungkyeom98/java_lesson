package 메소드;

import java.util.Arrays;

public class Ex08_메소드예제 {

	public static void main(String[] args) {
		
		int[] array = {1,3,4,8,9,10};
		arrayToString(array);

		
	}

	public static void arrayToString(int[] arr) {
		
		int a=0;
		int b=0;
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
		
		//System.out.println(Arrays.toString(arr));
	}
	
	
	
	
}
