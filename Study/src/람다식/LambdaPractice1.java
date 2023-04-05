package 람다식;

public class LambdaPractice1 {

	public static void main(String[] args) {

//		메서드(함수)
//		리턴타입 메서드 이름(입력 매게변수) {
//			메서드 내용..
//		}

//		람다식 (화살표는 람다식 표현이다)
//		(입력 매게변수) -> {
//			메서드내용..
//		}

		// 그럼 왜 (입력매게변수)는 생략이 왜 안됬을까?
		// 그이유는 입력매게변수의 정의는 나의 자유이기때문이다.
		// 즉 인터페이스 메서드 abc(int a,String b); 이렇게 정의되서 사용할떄 (int hello,String hi) ->{};
		// 이렇게 내가 원하는대로 바꿀수있기때문에 ()는 생략이 안됬다.

		// 람다식 생략 가능 부분을 알아보자!!
		A a = () -> {
			System.out.println();
		};
//		A a1 = () -> System.out.println(); // <= {}이거 생략
//		A a2 = (a) -> System.out.println(); // <= 입력 매게변수 타입 생략
//		A a2 =  a -> System.out.println(); // <= 입력 매게변수 타입 생략 및 () 생략
//		A a3 = (a,b) -> {return a+b}; 
//		A a3 = (a,b) ->  a+b; 리턴문만 있을때는 리턴도 생략가능하다.

		
	}
}

