package 쓰레드의상태;

public class 쓰레드상태 extends Thread {

	public static void main(String[] args) {

		Thread.State state;

		Thread thread = new Thread() {

			@Override
			public void run() {
				for (int i = 0; i < 100000000L; i++) {
					;
				}
				super.run();
			}
		};

		state = thread.getState(); // .getState() 쓰레드의 상태를 알려주는 Thread클래스에 내장된 함수
		System.out.println("쓰레드 현재 상태 : " + state); // 쓰레드가 객체 생성만 됬지 .start() 되지 않았으므로 NEW가 출력된다.

		thread.start(); // 쓰레드를 실행시킨다.
		state = thread.getState();
		System.out.println("쓰레드 현재 상태 : " + state); // 이때는 쓰레드가 실행되서 RUNNABLE 상태이다. 실행중이라는 의미이다.

		try {
			thread.join(); // thread를 .join을 사용하여 CPU에게 보내고 잠깐 쉰다 이런의미이다.
		} catch (Exception e) {
			e.printStackTrace();
		}
		state = thread.getState();
		// 이때는 내가 실행중인게 아니라 CPU에게 join안의 무언가가 끝날때까지 아무것도 안하고 있기때문에 TERMINATED상태이다.
		System.out.println("쓰레드 현재 상태 : " + state);
	}

}
