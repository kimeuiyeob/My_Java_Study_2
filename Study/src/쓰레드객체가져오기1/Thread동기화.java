package 쓰레드객체가져오기1;

//Thread동기화(synchronized)

//
//	동기화의 의미
//	-하나의 작업이 완전히 완료된후 다른 작업 수행
//	-cf. 비동기식 : 하나의 작업 명령 이후(완료와 상관없이) 바로 다른 작업 명령 수행
//	
//	동기화의 필요성
//	-두개의 쓰레드가 하나의 객체를 공유하는 경우

//멀티 쓰레드는 동시에 작업을 수행하는 장점이 있지만 이렇게 객체를 공유하는 경우에 이런 문제점이 발생한다. 

public class Thread동기화 {

	public static int Data = 5;

	public static void main(String[] args) {
		
		PlusThread p = new PlusThread();
		p.start();
		PlusThread2 p2 = new PlusThread2();
		p2.start();
		
		System.out.println(Data); //이렇게 되면 mydata는 +1을 두번했기때문에 7이나와야되는데 결과값은 6이 나온다.

	}

}

class PlusThread extends Thread { //여기도 5를가져다가 +1을 해준것이고 아래도 똑같이해서 결과값이 6이나온것이다.
	@Override
	public void run() {
		Thread동기화 plus = new Thread동기화();
		plus.Data += 1;
	}
}

class PlusThread2 extends Thread {
	@Override
	public void run() {
		Thread동기화 plus = new Thread동기화();
		plus.Data += 1;
	}
}

