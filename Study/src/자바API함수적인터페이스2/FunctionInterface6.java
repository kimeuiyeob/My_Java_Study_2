package 자바API함수적인터페이스2;

import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.LongUnaryOperator;

public class FunctionInterface6 {
	public static void main(String[] args) {

		// UnaryOperator 같은타입을 받아서 같은 타입으로 리턴
		IntUnaryOperator iuo = number -> number + 5;
		LongUnaryOperator luo = number -> number + 20L;
		DoubleUnaryOperator duo = number -> number + 10.0;

		System.out.println(iuo.applyAsInt(5));
		System.out.println(luo.applyAsLong(10L));
		System.out.println(duo.applyAsDouble(5.0));

		// BinaryOperator 같은 타입 2개 받아서 같은 타입으로 리턴
		IntBinaryOperator bio = (number1, number2) -> number1 + number2;
		LongBinaryOperator lio = (number1, number2) -> number1 + number2;
		DoubleBinaryOperator dio = (number1, number2) -> number1 + number2;

		System.out.println(bio.applyAsInt(5, 5));
		System.out.println(lio.applyAsLong(5, 5));
		System.out.println(dio.applyAsDouble(5, 5));
	}
}
