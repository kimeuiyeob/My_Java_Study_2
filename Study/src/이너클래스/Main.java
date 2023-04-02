package 이너클래스;

public class Main {
	
	public static void main(String[] args) {
		
		InnerClass in = new InnerClass(); //InnerClass 외부 클래스 객체 생성
		
//		==================================
		InnerClass.A inA = in.new A(); //외부클래스.내부클래스 접근 , 참조변수 , 외부클래스객체. new 내부클래스(); 이렇게 해서 접근가능하다.
		inA.hello();
		
//		==================================
		InnerClass.A.AB inAB = inA.new AB();
		inAB.hello2(); 
		
		
	}

}
 