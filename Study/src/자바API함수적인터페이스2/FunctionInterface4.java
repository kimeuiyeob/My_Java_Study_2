package 자바API함수적인터페이스2;

import java.util.function.UnaryOperator;

public class FunctionInterface4 {
	public static void main(String[] args) {

		// UnaryOperator<T>, BinaryOperatior<T> 함수적 인터페이스
		// UnaryOperator<T> => 입력타입 T 출력타입 T

		// 익명이너클래스
		UnaryOperator<String> UO2 = new UnaryOperator<>() {
			@Override
			public String apply(String t) {
				return t + " 나는 킹왕짱이야";
			}
		};
		System.out.println(UO2.apply("방가방가"));

		// 람다식 표현
		UnaryOperator<String> UO = str -> str + " 나는 의엽이야";
		System.out.println(UO.apply("안녕"));

	}

}
//UnaryOperator<T> 인터페이스는 T타입을 받아서 T타입으로 리턴한다.
//interface UnaryOperator<T> {
//	public abstract T apply (T t);
//}
