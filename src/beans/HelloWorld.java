package beans;

public class HelloWorld {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HelloWorld(String name) {
		super();
		this.name = name;
	}

	public HelloWorld() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void sayHello()
	{
		System.out.println("Hello " + name);
	}
}
