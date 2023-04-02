package 이너인터페이스;

class A {
	public static void main(String[] args) {
		
		A.B a = new A.B() { //외부 클래스 A에서 이너인터페이스 B 접근해서 참조변수 a로 객체 생성
			@Override
			public void bcd() {
				System.out.println("익명 클래스 A인터페이스 구현 완료");
			}
		};
		a.bcd();

		C c = new C();
		c.bcd();
	}
	
	static interface B { //이너 인터페이스
		void bcd();
	}
	
}
//===================================================================

class C implements A.B {  //클래스 C가 A클래스 내부에 있는 B인터페이스를 상속받는다
	@Override
	public void bcd() {
		System.out.println("A인터페이스 메서드 구현 완료");
	}
}
