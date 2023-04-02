package 컬렉션프레임워크리스트;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayList {

	public static void main(String[] args) {

		String[] strArr = { "가", "나", "다", "라", "마", "바" };
		strArr[2] = null;
		strArr[5] = null;

		System.out.println(strArr.length);
		System.out.println(Arrays.toString(strArr)); //배열객체를 한번에 출력
		
		for (String string : strArr) {
			System.out.println(string);
		}
		
		
		//메서드를 이용하여 정적컬렉션 생성 -> 이거는 추가 삭제 불가능
		List<String> strList = Arrays.asList("가", "나", "다", "라", "마", "바");
		
		//모든 컬렉션 객체(list,set등)는 자신의 데이털를 모두 출력하도록
		//toString()메서드를 오버라이딩 해놓았다.
		List<String> strList1 = new ArrayList<>();

		strList1.add("가");
		strList1.add("나");
		strList1.add("다");
		strList1.add("라");
		
		System.out.println(strList1); 
		
		
		
		
	}
}
