package 컬렉션프레임워크리스트;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class 컬렉션리스트 {
	public static void main(String[] args) {

		// 처음 객체생성시 리스트는 저장용량은 10이 생긴다.
		// 저장공간을 확보하고 add로 데이터를 넣으면 저장용량이 늘어난다.
		// 또 지우면 그만큼 줄어든다.

		List<String> aList1 = new ArrayList<>(); // ->capacity(10) 저장공간확보
		// 이렇게 ()50을 넣으면 생성때 저장공간을 50으로 준다. 근데 알아서 늘어나고 줄어드니 신경쓸필요없다.
		List<String> aList2 = new Vector<>(50);
		List<String> aList3 = new LinkedList<>();

		List<Integer> asList = Arrays.asList(1, 2, 3, 4);
		asList.toArray(); //object로 타입으로 반환한다.

		//배열의 크기는 변하지 않기때문이다.
		asList.set(0, 5); // -> 변경은 가능하다.
		System.out.println(asList);

//		asList.add(3); <-Arrays.asList 정적으로 값을 초기화해서 추가 삭제 불가능
//		asList.remove(1);
		List<Integer> asList1 = new ArrayList<>();
		
		asList1.add(1);
		asList1.add(2);
		asList1.add(3);
		asList1.add(4);
		asList1.add(5);
		
		asList1.add(1, 10); //set은 인덱스의 값을 바꾸는거고
		//add는 저인덱스에 값을 넣고 나머지 값들은 뒤로 밀린다.

		System.out.println(asList1);

	}

}
