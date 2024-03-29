package 컬렉션프레임워크맵;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTablePractice {

	public static void main(String[] args) {

		// HashTable<K,V>
		// -HashMap이 단일 쓰레드에 적합하다면 HashTable은 멀티쓰레드에 적합하다.
		// 즉 모든 메서드가 동기화가 되있다는 뜻이다.
		// 전에 ArrayList와 vector가 있는데 vector도 ArrayList와 동일하는데 vector는 모든 메서드가 동기화가 되있어서
		// 쓰레드에 적합한것을 알수있다. HashTable도 이와 똑같은 개념인데 구조가 map이다.

		// ***동기화 되지 않는 HashMap<K,V> / HashSet<K,V>도 아래와 같이 동기화 wrapping을 통해 멀티쓰레드에 적합하게
		// 만들수있다***
		// Map<K,V> m= Collections.synchronizedMap(new HashMap<K,V>(...));
		// Set<E> m = Collections.synchronizedSet(new HashSet<E>(...));
		// 컬렉션 안에 내장되어있는 동기화 셋이라는 메서드로 동기화 시킬수있다.

		Map<Integer, String> HT = new Hashtable<>();

		HT.put(1, "가나다");
		HT.put(2, "나다라");
		HT.put(3, "다라마");
		System.out.println(HT);

		HT.replace(1, "안녕하세요");
		System.out.println(HT);
		HT.replace(2, "나다라", "김의엽");
		HT.replace(3, "나다라", "반가워");
		System.out.println(HT);

		boolean checkContainsKey = HT.containsKey(5);
		boolean checkContainsValue = HT.containsValue("김의엽");
		System.out.println(checkContainsKey);
		System.out.println(checkContainsValue);

		System.out.println(HT.get(1));
		System.out.println(HT.get(2));
		System.out.println(HT.get(3));

		Set<Integer> printKey = HT.keySet();
		System.out.println(printKey);

		Collection<String> printVal = HT.values();
		System.out.println(printVal);

		HT.remove(1);
		HT.remove(2, "김의엽");
		System.out.println(HT);

		HT.clear();
		System.out.println(HT);

	}
}
