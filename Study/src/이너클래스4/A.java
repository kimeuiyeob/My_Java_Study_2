package 이너클래스4;

class A {

	public static void main(String[] args) {

		A a = new A();
		a.abc();
	}
	
//	=========================================================

	C b1 = new B();

	void abc() {
		b1.bcd();
		b2.bcd();
	}

//	=========================================================

	C b2 = new C() { //이름이 없는 익명 이너 클래스
		public void bcd() {
			System.out.println("C인터페이스로 객체 생성");
		}
	};

//	=========================================================

	class B implements C {
		@Override
		public void bcd() {
			System.out.println("B클래스가 C인터페이스 bcd() 구현 완료!");

		}

	}
}
