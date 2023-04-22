package 스트림실습;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UserStream {

	public static void main(String[] args) {

		List<User> userList = new ArrayList<>();

		userList.add(new User("김프로", "축구:농구:야구", "구기종목 좋아요"));
		userList.add(new User("정프로", "개발:당구:축구", "개발하는데 뛰긴 싫어"));
		userList.add(new User("앙몬드", "피아노", "죠르디가 좋아요 좋아좋아너무좋아"));
		userList.add(new User("죠르디", "스포츠댄스:개발", "개발하는 죠르디 좋아"));
		userList.add(new User("박프로", "골프:야구", "운동이 좋아요"));
		userList.add(new User("정프로", "개발:축구:농구", "개발도 좋고 운동도 좋아"));

		// 축구를 좋아하는 사람이 몇명인지
//		Stream<User> streamUser = userList.stream();
//		long howManyPeopleLikeSoccer = streamUser.filter(i -> i.getHobby().contains("축구")).count();
//		System.out.println(howManyPeopleLikeSoccer);

		// 정씨 성을 가진 사람의 취미가 뭔지
//		Stream<User> StreamUser1 = userList.stream();
//		StreamUser1.filter(i -> i.getName().charAt(0) == '정').forEach(i -> System.out.println(i.getHobby()));

		// 위와 같은 데이터를 조회하여 소개 내용에 좋아를 가진 사람이 누구인지
//		Stream<User> StreamUser2 = userList.stream();
//		StreamUser2.filter(i -> i.getIntroduce().contains("좋아")).forEach(i -> System.out.println(i.getName()));

	}

}
