package 알고리즘문제;

public class 문제3 {

	public static void main(String[] args) {
//		[3] 최댓값 만들기(1)
//		- 정수 배열이 있을 때, 그 배열의 데이터 중 두 개를 곱해서 만들 수 있는 최대값을 출력해주세요!
//		※ 배열이 {1,2,3,4,5} 일 때 20 출력
//		※ 배열이 {0, 31, 24, 10, 1, 9}일 때 744 출력
		
		int [] arr= {0,31,24,10,1,9};
		int maxValue= 0;
		int b= 0;
		
		for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int multiply = arr[i] * arr[j];
                if (multiply > maxValue) {
                	maxValue = multiply;
                }
            }
        }
		System.out.println(maxValue+"출력");
		
	}

}
