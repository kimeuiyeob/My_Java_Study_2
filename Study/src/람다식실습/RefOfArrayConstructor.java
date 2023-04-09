package 람다식실습;

//다양한 크기의 배열을 만들어 리턴해주는 인터페이스이다.
interface O {
	int[] abc(int length);
}

public class RefOfArrayConstructor {
	public static void main(String[] args) {

		// 배열의 생성자 참조
		// 1번 익명 이너 클래스
		O o1 = new O() {
			@Override
			public int[] abc(int length) {
				return new int[length];
			}
		};

		// 람다식
		O o2 = length -> new int[length];

		// 배열의 생성자 참조
		O o3 = int[]::new;

		int[] array1 = o1.abc(3);
		System.out.println(array1.length);
		int[] array2 = o2.abc(4);
		System.out.println(array2.length);
		int[] array3 = o3.abc(5);
		System.out.println(array3.length);

	}
}
