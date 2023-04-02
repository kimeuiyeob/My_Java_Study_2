package 예외및예외전가;

public class 예외Excpetion전가throws2 {

	public static void main(String[] args) throws InterruptedException {

		예외Excpetion전가throws2 e = new 예외Excpetion전가throws2();
		e.abc();

	}

	void cde() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("예외를 main 함수 다음 JVM까지 전가 해보겠습니다.");
	}

	void bdc() throws InterruptedException {
		cde();
	}

	void abc() throws InterruptedException {
		cde();
	}

}
