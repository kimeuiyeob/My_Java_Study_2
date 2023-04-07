package 람다식;

interface Z {
	void abc(X x, int k);
}

class X {
	void bcd(int k) {
		System.out.println(k);
	}
}

public class RefOfStaticMethod_Type2_1 {

	public static void main(String[] args) {
		
		//인스턴스 메서드 참조 Type2
		
		//익명이너 클래스
		Z z = new Z() {
			@Override
			//객체가 만들어져서 넘어온 경우
			//이러면 객체를 따로 안만들어줘도 된다.
			//객체를 만들어서 파라미터로 보냈기때문이다.
			public void abc(X x, int k) {
				//그대로 x로 bcd()메서드 호출
				x.bcd(k);
			}
		};
		
//		============================
		//람다식
		Z z1 = (x,k) -> x.bcd(k);
		
		
//		============================
		//인스턴스 메서드 참조 Type2;
		Z z2 = X::bcd;
		
		
		
		
	}
}
