package 스트림API;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomersStream2 {
	public static void main(String[] args) {

		List<Customers> customers = new ArrayList<>();
		customers.add(new Customers("김의엽", 61));
		customers.add(new Customers("양정우", 15));
		customers.add(new Customers("임은준", 53));
		customers.add(new Customers("김병기", 23));
		customers.add(new Customers("조윤예", 87));
		customers.add(new Customers("김의엽", 87));

		// customers객체에서 map()을 통해 이름만 추출한뒤 .collect(Collectors.toList()
		// 사용하여 리스트 형태로 반환한 다음 namesList에 담는다.
		List<String> namesList = customers.stream().map(Customers::getName).collect(Collectors.toList());
		for (String name : namesList) {
			System.out.println("이름 추출 안료 : " + name);
		}
		System.out.println();
		Stream<String> nameStream = namesList.stream();
		nameStream.forEach(name -> System.out.println("이름 추출 안료 : " + name));

	}
}
