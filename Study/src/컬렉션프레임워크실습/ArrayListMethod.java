package 컬렉션프레임워크실습;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethod {

	public static void main(String[] args) {

		List<String> listInt = new ArrayList<>();

		for (int i = 1; i < 5; i++) {
			listInt.add("안녕" + i);
		}

		// .toArray()하게 되면 타입이 Object이다.
		// 그래서 Object배열로 받아줘야하는데 만약 String이나 Intger로 받아야할경우도 있을거다.
		// String안의 내장함수를 쓸때가 있을때는 .toArray(new String[0])
		// 이렇게 String배열객체를 생성해서 String배열에 담는거다.
		// 이때 배열의 크기를 지정해줄수 있지만 0으로 지정할시에는 안에 값만큼 커져서 담아진다.
		Object[] listToArray = listInt.toArray();
		// 리스트를 다시 배열로 만들때 사용하는 메서드가 .toArray()이다.
		String[] listToArrayString = listInt.toArray(new String[10]);
		for (int i = 0; i < listToArrayString.length; i++) {
			if (listToArrayString[i] == null) {
				System.out.println("null이지롱~");
			} else {
				System.out.println(listToArrayString[i]);
			}
		}
		System.out.println();

		String[] listToArrayString2 = listInt.toArray(new String[0]);
		for (int i = 0; i < listToArrayString2.length; i++) {
			if (listToArrayString2[i] == null) {
				System.out.println("null이지롱~");
			} else {
				System.out.println(listToArrayString2[i]);
			}
		}

	}

}
