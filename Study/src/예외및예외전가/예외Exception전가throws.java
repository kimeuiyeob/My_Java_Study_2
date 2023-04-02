package 예외및예외전가;

public class 예외Exception전가throws {

	// throws 예외를 전가한다. / 예외를 떠넘기다.
	// 전가를 받은 메소드는 그 예외를 받아야한다.
	// 메소드 이름 다음 throws이름
	// thread.sleep()이라는건 일반 예외처리라 바로 예외처리를 해주어야한다
	// 그 이유는 API문서안에 .sleep()보게 되면 이 함수를 만든곳에서부터 interruptedException을 전가했기때문에
	// 내가 쓸때도 이걸 받아서 내가 처리할지 또 전가할지를 정하는거다.

	public static void main(String[] args) {

		A a = new A();
		a.abc();
		
		B b = new B();
		b.abc();
		
	}
}

class A {
	void abc() {
		bcd();
	}

	void bcd() { //bcd메서드에서 thread예외 잡아서 bcd는 사용가능
		try {
			Thread.sleep(1000);
			System.out.println("bcd메서드에서 예외 처리");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

//=============================================================

class B {
	void abc() { //abc메서드에서 bcd메서드의 예외전가를 여기서 받아서 처리한다.
		
		try {
			bcd();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	void bcd() throws InterruptedException { //bcd메서드에서 예외를 abc메서드로 전가
		Thread.sleep(1000);
		System.out.println("abc메서드에서 예외 처리");
	}
}
