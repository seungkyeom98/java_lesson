package 이차원배열;

public class Ex011_이차원배열 {

	public static void main(String[] args) {
		
		int[][] ar= new int [5][5];
		int count =21;
		for(int i=0;i<5;i++) {
			if(i%2==0) {
				for(int j=0;j<5;j++) {
					ar[i][j] =count++;
				}
			}else {
				for(int j=4;j>=0;j--) {
					ar[i][j] =count++;
				}
			}
		}
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(ar[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
