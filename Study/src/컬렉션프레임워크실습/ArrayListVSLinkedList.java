package 컬렉션프레임워크실습;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVSLinkedList {
	public static void main(String[] args) {

		List<Integer> arraylist = new ArrayList<>();
		List<Integer> linkedlist = new LinkedList<>();
		// => 즉 데이터를 추가하거나 삭제할때는 LinkedList가 압도적으로 빠르다.
		// 그러나 데이터를 검색할때는 인덱스로 바로 찾아오는 ArrayList가 빠르다.

		long startTime = 0, endTime = 0;

		// 1 ArrayList LinkedList데이터 추가 시간 비교

		// 이렇게 ArrayList와 LinkedList의 가장 큰 차이는 데이터를 추가할때 훨씬더 빠르게 담을수있다.
		// 이유는 ArrayList는 0번째에 값을 담게되면 그전에 있었던 값들의 인덱스가 한칸씩 다 밀려서 더 느리게 담긴다.
		// 하지만 LinkedList는 앞뒤 값만보고 값을 추가하는거라서 훨씬 빠르게 담기는거다.
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			arraylist.add(0, i);
		}
		endTime = System.nanoTime();
		System.out.println("1.ArrayList 데이터 추가 시간 : " + (endTime - startTime));

		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			linkedlist.add(0, i);
		}
		endTime = System.nanoTime();
		System.out.println("1.LinkedList 데이터 추가 시간 : " + (endTime - startTime));

		// ==================================================
		// 2 ArrayList LinkedList데이터 검색 시간 비교

		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			arraylist.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("2.ArrayList 데이터 검색 시간 : " + (endTime - startTime));

		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			linkedlist.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("2.LinkedList 데이터 검색 시간 : " + (endTime - startTime));
	}
}
