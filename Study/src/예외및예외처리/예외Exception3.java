package 예외및예외처리;

import java.io.IOException;
import java.io.InputStreamReader;

public class 예외Exception3 {

	public static void main(String[] args) {

		InputStreamReader is = null;

		try {
			System.out.println("입력");
			is = new InputStreamReader(System.in);// System.in은 입력하면 콘솔이 읽겠다 라는 의미
			System.out.println(is.read());
		} 
		catch (IOException e) {
			e.printStackTrace(); // 예외 처리
		} 
		finally {

			if (is != null) {
				try {
					is.close(); //close()를 만나면 is를 반납하다.
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}
}
