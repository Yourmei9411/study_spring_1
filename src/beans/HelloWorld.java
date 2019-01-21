package beans;

public class HelloWorld {

	private String name;

	public String getName() {
		return name;
	}

	public void setName2(String name) {
		System.out.println("setting name :" + name);
		this.name = name;
	}

	public HelloWorld(String name) {
		super();
		this.name = name;
	}

	public HelloWorld() {
		super();
		System.out.println("constructor for HelloWorld");
		// TODO Auto-generated constructor stub
	}
	
	public void sayHello()
	{
		System.out.println("Hello " + name);
	}
}
