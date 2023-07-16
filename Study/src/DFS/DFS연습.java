package DFS;

public class DFS연습 {

	// 재귀 함수를 사용해서 n까지의 합계를 구하라

	public static int recursiveSum(int n) {
		if (n == 1) {
			return 1; // 더이상 쪼개지지 않는 지점에서 값을 반환합니다.
		}
		return recursiveSum(n - 1) + n;
	}

	public static void main(String[] args) {
		int n = 10;

		System.out.println("1부터 10까지의 합(재귀함수) : " + recursiveSum(n));
	}

}
