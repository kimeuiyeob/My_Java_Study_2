package 자바API함수적인터페이스2;

import java.util.function.Function;

public class FunctionInterface {

	public static void main(String[] args) {

//		익명 이너클래스
//		Function<String, Integer> f;
//		f = new Function<>() {
//			@Override
//			public Integer apply(String t) {
//				return t.length();
//			}
//		};
//		System.out.println(f.apply("안녕"));

//		람다식 표현
		Function<String, Integer> f;
		f = (t) -> t.length();

		System.out.println(f.apply("안녕하세요"));

	}
}
//Function인터페이스는 T타입으로 받아서 리턴을 R타입으로 한다고 생각하면 된다.
//즉 위에 Function인터페이스를 구현할때 <String,Integer>로 구현해서 f에 담아주었다.
//이때 메서드 구현을 보면 리턴타입을 Integer로 해서 리턴한것을 볼수있다.
//interface Function<T, R> {
//	public abstract R apply(T t);
//}
