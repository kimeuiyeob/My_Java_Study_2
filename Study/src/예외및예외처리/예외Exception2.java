package 예외및예외처리;

public class 예외Exception2 {
	public static void main(String[] args) {
		try {
			System.out.println(3/0);
			int a = Integer.parseInt("20A");
			
//			catch블록을 2개 써서 잡을수 있지만 이렇게 or연산자로도 2예외처리를 잡을수 있다.
		} catch (ArithmeticException | NumberFormatException e) {
			System.out.println("숫자는 0으로 나눌수 없습니다.");
			System.out.println("숫자로 변환할수 없습니디.");
		} catch (Exception e) { //Exception은 모든 예외처리를 받을수있기때문에 catch항상 마지막에 나둔다.
			e.printStackTrace(); 
		}
		
		
		finally {
			System.out.println("프로그램 종료");
			System.exit(0);
		}
	}

}
