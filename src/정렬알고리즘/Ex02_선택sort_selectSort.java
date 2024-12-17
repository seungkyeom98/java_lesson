package 정렬알고리즘;

import java.util.Arrays;

public class Ex02_선택sort_selectSort {

	public static void main(String[] args) {
		// 선택 정렬
		// 가장 크거나 작은 원소를 찾아서
		// 배열의 처음부터 끝을 교체해 나가는 정렬 방법

		int[] ar = { 46, 2, 15, 86, 50 };
		System.out.println("할당된 초기값: " + Arrays.toString(ar));

		// 1단계
		// 기준 인덱스(=방번호) : 0
		// 가장 큰 수에 해당하는 인덱스 번호
		int maxIndex = 0;

		for (int i = maxIndex; i < ar.length; i++) {
			if (ar[maxIndex] < ar[i]) {
				// 기준 인덱스 0(=0번 방)보다 큰 값(=데이터=원소)이 담긴 다른 인덱스 방들이 있니?
				// 최대 인덱스(=방번호) 방만 찾아서 나가기
				maxIndex = i;
			}
		}

		// 교환 작업
		int temp = ar[0];
		ar[0] = ar[maxIndex];
		ar[maxIndex] = temp;

		// 2단계
		// 기준 인덱스(=방번호) : 0
		// 가장 큰 수에 해당하는 인덱스 번호
		maxIndex = 1;

		for (int i = maxIndex; i < ar.length; i++) {
			if (ar[maxIndex] < ar[i]) {
				// 기준 인덱스 0(=0번 방)보다 큰 값(=데이터=원소)이 담긴 다른 인덱스 방들이 있니?
				// 최대 인덱스(=방번호) 방만 찾아서 나가기
				maxIndex = i;
			}
		}

		// 교환 작업
		temp = ar[1];
		ar[1] = ar[maxIndex];
		ar[maxIndex] = temp;

		// 한번에 하기
		for (int j = 0; j < ar.length; j++) {
			maxIndex = j;

			for (int i = maxIndex; i < ar.length; i++) {
				if (ar[maxIndex] < ar[i]) {
					// 기준 인덱스 0(=0번 방)보다 큰 값(=데이터=원소)이 담긴 다른 인덱스 방들이 있니?
					// 최대 인덱스(=방번호) 방만 찾아서 나가기
					maxIndex = i;
				}
			}

			// 교환 작업
			temp = ar[j];
			ar[j] = ar[maxIndex];
			ar[maxIndex] = temp;

		}

		System.out.println("최종 값: " + Arrays.toString(ar));

	}

}
