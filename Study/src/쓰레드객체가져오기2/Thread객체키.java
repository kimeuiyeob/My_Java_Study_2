package 쓰레드객체가져오기2;

public class Thread객체키 {

	// 쓰레드 동기화에서 가장 중요한건 키이다!!
	// 객체의 키 즉 동일한 객체를 받아 동기화를 하면 동기화가 되지만
	// 새로운 객체의 키를 주입하면 또 그건 그거대로 쓰레드 작업을 한다 => 이부분이 쓰레드 동기화의 중요부분이다.
	public static void main(String[] args) {

		MyData mydata = new MyData();

		// thread 객체를 총 3개를 생성한다.
		Thread thread = new Thread() {
			public void run() {
				mydata.abc();
			};
		};
		thread.start(); // 3개의 쓰레드를 동시에 실행 시켜도
		// 각각의 동기화메서드와 블록동기화가 되어있어서
		// mydata객체의 키를 들고가 각각 실행될수밖에 없다.

		Thread thread2 = new Thread() {
			public void run() {
				mydata.bcd();
			};
		};
		thread2.start();

		Thread thread3 = new Thread() {
			public void run() {
				mydata.cde();
			};
		};
		thread3.start();

		Thread thread4 = new Thread() {
			public void run() {
				mydata.def();
			};
		};
		thread4.start();
	}
}

//=================================================

class MyData {

	synchronized void abc() {
		for (int i = 0; i < 3; i++) {
			System.out.println(i + "sec");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	synchronized void bcd() {
		for (int i = 0; i < 3; i++) {
			System.out.println(i + "초");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	void cde() {
		synchronized (this) {
			for (int i = 0; i < 3; i++) {
				System.out.println(i + "번째");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	void def() { // 이때 synchronized(임의의 객체) <==여기다 Mydata객체가 아닌 새로운 객체를 생성한다면...
		// 쓰레드는 다른키를 가지고 메서드 블록을 실행시킬것이다.
		synchronized (new Object()) {
			for (int i = 0; i < 3; i++) {
				System.out.println(i + "이건 새로운 객체 주입");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
