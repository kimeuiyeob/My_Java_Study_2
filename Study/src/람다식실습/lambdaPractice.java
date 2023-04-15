package 람다식실습;

public class lambdaPractice {

	public static void main(String[] args) {
		// 객체 지향 프로그램 문법
		Boy boy = new Boy();
		boy.abc();

		// 익명이너클래스
		Boy boy2 = new Boy() {
			@Override
			public void abc() {
				super.abc();
			}
		};
		boy2.abc();
		
	}
}

interface Girl {
	void abc();
}

class Boy implements Girl {
	@Override
	public void abc() {
		System.out.println("클래스B에서 A인터페이스 구현완료");
	};
}
