package 알고리즘_위치;

import java.util.Arrays;

public class 로봇청소기 {

	public int[] solution(int[][] board, int k) {
		
		int[] answer = new int[2];
		int[] dx = { -1, 0, 1, 0 };
		int[] dy = { 0, 1, 0, -1 };

		int x = 0, y = 0, d = 1;
		int cnt = 0;

		while (cnt < k) {

			cnt++;

			int nx = x + dx[d];
			int ny = y + dy[d];

			if (nx < 0 || ny < 0 || nx >= board.length || ny >= board.length || board[nx][ny] == 1) {
				d = (d + 1) % 4;
				continue;
			}

			x = nx;
			y = ny;

		}

		answer[0] = x;
		answer[1] = y;
		return answer;
	}

	public static void main(String[] args) {
		로봇청소기 T = new 로봇청소기();
		int[][] arr1 = { { 0, 0, 0, 0, 0 }, { 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0 }, { 1, 0, 1, 0, 1 },
				{ 0, 0, 0, 0, 0 } };
		System.out.println(Arrays.toString(T.solution(arr1, 10)));
//		int[][] arr2 = { { 0, 0, 0, 1, 0, 1 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 1 }, { 1, 1, 0, 0, 1, 0 },
//				{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
//		System.out.println(Arrays.toString(T.solution(arr2, 20)));
//		int[][] arr3 = { { 0, 0, 1, 0, 0 }, { 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 1, 0, 0, 0, 1 },
//				{ 0, 0, 0, 0, 0 } };
//		System.out.println(Arrays.toString(T.solution(arr3, 25)));

	}
}