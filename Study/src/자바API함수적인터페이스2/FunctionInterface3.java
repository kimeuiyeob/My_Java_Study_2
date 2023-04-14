package 자바API함수적인터페이스2;

import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class FunctionInterface3 {
	public static void main(String[] args) {

		// To가 앞에 붙으면 그전이랑 반대로 생각하면된다.
		// 일반 확장형 Function인터페이스 IntFunction<String>이라면
		// Integer타입으로 입력받으면 출력을 String으로 했다.
		// 하지만 To가 붙으면 입역을 String형으로 받고 출력을 Integer로 한다.
		ToIntFunction<String> f6 = str -> str.length();
		ToLongFunction<Double> f7 = doubleNumber -> doubleNumber.longValue();
		ToDoubleFunction<Integer> f8 = number -> (double) number;

		System.out.println(f6.applyAsInt("안녕하세요"));
		System.out.println(f7.applyAsLong(0.5));
		System.out.println(f8.applyAsDouble(5));
		
	}
}
