package 제네릭실습1;

//Apple 클래스와 Apple클래스를 담을수 있는 클래스
class Apple {
}

//Pencil 클래스와 Pencil클래스를 담을수 있는 클래스
class Pencil {
}

class Goods1<T> {
	private Object goods1 = new Object();

	public Object getGoods1() {
		return goods1;
	}

	public void setGoods1(Object goods1) {
		this.goods1 = goods1;
	}

}

public class ProblemsBeforeGeneric {
	public static void main(String[] args) {

		Goods1 object = new Goods1();

		object.setGoods1(new Apple());
		// Object 최상위 객체로 저장해서 꺼내올때 Object로 받던가
		Object apple1 = object.getGoods1();
		// 아니면 (Apple)객체로 다운캐스팅해서 Apple로 받던가 해야한다.
		Apple apple2 = (Apple) object.getGoods1();
		System.out.println("Apple 객체 : " + apple1);
		System.out.println("Apple 객체 : " + apple2);

		object.setGoods1(new Pencil());
		Object pencil1 = object.getGoods1();
		Pencil pencil2 = (Pencil) object.getGoods1();
		System.out.println("Pencil 객체 : " + pencil1);
		System.out.println("Pencil 객체 : " + pencil2);

//		===========================================

		// 잘못된 캐스팅 (약한 타입 체크)
		Goods1 object2 = new Goods1();
		// Object 즉 최상위 객체에 Apple객체를 생성해서 담았다.
		object2.setGoods1(new Apple());
		// 그리고 꺼낼때 다운캐스팅을하는데 Pencil로 해도 담을수가있다.
		// 결국은 사과를 집어넣어서 연필로 꺼내게 된것이다.
		Pencil pencil3 = (Pencil) object2.getGoods1();
		// 실행예외가 발생한다.
		System.out.println(pencil3);

	}
}
