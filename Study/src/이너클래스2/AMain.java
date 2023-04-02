package 이너클래스2;

public class AMain {
	public static void main(String[] args) { //인스턴스 멤버 클래스
		
		A a = new A();
		a.abc();
		
		A.B ab = a.new B();
		ab.abc();
		ab.bcd();
	}

}
