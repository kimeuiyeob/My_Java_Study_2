package 알고리즘_재귀;

public class 피보나치수열 {

	public static int pibonachi(int number) {

		if (number <= 1) {
			return number;
		}
		return pibonachi(number - 1) + pibonachi(number - 2);
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			System.out.print(pibonachi(i) + " ");
		}
	}

}
