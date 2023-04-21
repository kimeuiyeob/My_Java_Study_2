package ½ºÆ®¸²API;

import java.util.stream.Stream;

public class StreamBuilderPractice2 {

	public static void main(String[] args) {

		Stream.Builder<String> builder = Stream.builder();
		String[] names = new String[] { "kim", "lee", "song" };

		for (String string : names) {
			builder.accept(string);
		}

		Stream<String> stream = builder.build();
		stream.forEach(i -> System.out.println(i));
//		System.out.println(stream.count());

	}

}
