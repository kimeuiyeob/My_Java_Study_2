package 자바API함수적인터페이스실습;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongFunction;

public class FunctionInterface {
	public static void main(String[] args) {
//		Function<T, R> => T타입으로 입력받아서 R타입으로 리턴한다.

		// 익명 이너클래스 표현
		Function<String, Integer> f1 = new Function<>() {
			@Override
			public Integer apply(String t) {
				return t.length();
			}
		};
		System.out.println(f1.apply("안녕하세요"));

		// 람다식 표현
		Function<String, Integer> f2 = t -> t.length();
		System.out.println(f1.apply("안녕하세요반갑습니다."));

		// 확장형 Function
		IntFunction<String> f3 = number -> number + "번 안녕";
		System.out.println(f3.apply(5));
		LongFunction<Double> f4 = number -> number + 0.5;
		System.out.println(f4.apply(5));
		BiFunction<String, Integer, Integer> f5 = (str, number) -> (str.length() + number);
		System.out.println(f5.apply("안녕하세요", 5));

	}

}
