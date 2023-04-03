package 이너클래스1;

//맴버 클래스
//1.인스턴스 이너 클래스 -> 클래스 앞에 아무것도 안붙은거 static이 안붙은거
//2.정적 이너 클래스 -> 클래스 앞에 static이 붙은거

//3.지역 클래스 -> 함수내에 클래스가 있는거

//A.class , A$B.class A클래스가 메인 클래스이고 이너클래스가 B클래스라면 A$B.class로 표현한다.
//외부 클래스 a = new 외부클래스();
//외부 클래스.내부클래스 ab = a.new 내부클래스();


public class InnerClass {
	
	
//	========================
	class A { //멤버클래스 : 인스턴스 이너 클래스
		
		void hello() {
			System.out.println("안녕");
		}
		
		class AB {
			void hello2() {
				System.out.println("인녕2");
			}
		}
	}

//	========================
	static class B { //멤버클래스 : 정적 이너 클래스
		;
	}

//	========================
	void ABC() { //지역클래스
		class C {
			;
		}
	}

}