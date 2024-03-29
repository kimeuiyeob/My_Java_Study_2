package 람다식;

interface ABA {
	void abc();
}

class BAB {
	static void bcd() {
		System.out.println("메서드메서드");
	}
}

public class RefOfStaticMethod {
	public static void main(String[] args) {

		// 정적 메서드 참조
		// 1 익명 이너클래스 방법
		ABA a1 = new ABA() {
			@Override
			public void abc() {
				BAB.bcd();
			}
		};
		
		//람다식
		ABA a2 = () -> BAB.bcd();
		
		//정적메서드 참조
		ABA a3 = BAB::bcd; 
		
		a1.abc();
		a2.abc();
		a3.abc();
		

	}
}
