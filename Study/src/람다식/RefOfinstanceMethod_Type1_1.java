package 람다식;

interface ABC {
	void abc();
}

class BCD {
	void bcd() {
		System.out.println("클래스 B 메서드");
	}
}

public class RefOfinstanceMethod_Type1_1 {
	public static void main(String[] args) {
		
		//#1. 인스턴스 메서드 참조 익명이너클래스
		ABC abc1 = new ABC() {
			@Override
			public void abc() {
				BCD bcd1 = new BCD();
				bcd1.bcd();
			}
		};
		
//		====================
		
		//#2. 람다식
		ABC abc2 = () -> {
			BCD bcd2 = new BCD();
			bcd2.bcd();
		};
		
//		====================
		
		//#3. 인스턴스 참조
		//BCD 클래스를 생성한다
		BCD bcd3 = new BCD();
		//인터페이스를 바로 bcd3객체 안에있는 bcd메서드를 구현한다.
		ABC abc3 = bcd3::bcd;
		
//		====================
		
		abc1.abc();
		abc2.abc();
		abc3.abc();
		

	}
}
