package 자바API함수적인터페이스실습;

import java.util.function.BinaryOperator;

public class BinaryOperatorInterface {
	public static void main(String[] args) {

		// BinaryOperator<T> => T타입을 두개 받아서 T타입으로 리턴한다.
		BinaryOperator<String> bo1 = new BinaryOperator<>() {
			@Override
			public String apply(String t, String u) {
				return t + u;
			}
		};
		System.out.println(bo1.apply("만나서 ", "반갑습니다."));

		BinaryOperator<Integer> bo2 = (number1, number2) -> number1 + number2;
		System.out.println("두수의 합은? " + bo2.apply(5, 5));
	}

}
