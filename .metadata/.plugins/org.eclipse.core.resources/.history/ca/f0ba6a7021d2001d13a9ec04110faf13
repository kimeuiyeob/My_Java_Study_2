package 예외클래스사용자정의;

import 예외클래스사용자정의2.Over100Exception;
import 예외클래스사용자정의2.OverMinusException;

public class A {

	public void checkScore(int score) throws Over100Exception, OverMinusException {

		if (score > 100) {
			throw new Over100Exception("예외 발생 : 100초과");
		} else if (score < 0) {
			throw new OverMinusException("예외 발생 : 음수");
		} else {
			System.out.println("정상 작동합니다!");
		}

	}
}
