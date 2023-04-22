package 스트림실습;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TraMain {

	public static void main(String[] args) {

		Trader 김의엽 = new Trader("김의엽", "잠실");
		Trader 임은준 = new Trader("임은준", "목동");
		Trader 양정우 = new Trader("양정우", "잠실");
		Trader 손유한 = new Trader("손유한", "오목교");

		List<Transaction> transactions = new ArrayList<>();
		transactions.add(new Transaction(임은준, 2011, 300));
		transactions.add(new Transaction(김의엽, 2012, 820));
		transactions.add(new Transaction(김의엽, 2011, 400));
		transactions.add(new Transaction(양정우, 2012, 710));
		transactions.add(new Transaction(양정우, 2012, 700));
		transactions.add(new Transaction(손유한, 2012, 950));

		// 2. 2011년에 일어난 모든 트랜잭션을 찾아 값을 기준으로 오름차순으로 정렬하시오.
//		transactions.stream().filter(i -> i.getYear() == 2011)
//				.sorted(Comparator.comparing(Transaction::getValue).reversed())
//				.forEach(i -> System.out.println(i.getTrader()));

		// 3. 거래자가 근무하는 모든 도시를 중복 없이 나열하시오.
//		transactions.stream().forEach(i -> System.out.println(i.getTrader().getCITY()));

		// 4. 잠실에서 근무하는 모든 거래자를 찾아서 이름순으로 정렬하시오.
//		transactions.stream().filter(i -> i.getTrader().getCITY().equals("잠실"))
//				.forEach(i -> System.out.println(i.getTrader().getName()));

		// 모든 거래자의 이름을 알파벳 역순으로 정렬해서 반환하시오.
//		transactions.stream().map(i -> i.getTrader().getName()).sorted(Comparator.reverseOrder())
//				.forEach(i -> System.out.println(i));

		// 6. 오목교에 거래자가 있는가?
//		boolean answer = transactions.stream().anyMatch(i -> i.getTrader().getCITY().equals("오목교"));
//		System.out.println(answer);

		// 7. 목동에 거주하는 거래자의 모든 트랜잭션 값을 출력하시오.
//		transactions.stream().filter(i -> i.getTrader().getCITY().equals("목동")).forEach(i -> System.out.println(i));

		// 8. 전체 트랜잭션 중 최댓값은 얼마인가?
//		Integer answer = transactions.stream().map(i -> i.getValue()).reduce(Integer.MIN_VALUE, Integer::max);
//		System.out.println(answer);

//		=======================================================================================================

//		    Trader raoul = new Trader("Raoul", "Cambridge");
//	        Trader mario = new Trader("Mario", "Milan");
//	        Trader alan = new Trader("Alan", "Cambridge");
//	        Trader brian = new Trader("Brian", "Cambridge");
//
//	        List<Transaction> transactions = Arrays.asList(
//	            new Transaction(brian, 2011, 300),
//	            new Transaction(raoul, 2012, 1000),
//	            new Transaction(raoul, 2011, 400),
//	            new Transaction(mario, 2012, 710),
//	            new Transaction(mario, 2012, 700),
//	            new Transaction(alan, 2012, 950)
//	        );
//	        
//		1. 2011년에 일어난 모든 트랜잭션을 찾아 값을 오름차순으로 정렬하시오.
//
//		List<Integer> answer1 = transactions.stream()
//		    .filter(t -> t.getYear() == 2011)
//		    .map(Transaction::getValue)
//		    .sorted()
//		    .collect(Collectors.toList());
//
//		System.out.println(answer1);
//		
//		2. 2011년에 일어난 모든 트랜잭션을 찾아 값을 기준으로 오름차순으로 정렬하시오.
//
//		List<Transaction> answer2 = transactions.stream()
//		    .filter(t -> t.getYear() == 2011)
//		    .sorted(Comparator.comparing(Transaction::getValue))
//		    .collect(Collectors.toList());
//
//		System.out.println(answer2);
//		
//		3. 거래자가 근무하는 모든 도시를 중복 없이 나열하시오.
//
//		List<String> answer3 = transactions.stream()
//		    .map(Transaction::getTrader)
//		    .map(Trader::getCITY)
//		    .distinct()
//		    .collect(Collectors.toList());
//
//		System.out.println(answer3);
//		
//		4. 케임브리지에서 근무하는 모든 거래자를 찾아서 이름순으로 정렬하시오.
//
//		List<Trader> answer4 = transactions.stream()
//		    .map(Transaction::getTrader)
//		    .filter(trader -> trader.getCITY().equals("Cambridge"))
//		    .sorted(Comparator.comparing(Trader::getName))
//		    .collect(Collectors.toList());
//
//		System.out.println(answer4);
//		
//		5. 모든 거래자의 이름을 알파벳 역순으로 정렬해서 반환하시오.
//
//		List<String> answer5 = transactions.stream()
//		    .map(Transaction::getTrader)
//		    .map(Trader::getName)
//		    .distinct()
//		    .sorted(Comparator.reverseOrder())
//		    .collect(Collectors.toList());
//
//		System.out.println(answer5);
//		
//		6. 밀라노에 거래자가 있는가?
//
//		boolean answer6 = transactions.stream()
//		    .anyMatch(t -> t.getTrader().getCITY().equals("Milan"));
//
//		System.out.println(answer6);
//		
//		7. 케임브리지에 거주하는 거래자의 모든 트랜잭션 값을 출력하시오.
//
//		List<Integer> answer7 = transactions.stream()
//		    .filter(t -> t.getTrader().getCITY().equals("Cambridge"))
//		    .map(Transaction::getValue)
//		    .collect(Collectors.toList());
//
//		System.out.println(answer7);
//		
//		8. 전체 트랜잭션 중 최댓값은 얼마인가?
//
//		Integer answer8 = transactions.stream()
//		    .map(Transaction::getValue)
//		    .reduce(0, Integer::max);
//
//		System.out.println(answer8);

	}
}
