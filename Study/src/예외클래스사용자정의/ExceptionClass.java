package 예외클래스사용자정의;

public class ExceptionClass {
	
	public static void main(String[] args) {
		
		MyException m1 = new MyException();
		MyException m2 = new MyException("기본예외 메시지");
	
		MyRTException mre1 = new MyRTException();
		MyRTException mre2 = new MyRTException("RunTime예외 메시지");
		
		ExceptionClass e = new ExceptionClass();
		e.abc_2();
	}
	
	void abc_1(int num) {
		try {
			if(num > 70) {
				System.out.println("정상 동작!!");
			}else {
				throw new MyException();
			}
		} catch (MyException e) {
			System.out.println("예외 처리");
		}
	}
	
	void abc_2() {
		abc_1(65);
	}

}
