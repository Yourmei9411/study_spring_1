package scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("scope.xml");
		
/*		Car car1 = (Car) applicationContext.getBean("car1");
		System.out.println(car1);
		
		Car car2 = (Car) applicationContext.getBean("car1");
		System.out.println(car2);
		System.out.println(car1 == car2);*/
		
		Car car3 = (Car) applicationContext.getBean("car2");
		System.out.println(car3);
		
		Car car4 = (Car) applicationContext.getBean("car2");
		System.out.println(car4);
		System.out.println(car3 == car4);
	}

}
