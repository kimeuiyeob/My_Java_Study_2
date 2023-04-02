package 예외및예외전가;

public class 예외Exception전가throws4 {
	public static void main(String[] args) {
		
		예외Exception전가throws4 e = new 예외Exception전가throws4();
		
		try {
			e.bcd(); //bcd함수안에는 2개의 예외 전가를 했기 때문에 catch도 두개로 잡아줘야한다.
		} catch (ClassNotFoundException | InterruptedException e1) {
			e1.printStackTrace();
		}

	}

	//forName()는 ClassNotFoundException전가하고 / thread.sleep()은 InterruptedException 전가한다.
	void bcd() throws InterruptedException, ClassNotFoundException {
		Class cls =  Class.forName("jave.lang.Object");
		Thread.sleep(1000);
	}

}
