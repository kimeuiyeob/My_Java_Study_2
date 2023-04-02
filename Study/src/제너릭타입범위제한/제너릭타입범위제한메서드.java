package 제너릭타입범위제한;

//접근지정자 <T extends 부모클래스명> T 메서드명 (T t) {
// 부모클래스 메서드 사용 가능
// }

public class 제너릭타입범위제한메서드 {
	
	public static void main(String[] args) {
		
		method1("안녕하세요");
	}

	public static <T> void method1(T t) {
//		char c = t.charAt(0); 
//		<==사용할수 없다/ 그이유는 제너릭이 T이므로 타입을 지정하지 않아서 어떠한 타입이 들어올수있는데 메서드 내부에 String클래스에 있는 chatAt메서드를 사용했기때문이다.
//		이럴때는 무조건 Object 최상의 클래스에 내장되어있는 함수만 사용가능하다 -> 이렇게 되면 생각보다 메서드 내부에서 쓸수 있는게 한정되어있으니 아래처럼 타입을 제한해주는거다.
//		System.out.println(c);
	}

	// 이렇게 타입의 범위를 정해주면 결국은 제너릭안에는 String타입또는 그 하위 자식들 타입만 들어오게 되어서 메서드 내부에
	// String클래스의 내장된 함수를 사용할수 있는거다.
	// 그리고 String은 final클래스이기 때문에 하위 자식이 존재하지 않아서 결국은 Sting밖에 올수 없다.
	public static <T extends String> void method1(T t) {
		char c = t.charAt(0);
		System.out.println(c);
	}

}
