package 재귀함수;

public class 피보나치 {

	public static void main(String[] args) {
		int n = 10;

		for (int i = 0; i < n; i++)
			System.out.print(Fibonacci(i) + " ");
	}

	public static int Fibonacci(int n) {
		if (n == 0)
			return 0;

		if (n == 1 || n == 2)
			return 1;

		else
			return Fibonacci(n - 1) + Fibonacci(n - 2);
	}
}