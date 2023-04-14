package 자바API함수적인터페이스2;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongFunction;

public class FunctionInterface2 {
	public static void main(String[] args) {

		// 확장형 Function<T,R> 함수적 인터페이스
		// 입력타입 : T , 출력타입 : R

//		IntFunction<R>		=>	입력타입(int)		=>	출력타입(R)
//		LongFunction<R>		=>	입력타입(long)		=>	출력타입(R) 
//		DoubleFunction<R>	=>	입력타입(double)	=>	출력타입(R) 
//		BiFunction<R>		=>	입력타입(T,U)		=>	출력타입(R) 
		// BiFunction<R>은 입력타입이 2개이다.

		IntFunction<Double> f2 = (num) -> (double) num;
//								입력은Int		출력은double

		LongFunction<String> f3 = (num) -> String.valueOf(num);
//								입력은Long	출력은String

		BiFunction<String, Integer, String> f4 = (name, age) -> "이름: " + name + ", 나이: " + age;
//					                 입력은String,Integer		출력은String
		
		Function<String,Integer> f5 = (str) -> str.length();
			//입력은 String, 출력은 Integer

		System.out.println(f2.apply(5));
		System.out.println(f3.apply(5)); // 문자열 5로 출력된는거다.
		System.out.println(f4.apply("김의엽", 30));
		System.out.println(f5.apply("방가방가안녕~"));

	}

}
