package 제너릭타입범위제한;

public class 제너릭타입범위제한클래스 {

	public static void main(String[] args) {

		// 아래 두객체는 같은 의미이다. 그이유는 D클래스 제너릭이<T extends B>로 되어있기때문이다.
		// 즉 B클래스이거나 그자식타입까지 다 들어올수있다는 의미이다.
		// D d = new D();
		// D<B> d = new D<>();

		// D<A> d1 = new D<>(); <=불가능하다 그이유는 클래스 D를 선언할때 제너릭을 extendsB까지 했기때문에
		// 제너릭타입으로 들어올수있는건 B클래스이거나 그 하위 자식 클래스 타입들만 들어올수있다.

		D<B> d2 = new D<>();
		D<C> d3 = new D<>();
		D d4 = new D(); // <==이건 D<B> d2 = new D<>();와 동일하다.

		d2.setT(new B());
		d2.setT(new C());
//		d3.setT(new B()); <==이건 불가능 위에 d3제너릭 타입을 C까지 해서 B를 생성할수 없다.
		d3.setT(new C());

		d4.setT(new B());
		d4.setT(new C());
//		d4.setT(new A()); <==이건 불가능 d4제너릭타입은 B까지 이며 그 상위클래스인 A타입을 받을수 없다.

	}
}

class A {
}

class B extends A {
}

class C extends B {
}

class D<T extends B> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}
