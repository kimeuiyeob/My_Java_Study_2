package 제네릭클래스_인터페이스의문법;

public class 제네릭클래스3 {
	public static void main(String[] args) {

		// 즉 제네릭의 기본 개념은 클래스 내에 사용되는 타입을 클래스의 정의때가 아닌 생성때 정의하겠다는 의미이다.
		Goods<Apple> goods1 = new Goods<>();
		goods1.set(new Apple());
		Apple apple = goods1.get();

		Goods<Pencil> goods2 = new Goods<>();
		goods2.set(new Pencil());
		Pencil pencil = goods2.get();

		Goods<Pencil> goods3 = new Goods<>();
		goods3.set(new Pencil());
//		Apple pencil2 = goods3.get(); //<==Pencil타입으로 지정했는데 타입을 Apple로 받으려고 하니까 오류가 발생된다.

	}

}

class Apple {
	;
}

class Pencil {
	;
}

class Goods<T> {
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}

}
