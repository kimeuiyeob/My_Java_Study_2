package 알고리즘_재귀;

public class Recursive {

	// *****
	// *****
	// ***** 재귀함수로 이렇게 별을 찍어보자

	public static void dfs(int number) {

		if (number == 0) {
			System.out.println("하이");
			return;
		}
		dfs(number - 1);
		System.out.println(number);
		System.out.println("*****");
	}

	public static void main(String[] args) {
		dfs(5);
	}

}
