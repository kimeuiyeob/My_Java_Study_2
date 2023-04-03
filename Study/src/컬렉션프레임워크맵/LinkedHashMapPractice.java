package 컬렉션프레임워크맵;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapPractice {
	
	public static void main(String[] args) {
		
		//LinkedHashMap 
		/*
		 * HashMap과 기능은 다 동일하다, 하지만 입력순서와 출력순서가 같지 않다는걸 알수있다. 그렇지만 LinkedHashMap Linked
		 * 값이 들어갈때 서로서로 연결되있어서 출력할때도 입력순서대로 출력이된다.
		 * 
		 * LinkedHashSet이랑 똑같은 개념이다. HashSet 중복은 제거해주지만 입력출력순서가 다르다, 하지만 Linked는 입력 출력순서
		 * 같다. 위의 개념이랑 똑같다고 생각하면된다.
		 */
		
		Map<Integer,String> LinkedHM = new LinkedHashMap<>();
		LinkedHM.put(3, "가나다");
		LinkedHM.put(2, "가나다라");
		LinkedHM.put(1, "가나다가나");
		LinkedHM.put(4, "가나다바사아");
		System.out.println(LinkedHM); //put순서대로 출력된다.
	
	}

}
