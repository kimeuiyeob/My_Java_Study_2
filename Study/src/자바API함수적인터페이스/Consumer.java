package 자바API함수적인터페이스;

public interface Consumer<T> { // Consumer<T> interface 입력은 있는데 리턴이 없는 기능!!
	public abstract void accept(T t); //accept메소드명이 기본이름이다.
}

