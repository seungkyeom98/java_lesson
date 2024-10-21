package 알고리즘문제;

public class 문제4 {

	public static void main(String[] args) {
//		[4] 편지
//		- 할머니께 생신 축하 편지를 쓰려고 합니다. 할머니가 시기 편하도록 글자 한 자 한 자를 가로 2cm 크기로 적으려고 하며,
//		  편지를 가로로만 적을 때, 축하 문구를 String에 담고, 그것을 적기 위해 필요한 편지지의 최소 가로길이(cm)를 출력해주세요.
//		※ String msg = "Happy Birthday!" 일 때, 30 출력
//		※ String msg = "I love you~" 일 때, 22 출력
		
		String msg1 = "Happy Birthday!";
		String msg2 = "I love you~";
		
		int a = msg1.length();
		int b = msg2.length();
		
		System.out.println(msg1+"일 때, "+2*a+"출력");
		System.out.println(msg2+"일 때, "+2*b+"출력");
				
		
	}

}
