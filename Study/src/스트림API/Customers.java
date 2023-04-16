package ½ºÆ®¸²API;

public class Customers implements Comparable<Customers> {

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

//	=====================================================
	public int compareTo(Customers customer) {
		if (this.age > customer.getAge()) {
			return 1;
		} else if (this.age == customer.getAge()) {
			return 0;
		} else {
			return -1;
		}
	}
//	=====================================================
}
