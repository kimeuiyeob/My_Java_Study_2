package 컬렉션프레임워크셋;

import java.util.HashSet;
import java.util.Set;

class H {
	;
}

class A {
	int data;

	public A(int data) {
		super();
		this.data = data;
	}
}

class B {
	int data;

	public B(int data) {
		super();
		this.data = data;
	}

	//이러면 파라미터로 들어온 object즉 데이터 값이랑
	//클래스B에 있는 데이터 값이랑 비교하는거라서
	//주소 비교가 아닌 값비교라고 생각하면 된다.
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		B other = (B) obj;
		if (data != other.data)
			return false;
		return true;
	}
}

public class SetHashSet2 {

	public static void main(String[] args) {
		H h = new H();
		System.out.println(h);
//		컬렉션프레임워크셋.H@39ed3c8d
//		맨앞에는 해당 패키지명 / 클래스이름 / @뒤에 값은 해쉬코드
//		해쉬코드 = 위치를 기반으로 생성된 고유값 / 주소값
//		 => 결론적으로 위치가 다르면 해쉬코드도 달라진다고 생각하자

		A a1 = new A(3);
		A a2 = new A(3);

		System.out.println(a1 == a2); // false 주소값을 비교해서이다.
		System.out.println(a1.equals(a2)); // false
		// 해쉬코드는 주소값같은 개념이다.
		System.out.println(a1.hashCode() + " , " + a2.hashCode());

//		============================================================

		B b1 = new B(3);
		B b2 = new B(3);
		
		System.out.println(b1 == b2); // false 주소값을 비교해서이다.
		System.out.println(b1.equals(b2)); //equals 오버라이드해서 true결과
		// 해쉬코드는 주소값같은 개념이다.
		System.out.println(b1.hashCode() + " , " + b2.hashCode());
		
		Set<B> setB = new HashSet<>();
		setB.add(b1);
		setB.add(b2);
		
		//이러면 값이 둘다 3이더라도 결국 주소값으로 중복을 잡아내기때문에
		//갯수는 두개가 나온다. 
		System.out.println(setB.size());
		
	}

}
