package 알고리즘_정렬;

import java.util.Arrays;

public class 버블정렬 {

	// 2개씩 짝지어서 비교해서 숫자가 더 작은걸 앞으로 땡기는개 버블정렬
	public static void main(String[] args) {

		int[] arr = { 5, 7, 9, 1, 4, 6, 2, 8, 3 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			System.out.println("진행중 : " + Arrays.toString(arr));
		}
		
		System.out.println("======================");
		System.out.println("버블 정렬 완료 : " + Arrays.toString(arr));

	}

}
