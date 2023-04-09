package 컬렉션프레임워크실습;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CreateListObject {
	public static void main(String[] args) {

		// 방법1
		// List 구현클래스의 생성자를 사용하여 객체 생성
		List<Integer> aList1 = new ArrayList<>();
		List<Integer> aList2 = new ArrayList<>(30);

		List<Integer> aList3 = new Vector<>();
		List<Integer> aList4 = new Vector<>(30);

		List<Integer> aList5 = new LinkedList<>();
//		List<Integer> aList6 = new LinkedList<>(30); <== linkedlist는 capacity지정할수 없다.

		// 방법2
		// Arrays 클래스의 정적 메서드 활용 (데이터의 크기를 바꿀수 없다.)
		// Arrays.asList() Array즉 배열의 껍데기를 List로 감싼다음에 list타입에 저장한거라고 보면된다.
		// 그래서 내부적으로는 Array이랑 같다. 그래서 데이터의 크기를 바꿀수 없다.
		List<Integer> aList7 = Arrays.asList(1, 2, 3, 4, 5);
		List<String> aList8 = Arrays.asList("월", "화", "수", "목", "금");
		// 데이터의 크기를 바꿀수 없는거지 값은 바꿀수있다.
		// 결국은 내부적으로 배열이 들어있는거기 때문에 배열이랑 똑같이 생각하면 된다.
		aList8.set(0, "토");
		System.out.println(aList8);

	}
}
