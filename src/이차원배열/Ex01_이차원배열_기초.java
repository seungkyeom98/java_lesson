package 이차원배열;

import java.util.Random;

public class Ex01_이차원배열_기초 {

	public static void main(String[] args) {
		
		//이차원 배열 생성법
		int [][] ar= new int[5][5];
		
		// 각각의 인덱스에 값을 지정
		//ar[0][0]=1;
		int count =21;
		for(int i=0; i<5;i++) {
			for(int j=0; j<5;j++) {
				ar[i][j]=count++;
			}
		}
		
		for(int i=0; i<5;i++) {
			for(int j=0; j<5;j++) {
		
				System.out.print(ar[j][i]+"\t");
				
			}
			System.out.println();
		}
		
		
		
		
	}

}
