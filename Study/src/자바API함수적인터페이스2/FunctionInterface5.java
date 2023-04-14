package 자바API함수적인터페이스2;

import java.util.function.BinaryOperator;

public class FunctionInterface5 {

	public static void main(String[] args) {

		// BinaryOperator는 두개의 같은 타입을 받아서 리턴한다.
		BinaryOperator<String> BO = (str1, str2) -> str1 + str2;
		System.out.println(BO.apply("나는", "해적왕이 될꺼다!!"));

	}
}
