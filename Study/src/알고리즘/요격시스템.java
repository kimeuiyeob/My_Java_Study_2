package 알고리즘;

import java.util.Arrays;

//끝나는 시간을 기준으로 오름차순을 하고, 반복을 하면서 시점과 종점을 비교
public class 요격시스템 {
	public int solution(int[][] targets) {
		int answer = 0;

		System.out.println("정렬 전 : " + Arrays.deepToString(targets));

		Arrays.sort(targets, (o1, o2) -> {
			// 배열의 두 번째 값으로 정렬하기 위한 비교 로직
			// (리턴 0 : x == y) (리턴 -1 : x < y) (리턴 1 : x > y)
			int compareVal = Integer.compare(o1[1], o2[1]);

			// 만약 두 번째 값이 같으면 첫 번째 값을 비교하여 정렬
			if (compareVal == 0) {
				return Integer.compare(o1[0], o2[0]);
			}

			// 두 번째 값이 다르면 두 번째 값을 기준으로 정렬
			return compareVal;
		});

		System.out.println("정렬 후 : " + Arrays.deepToString(targets));

		int end = targets[0][1];
		System.out.println("end : " + end);
		answer++; // 첫 번째로 만들어지는 요격 시스템

		for (int[] target : targets) {
			if (target[0] >= end) {
				end = target[1];
				answer++; // 시점이 요격 시스템의 상한보다 오른쪽에 있기 때문에 새로운 요격 시스템 추가
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		요격시스템 s = new 요격시스템();
		System.out.println(
				s.solution(new int[][] { { 5, 6 }, { 4, 8 }, { 10, 14 }, { 11, 13 }, { 5, 12 }, { 3, 7 }, { 1, 4 } }));
	}

}
