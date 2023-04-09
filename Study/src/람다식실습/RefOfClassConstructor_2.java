package 람다식실습;

interface T {
	// B는 리턴타입이므로 B라는 객체가 리턴된다.
	S abc();
}

class S {
	S() {
		System.out.println("첫번째 생성자");
	}

	S(int k) {
		System.out.println("두번째 생성자");
	}
}

public class RefOfClassConstructor_2 {
	public static void main(String[] args) {
		// 클래스 생성자 참조
		// 익명 이너 클래스
		T m = new T() {
			@Override
			public S abc() {
				return new S();
			}
		};
		// 람다식
		T m1 = () -> new S();

		// 클래스 생성자 참조
		T m2 = S::new;

		m.abc();
		m1.abc();
		m2.abc();

	}
}
