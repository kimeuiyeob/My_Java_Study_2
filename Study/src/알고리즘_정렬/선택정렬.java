package 알고리즘_정렬;

import java.util.Arrays;

public class 선택정렬 {

	// 처음 값부터 순서대로 뒤에 값을 다확인하고 넘어가는 정렬
	public static void main(String[] args) {

		int[] arr = { 5, 7, 9, 1, 4, 6, 2, 8, 3 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println("진행중 : " + Arrays.toString(arr));
		}

		System.out.println("=====================================");
		System.out.println("선택 정렬 완료 : " + Arrays.toString(arr));

	}

}
