package 제네릭실습1;

class Opple {
}

//Pencil 클래스와 Pencil클래스를 담을수 있는 클래스
class Oencil {
}

class Gds<T> {
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}

}

public class Solution_Generic {
	public static void main(String[] args) {

		Gds<Opple> gds1 = new Gds<>();
		gds1.set(new Opple());
		Opple opple = gds1.get();
		System.out.println("1번째 : " + opple);

		try {
			// 만약에 제네릭 타입을 지정안하면 자동적으로 컴파일러가
			// Object타입으로 생성한다.
			// 그래서 아래와 같이 약한 타입 체크를 해서 문법에러를 발생시키지 않는다.
			Gds gds2 = new Gds<>();
			gds2.set(new Oencil());
			// 여기서 실행 에러를 발생시킨다.
			Opple oencil = (Opple) gds2.get();
			System.out.println("2번째 : " + oencil);

		} catch (Exception e) {
			System.out.println("2번째 : 실행적 에러~~");
		}

		Gds<Oencil> gds3 = new Gds<>();
		gds3.set(new Oencil());
		Oencil oencil2 = gds3.get();
		System.out.println("3번째 : " + oencil2);

	}
}
