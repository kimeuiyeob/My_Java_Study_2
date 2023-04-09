package 람다식실습;

interface M {
	// B는 리턴타입이므로 B라는 객체가 리턴된다.
	B abc();
}

class B {
	B() {
		System.out.println("첫번째 생성자");
	}

	B(int k) {
		System.out.println("두번째 생성자");
	}
}

public class RefOfClassConstructor_1 {
	public static void main(String[] args) {
		// 클래스 생성자 참조
		// 익명 이너 클래스
		M m = new M() {
			@Override
			public B abc() {
				return new B();
			}
		};
		// 람다식
		M m1 = () -> new B();

		// 클래스 생성자 참조
		M m2 = B::new;

		m.abc();
		m1.abc();
		m2.abc();

	}
}
