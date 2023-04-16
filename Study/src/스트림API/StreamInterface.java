package 스트림API;

public class StreamInterface {
	public static void main(String[] args) {
		
		//Stream  API의 최상위 인터페이스는 BaseStream 인터페이스지만 직접 사용하는 경우는 없다.
		//주로 사용하는 인터페이스는 Stream인터페이스이며 BaseStream을 상속하는 인터페이스이다.
		//Stream 인터페이스는 여러 메소드들을 정의하고 있으며 많은 메소드들의 파라미터에 람다와 메소드 참조가 필요하다.
		//Stream을 구현한 객체의 주요 특징은 불변성이며 Stream을 통해 얻은 결과는 새롭게 생성된 데이터이다.
		
		//		메소드									기능
		//long count()						해당 스트림에 포함된 항목의 수를 반환
		//Stream concat(Stream,Stream)		파라미터로 전달되는 두개의 스트림을 하나의 스트림으로 반환
		//R collect(Collector)				스트림의 항목들을 컬렉션 타입의 객체로 반환
		//Stream filter(Predicate)			스트림의 항목들을 파라미터의 조건에 따라 필터링하고 결과 항목들을 스트림 형태로 변환
		//void forEach(Consumer)			스트림 항목돌에 대한 순회(반복)
		//Optional reduce(BinaryOperator)	람다 표현식을 기반으로 데이터를 소모하고 그 결과를 반환(최종연산)
		//Object[] toArray()				스트림 항목들을 배열 객체로 반환
		//Stream sorted()					스트림 항목들에 대해 정렬하고 이를 스트림 형태로 변환
		
		
	}
}
