package 컬렉션프레임워크셋;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSet_LinkedSet_TreeSet {

	public static void main(String[] args) {

		// Set에서 가장 중요한 차이들!!!

		Set<String> hashSet = new HashSet<>();
		hashSet.add("다");
		hashSet.add("마");
		hashSet.add("나");
		hashSet.add("가");
		System.out.println(hashSet); // 순서 없이 출력

		Set<String> linkedSet = new LinkedHashSet<>();
		linkedSet.add("다");
		linkedSet.add("마");
		linkedSet.add("나");
		linkedSet.add("가");
		System.out.println(linkedSet); // 값 넣은 순서대로 출력

		Set<String> treeSet = new TreeSet<>();
		treeSet.add("다");
		treeSet.add("마");
		treeSet.add("나");
		treeSet.add("가");
		System.out.println(treeSet); // 값의 오름차순 정렬
		// 이때 내가 원하는대로 정렬하고 싶을때는 comparable interface구현하자!!

	}
}
