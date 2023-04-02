package 컬렉션프레임워크리스트;

public class ListLinkedList {

	// LinkedList<E>
	// ArrayList와 다른점
	// 디폴트 저장공간(10)만 사용하며 생성자로 저장공간의 크기 지정 불가하다
	// 즉 => List<Integer> listLink = new LinkedList<>(30); 이렇게 저장공간 지정이안된다.
	// 데이터의 내부 저장방식이 index가 아닌 앞뒤 객체의 위치정보를 저장

	// LinkedList는 데이터 앞뒤가 연결되있는 형식이다.
	// ArrayList는 데이터가 인덱스로 되어있다.

	// 데이터를 삽입 삭제할때는 LinkedList가 빠르다
	// 그이유는 데이터를 인덱스로 관리하지 않기때문에
	// 중간에 삽입하게 되더라도 그 삽입한 데이터의 앞뒤 데이터만 영향을 받기때문이고
	// ArrayList는 중간에 삽입하게 되면 그뒤에 데이터의 인덱스 값은 1씩다 밀리기때문에
	// 처리속도가 더 느리다.

	// 하지만 값을 불러올때는 ArrayList가 좋다
	// 그이유는 값을 찾을때 인덱스로 찾아서 바로 그해당 인덱스 값을 get해오는데
	// LinkedList는 앞에서 하나하나 다세서 처리 속도가 느리다.list2

}
