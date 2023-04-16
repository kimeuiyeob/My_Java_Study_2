package 스트림API;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StreamPractice {
	public static void main(String[] args) {

		// JAVA8에 추가된 Stream API를 활용하면 다양한 데이터 소스를 표준화된 방법으로 다룰수있다.
		// 따라서, Collection F/W 를 통해 관리하는 데이터를 처리하기 위해 주로 사용한다.
		// Stream API의 활용을 통해 수집된 다양한 데이터를 활용하는데 있어서 간결하고 가독성있는 처리가 가능하다.
		// Stream API의 다양한 기능들은 대부분 람다를 필요로 하기 때문에 람다를 이해하고 사용할수 있어야한다.

		List<String>  names = Arrays.asList("김의엽", "임은준", "양정우");

		Iterator iter = names.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();

		// stream 활용!
		names.stream().forEach(i -> System.out.print(i + " "));

	}

}
