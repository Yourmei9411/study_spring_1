package properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("properties.xml");
		
		MyJdbcDataSource myJdbcDataSource = (MyJdbcDataSource) applicationContext.getBean("myDataSource");
		System.out.println(myJdbcDataSource);
	}

}
