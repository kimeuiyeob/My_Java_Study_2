package 스트림실습;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class streamPrac1 {
	public static void main(String[] args) {

		// 1부터 10까지 list에 담고 출력
		List<Integer> data1 = new ArrayList<>();
		IntStream.range(1, 11).forEach(i -> data1.add(i));
		System.out.println("data1 : " + data1);

		// 1~100까지 홀수만 list에 담고 출력
		List<Integer> data2 = new ArrayList<>();
		IntStream.range(1, 101).filter(i -> i % 2 != 0).forEach(i -> data2.add(i));
		System.out.println("data2 : " + data2);

		// ABCDEF를 각 문자별로 출력
		String abcdef = "ABCDEF";
		abcdef.chars().forEach(i -> System.out.print((char) i + " "));
		System.out.println();

		// A~F까지 list에 담고 출력
		List<Character> data3 = new ArrayList<>();
		IntStream.range(65, 71).forEach(i -> data3.add((char) i));
		System.out.println("data3 : " + data3);

		// A~F까지 중 D제외하고 ArrayList에 담고 출력
//		List<Character> data4 = new ArrayList<>();
//		IntStream.range(65, 71).map(i -> i == 68 ? 0 : i).forEach(i -> data4.add((char) i));
//		System.out.println("data4 : " + data4);

		// A~F까지 중 D제외하고 ArrayList에 담고 출력
		List<String> data4 = Arrays.asList("A", "B", "C", "D", "E", "F");
		data4.stream().map(i -> i.equals("D") ? "" : i).forEach(i -> System.out.print(i + " "));
		System.out.println();

		// 5개의 문자열을 입력받은 후 모두 소문자로 변경
//		Scanner sc = new Scanner(System.in);
//		List<String> strList = new ArrayList<>();
//		for (int j = 0; j < 5; j++) {
//			strList.add(sc.next());
//		}
//		strList.stream().forEach(i -> System.out.println(i.toLowerCase()));

		// Apple, banana, Melon 중 첫번째 문자가 대문자인 문자열 출력
		List<String> fruitList = Arrays.asList("Apple", "banana", "Melon");
		fruitList.stream().filter(i -> i.charAt(0) >= 65).filter(i -> i.charAt(0) <= 90)
				.forEach(i -> System.out.print(i + " "));
		System.out.println();

		// 한글을 정수로 변경
//		String hangle = "공일이삼사오육칠팔구";
//		String data = "일공이사";
//		data.chars().map(hangle::indexOf).forEach(i -> System.out.print(i + " "));

		// 정수를 한글로 변경
		String hangle = "공일이삼사오육칠팔구";
		String data = "1024";
		data.chars().map(i -> (i - 48)).forEach(i -> System.out.print(hangle.charAt(i) + " "));

	}
}
