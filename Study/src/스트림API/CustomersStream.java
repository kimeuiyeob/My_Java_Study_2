package 스트림API;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomersStream {
	public static void main(String[] args) {

		// 중간 연산 distinct 중복제거 메서드를 사용하기 위해서는 equals재정의가 필요하다.
		// 중간 연산 sorted를 사용하기 위해서는 Customer클래스에 Comparable인터페이스를 상속받아 compareTo메서드를 구현해서
		// 확실히 어떤거를 기준으로 정렬을 시킬지를 정해줘야 한다.그러지 않으면 이름으로 정렬할지 나이로 정렬할지 모르기 때문에 에러가 발생한다.

		// 만약 comparable인터페이스를 구현하기 싫다면
		// sorted(Compatator.comparing(Customers::getName))을 통해 정렬조건을 줘서 정렬시키는 방법도있다.

		// Age 30이상 , 오름차순, 이름 출력
		List<Customers> customers = new ArrayList<>();
		customers.add(new Customers("김의엽", 61));
		customers.add(new Customers("양정우", 15));
		customers.add(new Customers("임은준", 53));
		customers.add(new Customers("김병기", 23));
		customers.add(new Customers("조윤예", 87));
		customers.add(new Customers("김의엽", 87));

		List<Customers> list = new ArrayList<>();
		for (Customers customer : customers) {
			if (customer.getAge() > 30) {
				list.add(customer);
			}
		}
//		Collections.sort(list);
//		for (Customers customer : list) {
//			System.out.println(customer.getName());
//		}
//		System.out.println();

//		=================================================
		// Stream 활용!!

		List<String> customersNames = customers.stream()
				// 필터링
				// 조건으로 걸러준다.
				.filter(i -> i.getAge() > 30)
				// 정렬
				.sorted(Comparator.comparing(Customers::getAge))
				// 추출하고자 하는 데이터 매핑
				// Customers <= 참조변수 or 클래스타입 , getName()메서드
				.map(Customers::getName)
				// 데이터들을 모아 리스트형태로 반환
				.collect(Collectors.toList());

//		for (String name : customersNames) {
//			System.out.println(name);
//		}

		Stream<Customers> stream = customers.stream();
//		stream.filter(i -> i.getAge() > 30).sorted().map(Customers::getName).forEach(i -> System.out.println(i));
//		stream.filter(i -> i.getAge() > 30).map(Customers::getName).distinct().forEach(System.out::print);
//		long cnt = stream.filter(i -> i.getAge() > 20).count();
//		System.out.println("20살 이상 사람수 : " + cnt + "명");
//		stream.filter(i -> i.getName().equals("김의엽")).sorted().forEach(i -> System.out.println(i.getAge()));
		stream.filter(i -> i.getAge() > 60).filter(i -> i.getAge() < 90).sorted(Comparator.comparing(Customers::getAge))
				.map(Customers::getName).distinct().forEach(i -> System.out.println("이름 : " + i));

	}
}
