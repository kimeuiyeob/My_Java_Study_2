package 컬렉션프레임워크셋;

import java.util.TreeSet;

public class MyComparableClass implements Comparable<MyComparableClass> {

	int data1;
	int data2;

	public MyComparableClass(int data1, int data2) {
		super();
		this.data1 = data1;
		this.data2 = data2;
	}

	@Override
	// Comparable인터페이스는 객체간에 비교를 할수있다.
	// 인터페이스므로 안에 있는 compareTo함수를 구현해야한다.
	// => 파라미터러 넘어온 값이랑 나의 값이랑 비교한다.
	public int compareTo(MyComparableClass o) {
		if (this.data2 < o.data2) {
			return -1;
		} else if (this.data2 == o.data2) {
			return 0;
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {

		TreeSet<MyComparableClass> TS = new TreeSet<>();

		// 구현한 compareTo에서 기준을 data2로 두면 출력할때 data2의기준으로 정렬되서 출력
		// 반대로 하면 data1의 기준으로 출력된다.
		MyComparableClass myClass1 = new MyComparableClass(2, 5);
		MyComparableClass myClass2 = new MyComparableClass(3, 3);

		TS.add(myClass1);
		TS.add(myClass2);

		for (MyComparableClass myComparableClass : TS) {
			System.out.println(myComparableClass.data2);
		}

	}
}
