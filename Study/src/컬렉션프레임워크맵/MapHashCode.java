package 컬렉션프레임워크맵;

import java.util.HashMap;
import java.util.Map;

public class MapHashCode {
	public static void main(String[] args) {

		// *Map*에서는 hashcode의 개념은 아주 중요하다!!!
		// hashCode의 개념 + 등가연산(==)과 equals메서드의 차이점
		// hashCode() equals() -> Object클래스의 메서드 -> 모든 클래스 내에 포함되어있다.

		Map<A, String> hashMap1 = new HashMap<>();

		A a1 = new A(3);
		A a2 = new A(3);

		System.out.println(a1 == a2); // false
		System.out.println(a1.equals(a2)); // false

		hashMap1.put(a1, "첫번째");
		hashMap1.put(a2, "두번째");

		// 아래 hashcode값도 다르다. 그이유는 a1과 a2의 값은
		// 같지만 stack메모리 영역에 서로다른곳에 위치해있기때문이다.
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());

		// 하지만 아래 오버라이드 hashCode()를 사용하면 내용물이 같으면 같다고만들수있다.
		// 하지만 아래 오버라이드 equals()를 사용하면 내용물이 같으면 같다고만들수있다.

	}

}

class A {
	int data;

	public A(int data) {
		super();
		this.data = data;
	}

//	================================

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + data;
//		return result;
//	}

//	================================

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		A other = (A) obj;
//		if (data != other.data)
//			return false;
//		return true;
//	}

}
