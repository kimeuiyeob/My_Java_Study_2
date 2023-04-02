package 자바API함수적인터페이스;

public class ConsumerMain {

//	1. consumer =  interface 입력은 있는데 출력은 없다. / 출력은 화면출력이 아니라 리턴이 있다 없다 의미이다.
//	2. supplier = 입력은 없는데 출력은 있다.
//	3. predicate = 입력은 있는데 출력은 true or false / 입력된 값이 참인지 거짓인지
//	4. function = 입력은 T타입인데 출력은 R타입으로 출력 / 변수의 타입을 변환시키는거라고 생각

//	unaryoperator / binaryoperator = 같은 타입을 리턴 => 즉 연산만 한다.

	public static void main(String[] args) {
//		=========================================================================================

		Consumer<String> c = new Consumer<String>() { // Consumer<T>인터페이스를 힙메모리에 생성
			public void accept(String t) { // abstract메서드 구현
				System.out.println(t);
			}
		};
		c.accept("Consumer<T> 함수형 인터페이스1");

		Consumer<String> c1;
		c1 = str -> System.out.println(str); // 람다 표현
		c1.accept("Consumer<T> 함수형 인터페이스2");

//		==========================================================================================
		
		Consumer c2 = num ->  System.out.println("IntConsumer 값 : " + num); //IntConsumer
		c2.accept(3);
		
		Consumer c3 = num ->  System.out.println("LongConsumer 값 : " + num); //LongConsumer
		c3.accept(5L);
		
		Consumer c4 = num ->  System.out.println("DoubleConsumer 값 : " + num); //DoubleConsumer
		c4.accept(1.23456);
		
		BiConsumer<String, Integer> c5 = (name,age) ->  System.out.println("이름 : " + name + " 나이 : " + age); //BiConsumer
		c5.accept("김의엽",5);
		
		
	}

}
