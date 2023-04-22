package 스트림실습;

public class User {

	private String name;
	private String hobby;
	private String introduce;

	public User(String name, String hobby, String introduce) {
		super();
		this.name = name;
		this.hobby = hobby;
		this.introduce = introduce;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

}
