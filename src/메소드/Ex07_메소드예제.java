package 메소드;

public class Ex07_메소드예제 {

	public static void main(String[] args) {
		
		int array[]= {15,10,2,8,23};
		int array2[]= {151,110,22,38,243};
		
		
		System.out.println("평균값은 "+average(array));
		System.out.println("평균값은 "+average(array2));
		
	}
	
	public static double average(int[] arr) {
		double sum;//변수 선언!
		sum=0;//변수에 (값=데이터=자료) 할당! (->초기화)
		
		double result;
		result=0;
		
		for(int i=0; i<arr.length; i++) {
			sum+= arr[i]; //result= result + arr[i];
		}
		result=sum/arr.length;  //int의 자료형(=자료형태=데이터타입)으로 만약 선언했더라도, result= (double)sum/arr.length; 또는 result=sum/(double)arr.length;와 같이 분자나 분모 어디든 명시적 형변환(강제적 형변환 int-> double로 바꾸니까! 묵시적 형변환이 아니다!)을 해준다.
		
		
		return result;
			
	}
	
	
	
	
	
	
	
}
