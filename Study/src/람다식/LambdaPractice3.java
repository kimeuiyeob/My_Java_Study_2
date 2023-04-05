package 람다식;

public class LambdaPractice3 {

	public static void main(String[] args) {

		AAA a = new AAA() {
			public void abc() {
				BBB b = new BBB();
				b.bcd();
			}
		};

		AAA a1 = () -> {
			BBB b = new BBB();
			b.bcd();
		};

		// 클래스 객체 :: 인스턴스 메서드 이름
		AAA a2 = () -> {
			BBB b = new BBB();
			A a3 = b::bcd;
		};

	}
}

interface AAA {
	void abc();
}

class BBB {
	void bcd() {
		System.out.println("나는 클래스 BBB 메서드야");
	}
}
