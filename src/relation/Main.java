package relation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-relation.xml");
		
		Address address1 = (Address) applicationContext.getBean("address1");
		System.out.println(address1);
		
		Address address2 = (Address) applicationContext.getBean("address2");
		System.out.println(address2);
		
		Address address3 = (Address) applicationContext.getBean("address3");
		System.out.println(address3);
		
		//����bean�����Ա�ʵ����
		/*Address address_abstract = (Address) applicationContext.getBean("address_abstract");
		System.out.println(address_abstract);*/
	}

}
