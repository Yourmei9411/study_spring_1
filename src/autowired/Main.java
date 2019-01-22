package autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("autowired.xml");
		
		Person person1 = (Person) applicationContext.getBean("person1");
		System.out.println(person1);
	}

}
