package 알고리즘_재귀;

public class Recursive2 {

	public static void printStar(int n) {
		if (n == 0) {
			return;
		}

		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}
		System.out.println();

		printStar(n - 1);

		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}
		System.out.println();

	}

	public static void main(String[] args) {
		printStar(5);
	}

}