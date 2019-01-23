package factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("factory-bean.xml");
		
		Car car = (Car) applicationContext.getBean("car");
		System.out.println(car);
	}

}
