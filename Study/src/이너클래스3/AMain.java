package 이너클래스3;

public class AMain { //정적 멤버 이너 클래스
	
	public static void main(String[] args) {
		
		A a = new A();
		A.B ab = new A.B(); //static클래스 일때 이너클래스 접근 방법
		//static은 객체를 생성하기 전에도 사용할수 있어서 static 안에는 static필드만 있어야된다.
		//즉 static은 항시 메모리에 상주되어 있다고 생각하면 된다.
		
		ab.bcd();
		
	}

}
