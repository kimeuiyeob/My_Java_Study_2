package 스트림API;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Stream;

public class StreamPractice2 {

	public static void main(String[] args) {

		Map<Integer, String> hashmap = new HashMap<>();
		hashmap.put(1, "김의엽");
		hashmap.put(2, "양정우");
		hashmap.put(3, "임은준");

		Set<Entry<Integer, String>> entry = hashmap.entrySet();

		Stream<Entry<Integer, String>> stream = entry.stream();
		stream.filter(i -> i.getValue().equals("임은준")).forEach(i -> System.out.println(i.getKey()));

	}

}
