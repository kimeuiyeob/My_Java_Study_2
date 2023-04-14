package 재귀함수;

public class 최대값찾기 {

	public static void main(String[] args) {

		int arr[] = { 0, 20, 40, 60, 80, 100 };
		int biggetNumber = BiggestNumberArr(arr, 3);
		System.out.println(biggetNumber);

	}

	public static int BiggestNumberArr(int[] a, int n) {
		int number;
		if (n == 1) {
			return a[0];
		} else {
			number = BiggestNumberArr(a, n - 1);
		}

		if (number > a[n - 1]) {
			return number;

		} else {
			return a[n - 1];
		}

	}
}