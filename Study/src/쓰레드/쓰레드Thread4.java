package 쓰레드;

public class 쓰레드Thread4 {

	// 여기선 쓰레드가 총 3개가 돌아간다.
	public static void main(String[] args) { // 메인 쓰레드 하나

		Video v = new Video(); 
		v.start();  // 비디오 쓰레드 둘

		Sub s = new Sub(); 
		s.start(); // 자막 쓰레드 셋
	}
}

class Video extends Thread {

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
		super.run();
	}

}

class Sub extends Thread {
	@Override
	public void run() {
		String[] strArray2 = new String[] { "1", "2", "3", "4", "5" };
		for (int i = 0; i < strArray2.length; i++) {
			System.out.println("비디오" + strArray2[i]);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		super.run();
	}
}
