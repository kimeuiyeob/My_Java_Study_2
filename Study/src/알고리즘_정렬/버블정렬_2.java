package 알고리즘_정렬;

import java.util.Arrays;

public class 버블정렬_2 {

	public static void main(String[] args) {

		int[] bubbleArr = { 5, 5, 2, 3, 4, 1 };
		int cnt = 0;

		for (int i = 0; i < bubbleArr.length; i++) {
			for (int j = 0; j < bubbleArr.length - 1 - i; j++) {
				if (bubbleArr[j] > bubbleArr[j + 1]) {
					int temp = bubbleArr[j];
					bubbleArr[j] = bubbleArr[j + 1];
					bubbleArr[j + 1] = temp;
				}
				cnt++;
			}
		}
		System.out.println("반복횟수 : " + cnt);
		System.out.println(Arrays.toString(bubbleArr));
	}
}
