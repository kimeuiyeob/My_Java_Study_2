package 쓰레드;

public class 쓰레드Thread5 {

	public static void main(String[] args) {

		//익명 이너클래스로 runnable 인터페이스 객체 구현해서 쓰레드 사용하는 방법
		Thread myThread1 = new Thread(new Runnable() { 
			@Override
			public void run() {
				String[] strArray = new String[] { "하나", "둘", "셋", "넷", "다섯" };
				for (int i = 0; i < strArray.length; i++) {
					System.out.println("자막" + strArray[i]);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});

		Thread myThread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				String[] strArray = new String[] { "하나", "둘", "셋", "넷", "다섯" };
				for (int i = 0; i < strArray.length; i++) {
					System.out.println("비디오" + strArray[i]);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});

		myThread1.start();
		myThread2.start();
	}
}
