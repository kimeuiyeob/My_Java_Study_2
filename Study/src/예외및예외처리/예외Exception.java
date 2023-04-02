package 예외및예외처리;

//예외
//
//일반예외 (checked Exception) = 문법을 체크한다 / exception에서 부터 바로 상속
//-일반 예외를 발생시킬수 있는 코드들은 바로 예외 처리를 해줘야한다.
//예를 들어 Thread.sleep() / class.forName / isr.read() / b1.clone() 등등
//-문법적으로 에러를 내기때문에 필수적으로 예외처리를 해야한다.
//
//================================================================
//
//실행예외 (unchecked Exception) = 문법을 체크하지 않는다.
//-우선 컴파일은 잘되는데 실행중 문제가 발생되면 종료가 된다.
//-주로 연산할때 실행되다 연산에 문제가 생기면 그 문제를 알려주고 실행 종료된다.
//-실행예외는 문법적으로 에러를 내진 않지만 실행중 먼가 잘못되면 에러메세지를 내고 종료된다.
//
//예외 처리 문법 구조
//try {
//	예외 발생 가능 코드
//	일반예외 / 실행예외 발생 가능 코드
//}
//catch (예외클래스 이름  참조변수 명) {
//	해당 예외가 발생한 경우 처리 블록
//}
//finally {
//	예외 발생 여부에 상관없이 무조건 실행 블록
//}
//
//try에서 예외가 발생되면 JVM으로 보낸다. 그리고 JVM이 catch블록으로 보낸다.
//자바 가상 머신 JVM(Java Virtual Machine)은 자바 프로그램 실행환경을 만들어 주는 소프트웨어입니다.
//자바 코드를 컴파일하여 . class 바이트 코드로 만들면 이 코드가 자바 가상 머신 환경에서 실행됩니다

 
public class 예외Exception {

	public static void main(String[] args) {
		try {
//			System.out.println(3/0);
			System.out.println(3/1);
		} catch (ArithmeticException e) {
			System.out.println("연산 에러 났습니다.");
			System.out.println("에러가 나도 예외 처리를 해놓으면 계속 진행할수 있다");
		}
		System.out.println("계속 진행됩니다.");
	}
}
