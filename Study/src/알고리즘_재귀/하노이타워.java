package 알고리즘_재귀;

public class 하노이타워 {

	public static void hanoi(int number, int start, int end) {
		hanoiTower(number, start, end, 2);
	}

	public static void hanoiTower(int number, int start, int end, int other) {
		if (number == 1) {
			System.out.println(number + "원판을 " + start + "번 기둥에서 " + end + "번 기둥으로 이동");
		} else {
			hanoiTower(number - 1, start, other, end);
			System.out.println(number + "원판을 " + start + "번 기둥에서 " + end + "번 기둥으로 이동");
			hanoiTower(number - 1, other, end, start);
		}
	}

	public static void main(String[] args) {
		hanoi(3, 1, 3);
	}

}
