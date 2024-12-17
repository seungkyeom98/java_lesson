package 알고리즘문제;

public class 문제6 {

	public static void main(String[] args) {
//		[6] 분수의 덧셈
//		- 첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 변수로 주어집니다. 
//		  두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 출력해주세요!
//		※ numer1=1 , denom1=2, numer2=3, denom2=4일 때, 5,4 출력  (2분의 1과 4분의 3을 더할때 기약 분수로 만들어서 더한 값이 5분의 4 라는 뜻!)
//		※ numer1=9 , denom1=2, numer2=1, denom2=3일 때, 29,6 출력  (2분의 9과 3분의 1을 더할때 기약 분수로 만들어서 더한 값이 6분의 29 라는 뜻!)
		
		int numer1=9;
		int denom1=2;
		int numer2=1;
		int denom2=3;
		
		int a=0;
		int b=0;
		int sum=0;
		int bot=0;
		int c=1;
		
		a=numer1*denom2;
		b=numer2*denom1;
		sum=a+b;
		bot=denom1*denom2;
		
		//최대 공약수 찾기
		for(int i=2; i<=bot;i++) {
			if(sum%i==0 && bot%i==0) {
				c=i;
			}
		}
		int finSum=sum/c;
		int finBot=bot/c;
		
		System.out.println(finSum+","+finBot+"출력");
		
		
		
		
		
	}

}
