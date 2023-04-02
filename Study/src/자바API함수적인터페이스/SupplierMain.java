package 자바API함수적인터페이스;

public class SupplierMain {

//	1. consumer =  interface 입력은 있는데 출력은 없다. / 출력은 화면출력이 아니라 리턴이 있다 없다 의미이다.
//	2. supplier = 입력은 없는데 출력은 있다.
//	3. predicate = 입력은 있는데 출력은 true or false / 입력된 값이 참인지 거짓인지
//	4. function = 입력은 T타입인데 출력은 R타입으로 출력 / 변수의 타입을 변환시키는거라고 생각

	public static void main(String[] args) {

//		==========================================================================================

		Supplier<String> s = new Supplier<String>() { //이너 클래스 생성
			public String get() { //get메소드 구현
				return "Supplier<T> 인터페이스1"; //"Supplier<T> 인터페이스1" 출력
			}
		};
		System.out.println(s.get());

		Supplier<String> s1;
		s1 = () -> "Supplier<T> 인터페이스2";
		System.out.println(s1.get());
		
//		==========================================================================================
		
		Supplier<Integer> s3 = new Supplier<>() { //인트 형
			public Integer get() {
				return 5;
			}
		};
		System.out.println(s3.get());
		
		Supplier<Integer> s4;
		s4 = () -> 7;
		System.out.println(s4.get());
		
//		==========================================================================================
		
		Supplier<Boolean> s5 = new Supplier<>() {
			public Boolean get() {
				return true;
			}
		};
		System.out.println(s5.get());
		
		Supplier<Boolean> s6;
		s6 = () -> false;
		System.out.println(s6.get());
		
//		==========================================================================================
		
		Supplier<Double> s7 = new Supplier<>() {
			public Double get() {
				return 3.12345;
			}
		};
		System.out.println(s7.get());
		
		
		Supplier<Double> s8;
		s8 = () -> 5.12345;
		System.out.println(s8.get());
		
//		==========================================================================================
		

	}

}
