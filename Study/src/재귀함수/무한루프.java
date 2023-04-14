package 재귀함수;

public class 무한루프 {
	// 재귀함수란 자신을 재참조하는 함수를 의미한다.
	// 즉 자기자신을 호출한다는 뜻이다.
	// 그러므로 반드시 종료조건이 필요하다. 종료조건이 없다면 무한루프를 돌게될것이다. => 스택 오버플로우
	// 재귀함수의 장점으로는 재귀함수의 이해도가 높으면 코드의 가독성및 간결성이 좋아질수 있으나
	// 재귀함수의 이해도가 낮다면 코드를 이해하기 어려울 수가 있다.
	

	public static void main(String[] args) {
		recursiveTest(1);
	}

	public static void recursiveTest(int count) {
		System.out.println("count : " + count);
		count = count + 1;
		if (count <= 10) { // <==그러므로 조건문에 10까지 되면 메서드 호출안하게 했다.
			recursiveTest(count);
		}
//		recursiveTest(count); <== 이러면 무한루프 1씩 계속 증감해서 출력된다.
	}

}
