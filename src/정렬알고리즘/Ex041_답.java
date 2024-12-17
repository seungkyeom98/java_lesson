package 정렬알고리즘;

public class Ex041_답 {

	public static void main(String[] args) {
		 int[] arr = {92, 32, 52, 9, 81, 2, 68};
	        
	        // 초기 변수 설정
	        int minDistance = Integer.MAX_VALUE;
	        int index1 = 0;
	        int index2 = 0;
	        
	        // 배열을 순회하면서 두 숫자의 차이를 계산
	        for (int i = 0; i < arr.length - 1; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                int distance = Math.abs(arr[i] - arr[j]);
	                if (distance < minDistance) {
	                    minDistance = distance;
	                    index1 = i;
	                    index2 = j;
	                }
	            }
	        }
	        
	        // 결과 출력
	        System.out.println("가장 가까운 숫자의 인덱스: [" + index1 + ", " + index2+"]");
	}

}
