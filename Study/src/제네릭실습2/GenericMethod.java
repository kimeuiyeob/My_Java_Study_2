package 제네릭실습2;

class GenericMethods {

	// 리턴 T타입 입력매게변수 T 타입
	public <T> T method1(T t) {
		// 받은거 그대로 리턴하는 제네릭 메서드
		return t;
	}

	public <T> boolean method2(T t1, T t2) {
		// 받아온 입력매게변수가 값이 같으면 true리턴,아니면 fales리턴
		return t1.equals(t2);
	}

	public <K, V> void method3(K k, V v) {
		System.out.println("나는 제네릭 <K,V> : " + k + " " + v);
	}
}

public class GenericMethod {
	public static void main(String[] args) {
		// 제네릭 메서드는 즉 메서드를 호출할때 타입이 지정되는거다.
		GenericMethods g = new GenericMethods();
		// g객체를 생성해서 method1을 호출할때 제네릭을 스트링타입으로 준다
		String hello1 = g.<String>method1("안녕");
		// 근데 어차피 매게변수에 정수형이오면 제네릭이 int고 문자열이 들어오면 제네릭이
		// String이기 때문에 <>생략가능하다.
		String hello2 = g.method1("안녕");
		int number = g.method1(5);

		boolean trueOrfalse = g.method2("안녕", "안녕");
		System.out.println(trueOrfalse);
		g.method3("하이", 3);

	}
}
