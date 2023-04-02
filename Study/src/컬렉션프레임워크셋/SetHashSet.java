package 컬렉션프레임워크셋;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetHashSet {
	
	public static void main(String[] args) {
		
		Set<String> setPrac = new HashSet<>();
		
		setPrac.add("가");
		setPrac.add("나");
		setPrac.add("다");
		setPrac.add("가"); //중복되어 사라진다.
		
		System.out.println(setPrac); 
		System.out.println(setPrac.size()); //중복제거 되서 갯수도 3개이다.
		

		for (int i = 0; i < setPrac.size(); i++) {
//			System.out.println(setPrac.get(i)); <=이게 안된다. 인덱스로 이루어져있지않기때문에
		}
		//이때 사용하는게 iterator()이다 => 셋의 값을 하나씩 추출할때
		//인덱스를 가지고 있지 않는 set의 값을 추출할때 사용하는게 Iterator 객체이다.
		//Iterator라는건 반복이라는 의미를 갖고있다.
		Iterator<String> iter = setPrac.iterator();
		
		//hasNext는 다음에 가르킬 값이 있니? 라는 메서드
		//있으면 true니까 while문 안으로 들어간다.
		while(iter.hasNext()) {
			System.out.println("Iterator setPrac 안의 값 : " + iter.next());
		}
		
		//그리고 forEach문으로도 쉽게 값을 가져올수있다.
		//forEach는 집합객체안의 값을 kim에 담아 출력하는것이다.
		for (String kim : setPrac) {
			System.out.println("ForEach setPrac 안의 값 : " + kim);
		}
		
		
	}

}
