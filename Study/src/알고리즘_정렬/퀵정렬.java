package 알고리즘_정렬;

import java.util.Arrays;

public class 퀵정렬 {

	public static void main(String[] args) {
		int[] A = { 6, 9, 5, 1, 12, 4, 8, 7, 2, 11, 10, 3 };
		quickSort(A, 0, A.length - 1);
		System.out.println(Arrays.toString(A));
	}

	public static void quickSort(int[] arr, int start, int end) {
		int part2 = partiton(arr, start, end);
		if (start < part2 - 1) {
			quickSort(arr, start, part2 - 1);
		}
		if (part2 < end) {
			quickSort(arr, part2, end);
		}
	}

	public static int partiton(int[] arr, int start, int end) {
		int pivot = arr[(start + end) / 2];
		while (start <= end) {
			while (arr[start] < pivot) {
				start++;
			}
			while (arr[end] > pivot) {
				end--;
			}
			if (start <= end) {
				int tmp = arr[start];
				arr[start] = arr[end];
				arr[end] = tmp;
				start++;
				end--;
			}
		}
		return start;
	}
}