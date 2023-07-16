package 알고리즘;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DFS비행기 {
	public int solution(int[][] flights, int s, int e, int k) {
		List<Integer> priceList = new ArrayList<>();
		int price = 0;

		for (int i = 0; i < flights.length; i++) {
			if (flights[i][0] == s) {
				getAirplane(flights, flights[i][1], e, k, priceList, price + flights[i][2]); // start에다가 도착지점을 보낸다.
			}
		}
		Collections.sort(priceList);
		return priceList.size() == 0 ? -1 : priceList.get(0);
	}

	public static void getAirplane(int[][] refineArr, int s, int e, int k, List<Integer> priceList, int price) {

		if (s == e) { // 시작지점과 도착지점이 같을때
			priceList.add(price);
			return;
		}

		k--;
		if (k == -1) { // 경유 횟수가 끝날때
			return;
		}

		for (int i = 0; i < refineArr.length; i++) {
			if (s == refineArr[i][0]) {
				getAirplane(refineArr, refineArr[i][1], e, k, priceList, price + refineArr[i][2]);
			}
		}
	}

	public static void main(String[] args) {
		DFS비행기 T = new DFS비행기();
		System.out.println(T.solution(new int[][] { { 0, 1, 10 }, { 1, 2, 20 }, { 0, 2, 70 }, { 0, 3, 100 },
				{ 1, 3, 80 }, { 2, 3, 10 }, { 2, 4, 30 }, { 3, 4, 10 } }, 0, 3, 1));
		System.out.println(T.solution(new int[][] { { 0, 1, 10 }, { 0, 2, 10 }, { 1, 3, 5 }, { 2, 3, 3 } }, 0, 3, 0));
		System.out.println(T.solution(new int[][] { { 0, 3, 10 }, { 1, 5, 10 }, { 1, 7, 100 }, { 0, 1, 10 },
				{ 0, 2, 10 }, { 5, 7, 30 }, { 3, 7, 10 }, { 1, 3, 5 }, { 2, 3, 3 } }, 1, 7, 2));
	}
}