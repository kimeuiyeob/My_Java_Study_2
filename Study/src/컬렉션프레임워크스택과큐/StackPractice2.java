package 컬렉션프레임워크스택과큐;

public class StackPractice2 {

	public static void main(String[] args) {
		A a = new A();
		a.abc();
		// 스택메모리 상황 설명
//		 abc메서드를 우선 호출하면 a=3,b=6값이 저장이되고
//		 다음 bcd메서드를 호출하니까 b=6다음칸에 메서드 == 칸막이 느낌
//		 치고 a=9,b=8 이저장된다.
//		 그리고 bcd메서드가 끝나면 b=8,a=9가 날라가고 그다음
//		 b=6,a=3이 날라가는 형식이다.
	}
}

class A {
	public static void abc() {
		int a = 3;
		int b = 5;
		bcd();
	}

	public static void bcd() {
		int a = 9;
		int b = 8;
	}

}
