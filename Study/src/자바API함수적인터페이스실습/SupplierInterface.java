package 자바API함수적인터페이스실습;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class SupplierInterface {
	public static void main(String[] args) {

		// Consumer인터페이스와는 다르게 입력매게변수는 없지만 리턴만 있는게
		// Supplier인터페이스이다.
		// 두개념이 반대라고 생각하면 된다.-> Consumer은 매게변수O 리턴X
		// -> Supplier는 매게변수X 리턴O
		// 익명이너클래스 표현
		Supplier s = new Supplier() {
			@Override
			public Object get() {
				return "방가방가";
			}
		};
		System.out.println(s.get());

		// 기본형
		// 람다식 표현
		Supplier s1 = () -> "방가방가2";
		// Supplier의 제네릭을 지정안해주면 object로 생성된다고 생각하면된다.
		// 그래서 아래 변수타입을 Object로 받은거고 만약에 String으로 받고싶으면
		// 제네릭을 String으로 지정해줘야한다.
		Object getWithObject = s1.get();
		System.out.println(getWithObject);

		// 확장형
		BooleanSupplier s2 = () -> true;
		IntSupplier s3 = () -> 5;
		LongSupplier s4 = () -> 5L;
		DoubleSupplier s5 = () -> 0.5;

		System.out.println(s2.getAsBoolean());
		System.out.println(s3.getAsInt());
		System.out.println(s4.getAsLong());
		System.out.println(s5.getAsDouble());

	}
}
