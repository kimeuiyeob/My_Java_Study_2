package 제네릭실습2;

class A {
	public <T> void method(T t) {
		// Object 메서드만 호출 가능
//		System.out.println(t.length()); <==불가능 T가 String타입이 아니기때문에
		System.out.println(t.equals(3));
	}
}

public class AvailableMethodInGenericMethod {
	public static void main(String[] args) {

		A a = new A();
		a.method("안녕");
		a.method(3);

	}
}
