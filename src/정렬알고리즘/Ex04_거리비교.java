package 정렬알고리즘;

public class Ex04_거리비교 {

	public static void main(String[] args) {
		
		int[] ar = {92,32,52,9,81,2,68};
		int[] path= new int[2];
		int maxIndex =0;
		int temp =0; //temporary=일시적인
		
		for(int i=0; i<ar.length;i++ ) {
			maxIndex=i;
			for(int j=maxIndex; j<ar.length; j++) {
				if(ar[maxIndex]<=ar[j]) {
					maxIndex=j;
				}
			}
			temp=ar[i];
			ar[i]=ar[maxIndex];
			ar[maxIndex]=temp;
		}
		
		//{2,9,32,52,68,92}
		int a=0;
		int b=0;
		
		for(int i=0; i<ar.length-1;i++) {
			a= ar[i+1]-ar[i];
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
