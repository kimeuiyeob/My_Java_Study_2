package 컬렉션프레임워크실습;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayVsList {

	public static void main(String[] args) {
		String[] array = { "가", "나", "다", "라", "마" };
		array[2] = null;
		array[4] = null;
		List<String> AL = new ArrayList<>();
		for (String string : array) {
			AL.add(string);
		}
		for (int i = 0; i < AL.size(); i++) {
			if (AL.get(i) == null) {
				AL.remove(i);
			}
		}
		AL.add("다");
		AL.add("마");
		Collections.sort(AL);
		System.out.println(AL);

	}
}
