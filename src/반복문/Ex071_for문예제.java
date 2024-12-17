package 반복문;

import java.util.Scanner;

public class Ex071_for문예제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = 0;
		int count =77;
		int b=0;
		for (int i = 1; i <= 77; i++) {

			a += (78 - i) * i;//a =a+ (78 - i) * i;

		}
		System.out.println(a);
		
		for (int i = 1; i <= 77; i++) {

			b += count * i; //b =b+ count * i;
			
			count--;
		}
		System.out.println(b);
	}

}
