package 알고리즘_DFS;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DFS_1 {

	static boolean visited[]; // 방문 배열
	static List<Integer>[] A;

	public static void main(String[] args) throws IOException {
		
		//노드 6 에지 5
		// 1 2
		// 2 5
		// 5 1
		// 3 4
		// 4 6

		Scanner sc = new Scanner(System.in);
		
		System.out.println("노트 개수와 에지 개수 입력!");

		int n = sc.nextInt(); // n = 노드 개수
		int m = sc.nextInt(); // m = 에지 개수(줄)

		visited = new boolean[n + 1];
		
		A = new ArrayList[n + 1];

		for (int i = 1; i < n + 1; i++) {
			A[i] = new ArrayList<>();
		}

		System.out.println("노드 값 입력!");
		for (int i = 0; i < m; i++) {
			int start = sc.nextInt(); // 시작점
			int end = sc.nextInt(); // 끝나는점
			A[start].add(end);
			A[end].add(start);
		}

		int cnt = 0;

		for (int i = 1; i < n; i++) {
			if (!visited[i]) {
				cnt++;
				DFS(i);
			}
		}

		System.out.println("결과 : " + cnt);
	}

	private static void DFS(int idx) {
		if(visited[idx]) { //기본값이 false로 되어있는데 방문해서 true로 바꼇다면 방문했다는 뜻이라서 return
			return;
		}
		visited[idx] = true; //방문 했다는 뜻
		for(int i : A[idx]) {
			if(!visited[i]) {
				DFS(i);
			}
		}

	}

}
