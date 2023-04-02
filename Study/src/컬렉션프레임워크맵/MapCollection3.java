package 컬렉션프레임워크맵;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapCollection3 {
	public static void main(String[] args) {

		Map<Integer, String> map1 = new HashMap<>();
		map1.put(2, "나다라");
		map1.put(4, "라마바");
		map1.put(1, "가나다");
		map1.put(3, "다라마");
		map1.put(5, "바사아");

		// map을 출력하게 되면 키와 밸류값이 출력된다.
		System.out.println(map1);

		// Map.entry를 사용하여 -> entry가 키와 밸류를 관리한다.
		// map1.entrySet()을 사용하게 되면 키와 밸류값이 담긴다.
		// 그럼 키와 밸류값이 출력된다. 결국 그냥 출력하는 위랑 동일하다.
		Set<Map.Entry<Integer, String>> entrySet = map1.entrySet();
		System.out.println(entrySet);

		// 키만 뽑아오고싶을때는 keySet을 사용한다.
		Set<Integer> setKey = map1.keySet();
		System.out.println(setKey);

		// 밸류값만 뽑아오고싶을때는 values를 사용한다.
		Collection<String> setVal = map1.values();
		System.out.println(setVal);
	}

}
