package 컬렉션프레임워크맵;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {

	public static void main(String[] args) {

		Map<Integer, String> map1 = new HashMap<>();
		map1.put(2, "나다라");
		map1.put(4, "라마바");
		map1.put(1, "가나다");
		map1.put(3, "다라마");
		map1.put(5, "바사아");
		// 입력 순서랑 출력순서는 동일하지 않다.
		System.out.println(map1);

		//순서없이 출력된다고하는데..키가 정수라면 정렬이 되는것같다.
		Map<Integer, String> map3 = new HashMap<>();
		map3.put(7, "안녕");
		map3.put(6, "안녕");
		map3.putAll(map1);
		System.out.println(map3);

		Map<String, String> map2 = new HashMap<>();
		map2.put("나", "나다라");
		map2.put("라", "라마바");
		map2.put("가", "가나다");
		map2.put("다", "다라마");
		map2.put("바", "바사아");
		// 입력 순서랑 출력순서는 동일하지 않다.
		// 그리고 키값이 정렬이된다.
		System.out.println(map2);

	}

}
