package 자바API함수적인터페이스실습;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class ConsumerInterface {

	public static void main(String[] args) {

		// Consumer 함수형 인터페이스는 리턴타입이없는 void이다.
		// 즉 매게변수로 받는걸 그대로 출력하는 개념이다.

		Consumer<String> con = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println("이건 " + t + "이다");
			}
		};
		con.accept("consumer");

		Consumer<String> con1 = str -> System.out.println("이건 " + str + "이다");
		con1.accept("람다식 consumer");

//		================================================

		IntConsumer ic1 = number -> System.out.println("int : " + number);
		LongConsumer lc1 = number -> System.out.println("long : " + number);
		DoubleConsumer dc1 = number -> System.out.println("double : " + number);
		BiConsumer bc1 = (number1, number2) -> System.out.println("biConsumer : " + number1 + " , " + number2);
		// BiConsumer<String,Integer>이렇게 제네릭이로 지정해서 사용해도 되지만
		// 어차피 매게변수로 지정하게 되면 컴파일러가 알아서 이해하기 때문에 굳이 안넣줘도 된다.
		ic1.accept(5);
		lc1.accept(5);
		dc1.accept(5);
		bc1.accept("안녕", 5);

	}

}
