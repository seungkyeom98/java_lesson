package 메소드;

public class Ex05_메소드예제4 {

	public static void main(String[] args) {
		 // 약수의 합을 구하여 반환하는 
		 //getSumOfDivisors() 메소드를 구현하세요.

	     int num = 10;
	     int result = getSumOfDivisors(num);
	      
	     System.out.println(num+"의 약수의 합 : "+result);
	      
	}
	
	public static int getSumOfDivisors(int a) {
		int result=0;
		
		for(int i =1; i<=a;i++) {
			if(a%i==0) {
				result = result+i;//result+=i; 
			}
		}
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
