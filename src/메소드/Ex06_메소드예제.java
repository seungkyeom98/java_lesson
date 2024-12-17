package 메소드;

public class Ex06_메소드예제 {
//startValue~endValue까지의 숫자 중 완전수를 출력하는
//getPerfectNumber()메소드를 구현하세요
//결과: 2~1000까지의 완전수 : 6 28 496
	public static void main(String[] args) {
		int startValue=2;
		int endValue=1000;
		
		getPerfectNumber(startValue, endValue);
		
	}

	public static void getPerfectNumber(int a, int b) {
		
		System.out.print(a+"~"+b+"까지의 완전수 : ");
		int result;// 변수 선언!
		result=0; // 변수 초기화=할당을 선언과 함께하지말자! 선언과 초기화가 한개처럼 인식되기 때문이다.
					// 두개는 엄연히 다른건데 말이다! int result=0; 이런식으로 적지 말자! 두줄로 정확히 적자!!! 두개는 엄연히 문법이니까 이다!!
		for(int i=a; i<=b; i++) {
			//System.out.println(i+"i의수");
			for(int j=1; j<i; j++) {
				if(i%j==0) {
					result= result+j; //result+=i;
					//System.out.println(result);
				}
			}
			if(i==result) {
				System.out.print(result+" ");// 뭐가 문제여서, 출력이 되는지 선생님 오시면 물어보기.
				}	
			result=0; //다시 초기화, 완전수 여기 그 완전수의 합이 들어있기 떄문에, i돌때마다 초기화 한번씩 해줘야한다!
		}
		
	}
	//1,24,2,12,3,8,4,6
	//1,2,3,4,6,8,12,24
	//j가 8까지 더했을때, 24가 한번 완성돼서, 조건식에 들어와서, print를 출력해서 그랬다.
	//3,15,12,6
	//18,18
	//24빼고 다 더하면, 36 이상하다.
	
	//디버깅 하는법! 한줄마다 다 print문 출력해보면서, 이해해보면 된다!!
	//선생님께서 이렇게 디버깅 하셨다!
	
	//선생님 코드, 정답 코드!
	public static void getPerfectNumber1(int s, int e) {
		// s~e까지 전부 다 약수의 합을 구해야 한다!
		// s~e까지 늘려가는 for문
		int count =0;
		for(int i=s; i<e;i++) {
			// -> 2, 3, ... 1000에 대해서 각각의 약수의 합이 얼마인지 확인하는 for문
			for(int j=1; j<i; j++) {
				// i가 5일 때, j for문에 들어오면
				// 5를 1~4까지 나누면서, 약수인지 확인
				// -> 약수라면 누적해서 더해주기
				// 10을 1~9까지 나누면서, 약수가 있는지 확인
				// -> 1,2,5,10-> 10의 약수
				// 1,2,5 -> 본인을 제외한 약수의 합이 본인이랑 같은가?
				
				// 6을 1~5까지 나누면서, 약수가 있는지 확인
				// 1,2,3,6 -> 6의 약수
				// 1,2,3 -> 본인을 제외한 약수의 합이 본인이랑 같은가?
				// ==> 완전수다~~ 그러면 6을 출력
				if(i%j==0) {
					count =count+j;
				}
				
			}
			if(i==count) {
				System.out.println(count+" ");
			}
			count=0;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
