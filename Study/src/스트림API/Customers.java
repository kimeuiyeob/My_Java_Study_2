package 스트림API;

public class Customers /* implements Comparable<Customers> */ {

	String name;
	int age;

	public Customers(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customers [name=" + name + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customers other = (Customers) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	// =====================================================
	// sorted 메서드 조건을 위한 compareTo메서드 구현

//	public int compareTo(Customers customer) {
//		if (this.age > customer.getAge()) {
//			return 1;
//		} else if (this.age == customer.getAge()) {
//			return 0;
//		} else {
//			return -1;
//		}
//	}

	// =====================================================

}
