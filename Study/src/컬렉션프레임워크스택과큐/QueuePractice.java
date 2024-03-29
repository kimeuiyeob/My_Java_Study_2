package 컬렉션프레임워크스택과큐;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePractice {
	public static void main(String[] args) {
		
		//Queue<E>
//		stack<E>과는 달리 별도의 interface로 구성되어있다.
//		먼저 들어간 데이터가 먼저 나오는 FIFO 구조이다. (first in first out)
//		=> 즉 stack이랑 반대 개념이라고 생각하면된다.
//		LinkedList<E> 클래스는 List<E>와 Queue<E> interface를 구현
		
//		Collection<E>  <-  Queue<E>  <- LinkedList<E>
		
//		보통 큐는 이벤트처리떄 많이 사용한다.
		
//		_________________________
//		
//		입구 ->               출구->  FIFO
//		_________________________

//		add(), element(), remove() 아래랑 같은 행동을 하지만 예외처리가 되지 않으므로
//		stack을 사용할때는 아래에 있는 메서드를 사용하는걸 권한다. 값이 없으면 예외처리가 되서 null을 반환한다.
//		offer() 값 담을때, poll()값 뺄때, peek() 나올값 확인할때
		
//		LinkedList는 Queue인터페이스를 구현한 클래스
//		=>LinkedList로 만들어서 Queue로 받는다.
		Queue<Integer> que = new LinkedList<>();
//		System.out.println(que.element()); //아래랑 같은 개념인데 element()예외처리가 안되서 에러발생
		System.out.println(que.peek()); //에러발생시키지 않고 null반환한다.
		
		que.add(3);
		que.offer(5);
		que.add(4);
		System.out.println(que);
		System.out.println(que.element()); //3이 먼저 들어가서 3이 먼저 나올값이다.
		
		System.out.println(que.remove());
		System.out.println(que.remove());
		System.out.println(que.remove());
//		System.out.println(que.remove()); //위 element랑 같은 개념
		System.out.println(que.poll()); //예외처리 되서 null 반환
		
	}

}
