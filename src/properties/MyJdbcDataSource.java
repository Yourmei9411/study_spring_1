package properties;

public class MyJdbcDataSource {

	private String username;
	private String password;
	private String url;
	private String driver;
	
	@Override
	public String toString() {
		return "MyJdbcDataSource [username=" + username + ", password=" + password + ", url=" + url + ", driver="
				+ driver + "]";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
}
