package 제너릭타입범위제한;

public class 제너릭타입범위제한메서드2 {

	public static void main(String[] args) {

		ABC abc = new ABC();
		abc.method1("안녕");

		BCD bcd = new BCD();
		bcd.method1(new Myinterface() { // 여기서 익명클래스로 interface의 print()메서드를 구현하였다.
			@Override
			public void print() {
				System.out.println("print() 구현완료");
			}
		});

	}
}

class ABC {
	public <T extends String> void method1(T t) {
		System.out.println(t.charAt(0));
	}
}

interface Myinterface {
	public abstract void print();
}

class BCD {
	// 인터페이스를 제너릭 안에서 interface를 상속받을때는 implements가 아니라 extends를 사용한다.
	// 그리고 실제 제너릭 안에는 상속받는 개념이 아니라 범위제한개념이 맞다.
	public <T extends Myinterface> void method1(T t) {
		t.print();
	}
}