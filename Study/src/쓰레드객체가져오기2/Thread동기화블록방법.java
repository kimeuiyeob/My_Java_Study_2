//package 쓰레드객체가져오기2;
//
//public class Thread동기화블록방법 {
//
//	public static void main(String[] args) {
//		// 공유 객체
//		Mydata mydata = new Mydata();
//
//		// plus Thread1
//		Thread plusThread1 = new PlusThreads(mydata);
//		plusThread1.setName("플러스쓰레드 1");
//		plusThread1.start();
//
//		try {
//			Thread.sleep(1000);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//
//		Thread plusThread2 = new PlusThreads(mydata);
//		plusThread2.setName("플러스쓰레드 2");
//		plusThread2.start();
//	}
//}
//
//class Mydata {
//	int data = 3;
//
//	public void plusData() {
//		// 블록 동기화는 이렇게 만든다
//		// 메서드는 메서드에다가 syncronized를 붙여주고
//		// 블록 동기화는 아래처럼 내가 동기화시키고 싶은데를 임의의객체를 매게변수로 받고 묶어준다.
//		synchronized (this) {
//			int mydata = data;
//			try {
//				Thread.sleep(3000);
//			} catch (Exception e) {
//				data = mydata + 1;
//			}
//		}
//	}
//}
//
//class PlusThreads extends Thread {
//	Mydata mydata;
//
//	public PlusThreads(Mydata mydata) {
//		this.mydata = mydata;
//	}
//
//	public void run() {
//		mydata.plusData();
//		System.out.println(getName() + "실행결과" + mydata.data);
//	}
//
//}
