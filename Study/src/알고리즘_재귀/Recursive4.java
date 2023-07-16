package 알고리즘_재귀;

public class Recursive4 {

	public static int square(int x, int y) {
		if (y == 0) {
			return 1;
		}
		return x * square(x, --y);
	}

	public static void main(String[] args) {
		int squareResult = square(3, 4);
		System.out.println(squareResult);
	}

}
