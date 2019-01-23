package factory;

import java.util.HashMap;
import java.util.Map;

public class InstanceCarFactory {

	private Map<String, Car> cars = null;

	public InstanceCarFactory() {
		
		cars = new HashMap<>();
		
		cars.put("Benz", new Car("Benz", 700000));
		cars.put("dazhong", new Car("dazhong", 150000));
	}
	
	public Car getCar(String name)
	{
		return cars.get(name);
	}
	
}
