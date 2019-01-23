package beancycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beancycle.xml");
		
		Car car = (Car) applicationContext.getBean("car");
		System.out.println(car);
		
		applicationContext.close();
	}

}
