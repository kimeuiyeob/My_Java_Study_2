package 람다식;

interface C {
	int abc(String str);
}

public class RefOfStaticMethod_Type2_2 {
	public static void main(String[] args) {

		C c = a -> {
			if (a.equals("안녕")) {
				return 1;
			} else {
				return 2;
			}
		};
		int number = c.abc("안녕");
		System.out.println(number);
		
//		==============================
		
		C c1 = a -> a.length();
		System.out.println(c1.abc("안녕하세요"));
	
//		==============================
		
		C c2 = String::length;
		System.out.println(c2.abc("문자열의 길이를 알려겠어!!"));
		
	}
}
