package 예외클래스사용자정의2;

import 예외클래스사용자정의1.A;

public class Main {

	public static void main(String[] args) {

		A a1 = new A();

		try {
			a1.checkScore(150);
		} catch (Over100Exception | OverMinusException e) {
			System.out.println(e.getMessage());
		}

	}

}
