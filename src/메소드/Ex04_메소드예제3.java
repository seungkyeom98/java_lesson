package 메소드;

public class Ex04_메소드예제3 {

	public static void main(String[] args) {
		// num2가 num1의 약수인지 확인하여 true/false를 반환하는 isDivisor() 메소드를 구현하세요
	      
	      int num1 = 10;
	      int num2 = 3;
	      
	      boolean divisor = isDivisor(num1, num2);
	      
	      System.out.println(divisor);
	}

	public static boolean isDivisor(int a,int b) {
		
		boolean result=true;
		
		if(a%b!=0) {
			result=false;
		}
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
