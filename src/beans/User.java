package beans;

public class User {
	
	private String userName;
	private int userNumber;
	private String email;
	private int age;
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userNumber=" + userNumber + ", email=" + email + ", age=" + age + "]";
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public User(String userName, int userNumber, String email, int age) {
		super();
		this.userName = userName;
		this.userNumber = userNumber;
		this.email = email;
		this.age = age;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
}
