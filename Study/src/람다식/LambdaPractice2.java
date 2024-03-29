package 람다식;

public class LambdaPractice2 {
	public static void main(String[] args) {

		// 람다식의 활용
//		-활용 1 : 익명이너클래스 내 구현 메서드의 람다식(약식) 표현 (함수적 인터페이스만 가능)
//		-활용 2 : 메서드 참조 (인스턴스 메서드 차조 Type1, 정적메서드 참조, 인스턴스 메서드 참조 Type2)
//		-활용 3 : 생성자 참조 (배열 생성자 참조, 클래스 생성자 참조)

		AA aa = () -> System.out.println("안녕");
		aa.method1();

		BB bb = a -> System.out.println(a);
		bb.method1(5);

		CC cc = () -> 3;
		int number = cc.method1();
		System.out.println(number);

		DD dd = (a, b) -> a + b;
		double number2 = dd.method1(5, 5.5);
		System.out.println(number2);

	}
}

interface AA {
	void method1();
}

interface BB {
	void method1(int a);
}

interface CC {
	int method1();
}

interface DD {
	double method1(int a, double b);
}
