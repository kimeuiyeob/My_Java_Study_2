package 제네릭실습2;

class Coffee {
	;
}

class Latte {
	;
}

class Cafe<T> {
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}

}

public class PracticeGenericClass {
	public static void main(String[] args) {
		Cafe<Coffee> cafeCoffee = new Cafe<>();
		cafeCoffee.set(new Coffee());
		Coffee coffee = cafeCoffee.get();

		Cafe<Latte> cafeLatte = new Cafe<>();
		cafeLatte.set(new Latte());
		Latte latte = cafeLatte.get();

	}

}
