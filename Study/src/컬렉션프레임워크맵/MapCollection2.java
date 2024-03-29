package 컬렉션프레임워크맵;

import java.util.HashMap;
import java.util.Map;

public class MapCollection2 {

	public static void main(String[] args) {

		Map<Integer, String> map1 = new HashMap<>();
		map1.put(2, "나다라");
		map1.put(4, "라마바");
		map1.put(1, "가나다");
		map1.put(3, "다라마");
		map1.put(5, "바사아");

		// 키가 4를 "니가가라"로 대체한다.
		map1.replace(4, "니가가라");
		// 키가 5고 밸류가 바사아 일치하면 밸류값을 하와이로 바꾼다.
		// 아래는 밸류값이 일치하지 않아 동작하지 않는다.
		map1.replace(5, "바사아", "하와이");
		map1.replace(5, "가사아", "두바이");
		System.out.println(map1);
		
		System.out.println(map1.get(4));
		 //contains는 true,false로 리턴한다.
		System.out.println(map1.containsKey(5)); 
		System.out.println(map1.containsValue("하와이"));
	}

}
