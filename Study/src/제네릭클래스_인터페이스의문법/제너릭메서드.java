package 제네릭클래스_인터페이스의문법;

//접근 지정자 <T> T 메서드이름(T t) {
// 타입 T를 사용한 코드
// }

//접근 지정자 <T> void 메서드이름(T t) {
//타입 T를 사용한 코드
//}

//접근 지정자 <T,V> T 메서드이름(T t, V v) {
//타입 T를 사용한 코드
//}

//제네릭 메서드는 메서드를 호출할때 타입을 지정해주는거다.	
public class 제너릭메서드 {

	public static void main(String[] args) {
		
		String hi = hello("안녕~~");
		System.out.println(hi);

		int hello = hello(300); 
		System.out.println(hello);

		hello2("안녕");
		
	}
	//즉 제너릭 메서드 내부에서는 참조변수 t의 메서드로 Object클래스 메서드만 사용가능하다.
//	public static <T> T kim(T t) {
//		t.length(); // <==여기 오류가 생긴다 그이유는 제너릭은 어떠한경우도 들어올수있는데 .length는 스트링타입으로만 사용가능하기때문이다.
//		return t;
//	}
	
	//만약 내가 위에처럼 .length를 메서드 내부에 사용하고 싶다면 제너릭을<T>가 아닌 <String>으로 지정해줘야한다.
	
//	========================================

	public static <T> T hello(T t) {
		return t;
	}

	public static <T> void hello2(T t) {
		System.out.println(t);
	}

}
