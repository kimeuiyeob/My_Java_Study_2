package 알고리즘_탐색;

public class 이진탐색 {

	// 기본적으로 정렬되어있는 배열을 가운데 잘라 숫자 비교하고 이런식이다.
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int number = binarySearch(arr, 10);
		System.out.println("검색 카운트 : " + number);
	}

	public static int binarySearch(int[] arr, int number) {

		int cnt = 0; // 검색 갯수
		int left = 0;
		int right = arr.length - 1;

		while (true) {

			int mid = (left + right) / 2;
			cnt++;

			if (number == arr[mid]) {
				System.out.println("찾았다!!");
				break;
			}
			if (number < arr[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}

		return cnt;
	}

}
