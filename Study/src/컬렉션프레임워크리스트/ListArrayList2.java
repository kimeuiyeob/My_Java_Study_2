package 컬렉션프레임워크리스트;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayList2 {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();

		for (int i = 1; i <= 5; i++) {
			list1.add(i);
		}

		List<Integer> list2 = new ArrayList<>();

		for (int i = 4; i < 8; i++) {
			list2.add(i);
		}

		list2.addAll(list1); // 리스트 안에 addAll은 객체를 추가할수도있다/

		System.out.println(list2.toString());

//		list2.remove(5); // 이렇게 되면 인덱스 5가 지워진다

		// 실제 5를 지우려면
		list2.remove(new Integer(5));
		System.out.println(list2);
		
		//리스트를 다시 배열로 바꾸는 방법이다. toArry()하면 object로 반환하니까
		//이렇게 하면 Integer배열로 만들수있다.
		//이때 인덱스에 0이나 리스트 사이만큼 만들면 안에 값들이 그대로 배열로 바뀐다.
		Integer[] listToArray = list2.toArray(new Integer[0]);
		Integer[] listToArray1 = list2.toArray(new Integer[list2.size()]);
		System.out.println(Arrays.toString(listToArray));
		
	}

}
