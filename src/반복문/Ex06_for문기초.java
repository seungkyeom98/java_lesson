package 반복문;

public class Ex06_for문기초 {

	public static void main(String[] args) {
		//for문
		//반복 횟수가 명확하게 정해진 반복문
		
		//기본구조
		// for(초기화구문; 검사조건; 반복후작업){
		//	실행구문(검사조건이 true인 경우에 실행)
		// }
		int i;
		for( i=0; i <5; ++i) {
			System.out.print(i+"번째");
			System.out.println("실행");
		}
		System.out.println(i+"끝난후");
		/* 
	       * 1. i가 0으로 시작
	       * 2. 조건 검사
	       * 3. true -> 실행
	       * 4. 후작업 (i++)
	       * 5. i는 1이 됨
	       * 6. 조건 검사
	       * 7. true -> 실행
	       * 8. 후작업 (i++)
	       * 9. 조건 검사....
	       * ....
	       * 하다가 i를 ++했더니 5가 됨
	       * 조건 검사 (false)
	       * 실행 하지 않고 종료
	       *  */
		
	}

}
