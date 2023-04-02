package 제네릭클래스_인터페이스의문법;

public class 제네릭클래스2 {

	public static void main(String[] args) {

		// 이렇게 제네릭을 계속 늘릴수도 있고 나중에 객체 생성할때 타입을 지정해줄수있다.
		KeyValue<String, Integer> keyVal = new KeyValue<>();
		keyVal.setKey("나는키야"); // 그러면 키는 스트링으로 받게되고
		keyVal.setValue(300); // 발류는 인트로 받는다.
		System.out.println(keyVal.getKey() + " " + keyVal.getValue());

	}

}

class KeyValue<K, V> {
	private K key;
	private V value;

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

}
