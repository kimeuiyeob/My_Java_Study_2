package practice1;

public class Car {

	private String brandName;
	private int fuelStatus;

	public Car(String brandName, int fuelStatus) {
		super();
		this.brandName = brandName;
		this.fuelStatus = fuelStatus;
	}

	public String getBrandName() {
		return brandName;
	}

	public int getFuelStatus() {
		return fuelStatus;
	}

	public void setFuelStatus(int fuelStatus) {
		this.fuelStatus = fuelStatus;
	}

	public void go50Km(int km) {
		this.fuelStatus = fuelStatus - 10;
	}

	public static void main(String[] args) {

		Car c = new Car("람보르기니", 200);
		System.out.println(c.getBrandName());

		c.setFuelStatus(c.getFuelStatus() - 20); // 이렇게 하면 안됨!
		System.out.println(c.getFuelStatus());

		c.go50Km(50); // 내부적으로 메서드 생성 50Km달릴시 10L터 기름 사용 이런식으로!
		System.out.println(c.getFuelStatus());

	}

}
