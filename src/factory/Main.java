package factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("factory.xml");
		
		Car car1 = (Car) applicationContext.getBean("Car1");
		System.out.println(car1);
		
		Car car2 = (Car) applicationContext.getBean("Car2");
		System.out.println(car2);
	}

}
