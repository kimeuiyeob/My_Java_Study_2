package 쓰레드;

public class 쓰레드Thread2 implements Runnable {
	
	//두개의 일을 동시에 하는게 멀티쓰레드이다.
	//쓰레드는 동시성(Concurrency)과 병렬성(Parallelism)을 가지고 수행
	//=>사용자는 동시에 동작하는걸로 인식
	//한마디로 엄청빠르게 첫번째 연산을하고 다시 또 엄청빠르게 두번째 연산을하고 다시 첫번째 다시 두번째 이런느낌?
	
	//즉 Runnable안에 run()메서드가 있고 인터페이스이기때문에 run()을 오버라이딩을 통해 구현한다.
	//그렇게 만들어진 Runanble객체를 Thread생성자에게 전달하여 Thread객체를 만들면 Thread생성이 완료된다.
	
	public static void main(String[] args) {

		쓰레드Thread2 thread = new 쓰레드Thread2();
		Thread the = new Thread(thread);
	
		//재정의한건 run()이지만 start()를해야지만 run()이실행이된다.
		//그리고 딱 한번만 실행이된다.
		the.start(); 
//		the.run(); 이렇게 하면 실행은 되지만 새로운 쓰레드를 생성하지 않아서 단일쓰레드 run()을 호출한것과 동일하게된다.
		
		//왜 run()을 재정의 했지만 start()로 쓰레드를 실행하는 이유?
		//start() = 새로운 쓰레드 생성 / 추가를 위한 모든 준비 + 새로운 쓰레드위에 run()실행

		int[] videoFrame = new int[6];
		for (int i = 0; i < videoFrame.length; i++) {
			videoFrame[i] = i;
			try {
				Thread.sleep(1000);
				System.out.println(videoFrame[i] + "비디오 프레임");
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void run() {
		String[] subtitle = new String[6];
		for (int i = 0; i < subtitle.length; i++) {
			subtitle[i] = ("자막" + i);
			try {
				Thread.sleep(1000);
				System.out.println(subtitle[i] + "자막 프레임");
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
