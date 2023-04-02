package 제네릭클래스_인터페이스의문법;

public class 제네릭클래스 {

	// TIP : 객체생성시 제네릭타입을 지정하지 않으면 올수 있는 type중 최상위 클래스(Object)로 인식
	// 즉 아래 두코드는 동일한 의미 =>
	// myClass ms = new myClass();
	// myClass<Object> ms = new myClass<>();

	// 클래스명<실제 제네릭 타입> 참조변수명 = new 클래스명<실제 제네릭 타입>();
	// 또는
	// 클래스명<실제 제네릭 타입> 참조변수명 = new 클래스명<>(); //생성자의 경우 내부의 타입 생략 가능

	public static void main(String[] args) {

		MyClass<String> myClass1 = new MyClass<>();
		myClass1.set("안녕");
		System.out.println(myClass1.get());

		MyClass<Integer> myClass2 = new MyClass<>();
		myClass2.set(100);
		System.out.println(myClass2.get());

		MyClass<Integer> myClass3 = new MyClass<>();
//		myClass3.set("안녕"); 이러면 <T>가 인티져로 변했는데 안녕 문자열이 들어가서 오류를 발생시킨다.
		System.out.println(myClass3.get());
	}
}

//이렇게 클래스 뒤에 <>제네릭 타입을 T로 정한것은 아직 확실히 타입을 지정하지 않았다는 의미이고
//나중에 객체 생성시 타입을 지정해주면 T가 다 그타입으로 변경될것이다.
class MyClass<T> {
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
}
