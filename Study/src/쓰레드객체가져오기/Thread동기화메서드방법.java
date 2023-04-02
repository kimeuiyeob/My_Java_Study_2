package 쓰레드객체가져오기;

//동기화 방법은 2가지가 있다
//1.메서드 동기화
//접근 지정자   synchronized   리턴타입   메서드명 (입력 매게 변수)  {
//		동기화가 필요한 코드
//	}

public class Thread동기화메서드방법 {
	public static void main(String[] args) {
		// 공유 객체
		Mydata mydata = new Mydata();

		// plus Thread1
		Thread plusThread1 = new PlusThreads(mydata);
		plusThread1.setName("플러스쓰레드 1");
		plusThread1.start();
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		Thread plusThread2 = new PlusThreads(mydata);
		plusThread2.setName("플러스쓰레드 2");
		plusThread2.start();
	}
}

class Mydata {
	int data = 3;

	public synchronized void plusData() { // 메서드 동기화 <- 동시에 두개의 쓰레드가 동기화 메서드 사용 불가4
		// 즉 이 동기화메서드는 다른 쓰레드가 작업이 종료가 되면 연산되는 동기화 메서드이다.
		int mydata = data;
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			data = mydata + 1;
		}
	}
}

class PlusThreads extends Thread {
	Mydata mydata;

	public PlusThreads(Mydata mydata) {
		this.mydata = mydata;
	}

	public void run() {
		mydata.plusData();
		System.out.println(getName() + "실행결과" + mydata.data);
	}

}
