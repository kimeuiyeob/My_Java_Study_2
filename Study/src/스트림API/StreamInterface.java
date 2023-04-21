package 스트림API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamInterface {
	public static void main(String[] args) {

		// 한가지 깨달은것! 한번 생성한 스트림은 사용후 다시 사용할수 없으며 전체 데이터에 대한 처리가 이루어지면 종료된다.
		List<String> nameList = Arrays.asList("lee", "kim", "park", "hong", "choi", "song");

		// 스트림은 컬렉션 객체에서 생성할수있다. nameList는 List객체즉 컬렉션객체로 만든것이므로
		// .stream() 컬렉션에 default메소드로 있는 함수를 사용할수 있다.
		Stream<String> strStream = nameList.stream();
		strStream.forEach(i -> System.out.print(i + " "));

		// 그래서 아래와같이 객체를 새롭게 생성하지 않으면 에러 발생한다.
		Stream<String> strStream2 = nameList.stream();
		strStream2.forEach(System.out::print);

		// stream은 파이프형식 즉 메서드를 조합해서 쭉 조합해서 결과물을 만들어내기때문에
		// 한번 스트림 객체를 생성해서 거기서 원하는 결과물을 만들지 스트림 객체를 하나또 만들어서 사용하는 경우는 드물다.

	}
}
