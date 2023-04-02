package 예외및예외전가;

public class 예외Exception전가throws3 {

	// 메인 함수에서까지 예외를 전가하게 되면 -> JVM으로 가게 된다. JVM은 어떤 예외가 발생했습니다 알려주고 프로그램 종료.
	public static void main(String[] args) throws ClassNotFoundException {

		Class cls = Class.forName("java.lang.Object2");
	}
}
