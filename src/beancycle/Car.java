package beancycle;

public class Car {

	private String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		System.out.println("set car brand :" + brand);
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + "]";
	}

	public Car() {
		super();
		System.out.println("Car constructor");
		// TODO Auto-generated constructor stub
	}
	
	private void init() {
		// TODO Auto-generated method stub
		System.out.println("Car init");
	}
	
	private void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Car destroy");
	}
}
