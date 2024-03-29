package 람다식;

interface ABCD {
	void abc(int k);
}

public class RefOfinstanceMethod_Type1_2 {
	public static void main(String[] args) {

		// 익명이너클래스
		ABCD abcd1 = new ABCD() {
			@Override
			public void abc(int k) {
				System.out.println(k);
			}
		};
		abcd1.abc(2);

		// 람다식
		ABCD abcd2 = a -> System.out.println(a);
		abcd2.abc(4);

		// 인스턴스 메서드 참조
		ABCD abcd3 = System.out::println;
		abcd3.abc(5);

	}
}
