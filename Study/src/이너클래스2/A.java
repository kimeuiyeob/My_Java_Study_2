package 이너클래스2;

public class A {

	int a = 3, b = 4;

	void abc() {
		System.out.println("나는 A클래스야");
	}

	class B {
		
		int a = 5, b = 6;

		void abc() {
			System.out.println("나는 B클래스야");
		}

		void bcd() {
			System.out.println(a);
			System.out.println(b);
			this.abc();
			System.out.println(A.this.a);
			System.out.println(A.this.b);
			A.this.abc();
		}
		
	}

}
