package 컬렉션프레임워크실습;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetMethod {
	public static void main(String[] args) {
		Set<String> hset1 = new HashSet<>();
		hset1.add("가");
		hset1.add("나");
		hset1.add("가");
		// 중복 제거
		// 입력 순서와 출력 순서가 다르다.
		System.out.println(hset1);
//		=========================================
		Set<String> hset2 = new HashSet<>();
		List<String> list1 = new ArrayList<>();
		hset2.add("나");
		hset2.add("다");
		list1.add("다");
		list1.add("라");
		// 타입만 같으면 set addall 메서드로 list객체까지 담을수있다.
		hset2.addAll(list1);

		hset2.removeAll(list1);
		System.out.println(hset2);
//		=========================================
		if (hset2.contains("나")) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}
//		=========================================
		// .iterator() iterator객체를 뽑아내는 함수
		// 즉 terator.hasNext() 로 값을 순차적으로 빼내올수있다.
		// .hasNext() 불린타입이여서 값이 있으면 true여서 next로 값을 출력한다.
		Iterator<String> iterator = hset2.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
//		=========================================
		// 리스트를 배열로 바꾸기
		// .toArray()그냥 메서드를 사용하면 타입이 Object타입이여서 Object배열로 받아줘야한다.
		Object toObjectArr = hset2.toArray();
		// String타입으로 만들고 싶으면 이렇게 만든다. [0]은 안에 값이 있는만큼 크기가 생성된다.
		String[] toStringArr = hset2.toArray(new String[0]);
		System.out.println(Arrays.toString(toStringArr));
//		=========================================
		
		
	}
}
