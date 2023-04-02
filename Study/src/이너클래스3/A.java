package 이너클래스3;

class A {
	
	int a = 5;
	static int b = 7;
	
	static class B {
		
		void bcd() {
//			System.out.println(a); A클래스 a변수가 static이 아니기 때문에 static클래스B 안에서 a변수가 사용되지 못한다.
			System.out.println(b);
			System.out.println("정적 멤버 이너 클래스 (static)");
		}
	}

}
