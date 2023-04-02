package 예외및예외처리;

import java.io.InputStreamReader;

public class 예외Excpetion4 {

	public static void main(String[] args) {

		// 리소스 자동해제 예외처리 ( try with resource) / 이게 try(여기다가 넣는거)

		// try(여기다가 System.in을 열게 되면 try catch문이 끝날때 알아서 .close를 실행해준다.)
		// 여기 안에는 .close라는 abstract 메소드가 있어야 ()안에 들어갈수있다.
		// 예를 들어 A a = new A();이건 a가 close가 없기 때문에 들어갈수 없다.
		// AutoCloseable이라는 클래스를 가지고 있어야된다. 여기안에 close()가 있다.

		try (InputStreamReader ISR = new InputStreamReader(System.in)) {
			System.out.println(ISR.read());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("에러~~");
		}
		 
		
		
		
		
		
		
		
		
	}
}
