package 스트림API;

import java.util.stream.Stream;

public class StreamBuilderPractice {

	public static void main(String[] args) {

		// Collection과 Stream.Builder의 가장 큰 차이
		// 보통 Collection 객체를 통해 stream 객체를 생성하게 되면
		// 이미 가지고 있는 데이터를 가지고 처리하는 경우가 대부분이지만
		// Stream.Builder는 데이터가 존재하지 않고 stream객체를 생성해서
		// 그 스트림에 데이터를 추가해서 사용하는 방법이다.

		// 즉 Stream.Builder는 스트림 자체적으로 데이터를 생성하고 처리할수 있다.
		// Stream.Builder인터페이스는 Cosumer인터페이스를 상속하고 있으며
		// 데이터를 추가하는 accept(),add()메소드와 데이터의 추가 작업을 완료하고
		// stream을 반환하는 build()메소드를 정의하고 있다.
		
		Stream.Builder<String> streamBuilder = Stream.builder();
		streamBuilder.accept("kim");
		streamBuilder.accept("lee");
		streamBuilder.accept("song");
		streamBuilder.accept("park");
		// accept / add는 둘다 추가하는 기능인데 반환타입만 다르다고 생각하면된다.
		streamBuilder.add("hello");
		streamBuilder.add("hi");

		Stream<String> stream = streamBuilder.build();
		stream.forEach(i -> System.out.println("이름 : " + i));

	}
}
