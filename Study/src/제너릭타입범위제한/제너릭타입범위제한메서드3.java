package 제너릭타입범위제한;

//	접근 지정자  메서드 이름  (제너릭 클래스 명 <제네릭 타입 명>) {
//		...
//	}
//
//	접근 지정자  메서드 이름  (제너릭 클래스 명 <?>) {
//		...
//	}
//
//	접근 지정자  메서드 이름  (제너릭 클래스 명 <? extends 상위클래스>) {
//		...
//	}
//
//	접근 지정자  메서드 이름  (제너릭 클래스 명 <? super 하위클래스>) {
//		...
//	}

public class 제너릭타입범위제한메서드3 {

//	method(gods<A> a) <=A만 가능
//	method(gods<?> a) <=A,B,C,D 가능
//	method(gods<? extends B> a) <=B,C,D 만 가능
//	method(gods<? super B> a) <= B,A만 가능

}


class gods<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

}
