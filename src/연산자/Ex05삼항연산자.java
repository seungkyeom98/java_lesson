package 연산자;

public class Ex05삼항연산자 {

	public static void main(String[] args) {
		// 삼항연산자
		// 간단한 조건 제어 처리가 가능한 연산자
		// (조건문) ? (실행문1) : (실행문2)
		// => 조건문이 참이라면 실행문1을,
		// 거짓이라면 실행문2를 실행 ㄱㄱ

		int a = 10;
		int b = 20;

		System.out.println(a == b ? "같아유" : "달라유");

		// a가 b보다 크면, result에 10이 들어가고, 작으면 20이 들어간다
		int result = a > b ? 10 : 20;

		// a가 b와 같다면 message에 a+b의 값, 다르면 a-b의 값을 넣기
		int message = a == b ? a + b : a - b;

	}

}
