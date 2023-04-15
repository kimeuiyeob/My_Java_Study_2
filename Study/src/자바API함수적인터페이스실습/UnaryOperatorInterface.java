package 자바API함수적인터페이스실습;

import java.util.function.UnaryOperator;

public class UnaryOperatorInterface {

	public static void main(String[] args) {

		// UnaryOperator<T> => T타입을 받아서 T타입으로 리턴한다.
		UnaryOperator<String> uo1 = new UnaryOperator<>() {
			@Override
			public String apply(String t) {
				return t + "UnaryOperator는 T타입을 받아 T타입을 리턴하는 친구!";
			}
		};
		System.out.println(uo1.apply("이건 "));
		// 람다식 표현
		UnaryOperator<String> uo2 = str -> str + "UnaryOperator는 T타입을 받아 T타입을 리턴하는 친구!";
		System.out.println(uo2.apply("요건 "));
	}
}
