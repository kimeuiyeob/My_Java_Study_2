package 재귀함수;

public class RecursionFunctionPrac1 {

	// 재귀 함수 getSum()생성
	public static int getSum(int i) {
		// 재귀함수 탈출 조건
		if (i < 10) {
			// 1씩 증가해서 i가 0으로 들어왔을때 10번 반복
			i++;
			// getSum()함수가 10번 반복해서 i에 누적시킨다.
			return i += getSum(i);
		}
		// 10번 반복이 끝나면 0을 리턴해 누적에 차질이 없게한다.
		return 0;
	}

	public static void main(String[] args) {
//		========================================
		// for문을 이용한 누적 합계
//		int number = 10;
//		int sum = 0;
//		
//		for (int i = 1; i <= number; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
//		========================================
		// 재귀함수를 이용한 누적 합계
		int sum = getSum(0);
		System.out.println(sum);

	}
}