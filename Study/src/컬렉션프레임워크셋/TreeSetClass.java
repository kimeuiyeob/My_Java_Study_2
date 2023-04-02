package 컬렉션프레임워크셋;

import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {

		// TreeSet<E>
		// Set 인터페이스를 구현한 구현 클래스
		// 수집한 원소를 집합의 형태로 관리하며 저장공간을 동적관리
		// 입력순서와 관계없이 크기순으로 출력 (저장원소는 대소 비교가 가능해야한다) -> 이래야 크기순으로 정렬하기때문
		// 데이터는 오름차순으로 정렬된다.

		TreeSet<Integer> treeSet = new TreeSet<>();

		int[] intArry = { -5, -3, -9, 6, 4, -2, 6, 1, 0, 3 };
		// treeSet에 담으면 무조건 오름차순으로 정렬되서 출력된다.
		for (int i = 0; i < intArry.length; i++) {
			treeSet.add(intArry[i]);
		}
		System.out.println(treeSet);

	}
}
