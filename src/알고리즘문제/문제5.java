package 알고리즘문제;

public class 문제5 {

	public static void main(String[] args) {
//		[5] 머쓱이보다 키 큰 사람
//		- 머쓱이는 학교에서 키 순으로 줄을 설 때 몇 번째로 서야 하는지 궁금해졌습니다.
//		  머쓱이네 반 친구들의 키가 담긴 정수 배열 array와 머쓱이의 키 height가 변수로 주어질 때, 머쓱이보다 키 큰 사람 수를 출력해주세요!
//		※ array가 {149, 180, 192, 170} 이고,  int height=167 일때, 3 출력 
//		※ array가 {180, 120, 140} 이고,  int height=190 일때, 0 출력
		
		int[] ar = {180,120,140};
		int height = 190;
		int a=0;
		for(int i=0; i<ar.length; i++) {
			if(height<ar[i]) {
				a++;
			}
		}
		System.out.println(a+"출력");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
