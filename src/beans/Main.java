package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//1.����spring��IOC��������
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2.��IOC�����л�ȡbean��ʵ��
		HelloWorld helloWorld = (HelloWorld) context.getBean("helloworld");
		
		//3.����hello����
		helloWorld.sayHello();
	}

}
