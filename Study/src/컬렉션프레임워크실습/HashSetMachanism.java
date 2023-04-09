package 컬렉션프레임워크실습;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class A {
	int data;

	public A(int data) {
		super();
		this.data = data;
	}

// ================================================
	@Override
	public int hashCode() {
		// data가 같으면 동일한 hashCode를 생성한다.
		// 그러면 값이 같으면 동일한 위치값으로 리턴한다는 뜻이다.
		return Objects.hash(data);
	}

// ================================================
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof A) {
			this.data = ((A) obj).data;
			return true;
		} else {
			return false;
		}
	}
}

// ================================================
public class HashSetMachanism {
	public static void main(String[] args) {
		Set<A> hSet1 = new HashSet<>();
		A a1 = new A(3);
		A a2 = new A(3);
		System.out.println(a1 == a2);
		// equals 와 hashcode 재정의를 하지 않으면 아래 값들이 false가나온다.
		// 그 이유는 new 함으로써 생성된 위치가 다르기 때문에 값을 3으로 비교하면 안된다.
		// 그러나 위에 재정의로 데이터 값으로 비교하게 만들어놔서 이제 true로 나올꺼다.
		System.out.println(a1.equals(a2));
		System.out.println(a1.hashCode() == a2.hashCode());

	}
}
