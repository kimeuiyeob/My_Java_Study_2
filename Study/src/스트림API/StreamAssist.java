package 스트림API;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAssist {
	public static void main(String[] args) {
		
		// Age 30이상 , 오름차순, 이름 출력
		List<Customers> customers = new ArrayList<>();
		customers.add(new Customers("김의엽", 61));
		customers.add(new Customers("양정우", 15));
		customers.add(new Customers("임은준", 53));
		customers.add(new Customers("김병기", 23));
		customers.add(new Customers("조윤예", 87));

		List<Customers> list = new ArrayList<>();
		for (Customers customer : customers) {
			if (customer.getAge() > 30) {
				list.add(customer);
			}
		}
		Collections.sort(list);
		for (Customers customer : list) {
			System.out.println(customer.getName());
		}

//		=================================================
		// Stream 활용!!

		List<String> customersNames = 
				customers.stream()
				//필터링
				//조건으로 걸러준다.
				.filter(i -> i.getAge() > 30)
				//정렬
				.sorted()
				//추출하고자 하는 데이터 매핑
				//Customers <= 참조변수 or 클래스타입 , getName()메서드
				.map(Customers::getName)
				//데이터들을 모아 리스트형태로 반환
				.collect(Collectors.toList());
		
		for (String name : customersNames) {
			System.out.println(name);
		}
		
	}
}
