package 알고리즘_재귀;

public class Recursive3 {
	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		return factorial(n - 1) * n;
	}

	public static void main(String[] args) {
		int number = factorial(5);
		System.out.println(number);
	}
}