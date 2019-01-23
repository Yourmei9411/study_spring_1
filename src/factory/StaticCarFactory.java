package factory;

import java.util.HashMap;
import java.util.Map;

public class StaticCarFactory {
	
	private static Map<String, Car> cars=null;
	
	static {
		cars = new HashMap<>();
		cars.put("Changan", new Car("Changan", 200000));
		cars.put("Audi", new Car("Audi", 600000));
	}
	
	private static Car getCar(String name)
	{
		return cars.get(name);
	}
	
}
