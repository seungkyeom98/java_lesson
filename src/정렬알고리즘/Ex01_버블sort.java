package 정렬알고리즘;

import java.util.Arrays;

public class Ex01_버블sort {

	public static void main(String[] args) {
		//원소(=인덱스(=방번호)마다 들어있는 값=데이터=자료), 알고리즘=흐름도=방법=메소드=함수
		//정렬 알고리즘: 원소들을 일정한 순서대로 열거하는 알고리즘
		//bubbleSort: 두 인접한 원소끼리 비교해서 정렬하는 방법
		//-> 속도가 느린대신, 코드가 단순하다.
		
		int[] ar= {82,45,25,12,7};
		
		System.out.println("변경 전: "+Arrays.toString(ar));
		
		//버블쇼트 알고리즘 1단계
		for(int i=0;i<ar.length-1;i++) {
			if(ar[i]>ar[i+1]) {
				int temp= ar[i];//temp:temporary=일시적인->임시 변수이름(=임시 저장공간 이름)
				ar[i]=ar[i+1]; //rep: repeat=반복한다 -> 반복 변수이름(= 반복 저장공간 이름)
				ar[i+1]=temp;
			}
		}
		System.out.println("1차: "+Arrays.toString(ar));
		
		//2단계
		//0-1,1-2,2-3
		for(int i=0; i<ar.length-2; i++) {
			if(ar[i]>ar[i+1]) {
				int temp= ar[i];//temp:temporary=일시적인->임시 변수이름(=임시 저장공간 이름)
				ar[i]=ar[i+1]; //rep: repeat=반복한다 -> 반복 변수이름(= 반복 저장공간 이름)
				ar[i+1]=temp;
			}
		}
		System.out.println("2차: "+Arrays.toString(ar));
		//3단계	
		for(int i=0; i<ar.length-3; i++) {
			if(ar[i]>ar[i+1]) {
					int temp= ar[i];//temp:temporary=일시적인->임시 변수이름(=임시 저장공간 이름)
					ar[i]=ar[i+1]; //rep: repeat=반복한다 -> 반복 변수이름(= 반복 저장공간 이름)
					ar[i+1]=temp;
			}
		}
		System.out.println("3차: "+Arrays.toString(ar));
		//4단계
		for(int i=0; i<ar.length-4; i++) {
			if(ar[i]>ar[i+1]) {
					int temp= ar[i];//temp:temporary=일시적인->임시 변수이름(=임시 저장공간 이름)
					ar[i]=ar[i+1]; //rep: repeat=반복한다 -> 반복 변수이름(= 반복 저장공간 이름)
					ar[i+1]=temp;
			}
		}
		System.out.println("4차: "+Arrays.toString(ar));
		//한번에 하기
		for(int k=1; k<ar.length;k++) {
			for(int i=0; i<ar.length-k; i++) {
				if(ar[i]>ar[i+1]) {
						int temp= ar[i];//temp:temporary=일시적인->임시 변수이름(=임시 저장공간 이름)
						ar[i]=ar[i+1]; //rep: repeat=반복한다 -> 반복 변수이름(= 반복 저장공간 이름)
						ar[i+1]=temp;
				}
			}
		}
		System.out.println("이중포문: "+Arrays.toString(ar));
		
		
		
		
		
	}

}
