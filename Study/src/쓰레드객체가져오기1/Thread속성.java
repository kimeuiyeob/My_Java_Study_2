package 쓰레드객체가져오기1;

public class Thread속성 {

	public static void main(String[] args) {

		Thread curThread = Thread.currentThread();
		System.out.println("현재 쓰레드 이름 : " + curThread.getName());
		System.out.println("쓰레드 수 : " + curThread.activeCount());

		for (int i = 0; i < 3; i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName());
			thread.start();
		}
		
		for (int i = 0; i < 3; i++) {
			Thread thread = new Thread();
			thread.setName(i + " 번째 쓰레드");
			System.out.println(thread.getName());
			thread.start();
		}
		
		for (int i = 0; i < 3; i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName());
			thread.start();
		}

		System.out.println("쓰레드 수 : " + Thread.activeCount());

	}

}
