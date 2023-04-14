package 자바API함수적인터페이스실습;

import java.util.function.BiPredicate;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

public class PredicateInterface {

	public static void main(String[] args) {

		// Predicate는 앞에 Consumer과 Supplier과는 다르다.
		// Consumer는 입력매게변수는 받고 리턴이 없었다.
		// Supplier는 입력매게변수가 없고 리턴이 있었다.
		// 그러나 Predicate는 입력매게변수를 받고 그에따란 boolean타입으로 리턴한다.

		// 기본형 Predicate 람다식 표현
		Predicate<String> pre = str -> str.length() > 5 ? true : false;
		boolean answer = pre.test("나는5글자가넘을까?");
		System.out.println("정답 : " + answer);

		// 확장형
		IntPredicate pre1 = number -> number > 5 ? true : false;
		LongPredicate pre2 = number -> number > 5 ? true : false;
		DoublePredicate pre3 = number -> number > 5 ? true : false;
		BiPredicate<Integer, Integer> pre4 = (number1, number2) -> (number1 + number2) > 5 ? true : false;

		System.out.println(pre1.test(10));
		System.out.println(pre2.test(3L));
		System.out.println(pre3.test(6.0));
		System.out.println(pre4.test(2, 2));

	}

}
