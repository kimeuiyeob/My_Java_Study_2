package 컬렉션프레임워크스택과큐;

import java.util.Stack;

public class StackPractice {
	public static void main(String[] args) {

		// Stack<E>
		/*-Vector<E> 클래스의 자식
		-List<E>의 기본 메서드의 사용과 더불어 LIFO(last in last out)구조이다.
		-Vector<E> 클래스의 기본 메소드와 더불어 5개의 메서드 추가정의
		push(),peek(),pop(),serch(),empty()*/

//		List<E> <- Vectore<E> <-Stack<E>
		
//		첫번째로 1이 들어가면 1이 나오는건 가장 마지막이다. LIFO
//		|	4	|
//		|	3	|
//		|	2	|
//		|___1___|
		
		// push() 값을 담을때
		// peek() 다음나올 값을 확인
		// pop() 값을 꺼내올때
		// search() 데이터가 어디 있는지 확인
		// -> 나올값부터 순서매긴다. , 인덱스개념이랑 다르니 헤깔리면안된다, LIFO개념이니까..
		// -> 그리고 값이 없으면 -1리턴한다.
		// empty() 값이 있는지 확인 , 불린타입

		// 이렇게 Stack으로 생성해야 stack의 5개메서드를 사용할수있다.
		Stack<Integer> st = new Stack<>();
		st.push(2);
		st.push(5);
		st.push(3);
		st.push(7);

		System.out.println(st);
		System.out.println(st.peek()); // 가장 마지막에 담은 값 확인
		System.out.println(st.search(7)); // 가장 마지막에 담긴게 첫번째다.
		System.out.println(st.search(3));
		System.out.println(st.search(1)); // 값이 없으면 -1 리턴한다.

		System.out.println(st.pop()); // 가장 마지막에 담긴게 가장 먼저 나온다.
		System.out.println(st.pop()); // 즉 LIFO구조인걸 알수있다.
		System.out.println(st.pop());
		System.out.println(st.pop());

		System.out.println(st.empty()); // 다 값을 빼내서 true이다.

	}
  
}
