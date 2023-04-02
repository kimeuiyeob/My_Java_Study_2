package 쓰레드;

public class 쓰레드Thread3 extends Thread {

	public static void main(String[] args) {

		쓰레드Thread3 thread = new 쓰레드Thread3();
		thread.start();

		int[] video = new int[5];
		for (int i : video) {
			try {
				thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("비디오 프레임" + video[i]);
		}

	}


	@Override
	public void run() {
		int[] subtitle = new int[5];
		for (int i : subtitle) {
			try {
				Thread thread = null;
				thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print("자막 프레임" + subtitle[i]);
		}
		super.run();
	}

}
