package 스트림실습;

public class Trader {
	private final String name;
	private final String CITY;

	public Trader(String name, String CITY) {
		this.name = name;
		this.CITY = CITY;
	}

	public String getName() {
		return name;
	}

	public String getCITY() {
		return CITY;
	}

	@Override
	public String toString() {
		return "Trader [name=" + name + ", CITY=" + CITY + "]";
	}

}
