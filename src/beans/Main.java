package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//1.����spring��IOC��������(ʵ����)
		//ApplicationContext�ڳ�ʼ�������ĵ�ʱ���ʵ�������е�����bean.
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2.��IOC�����л�ȡbean��ʵ��
		
		//ȱ�㣺��ioc��������һ������HelloWorld���beanʵ��ʱ�������쳣
		//HelloWorld helloWorld = context.getBean(HelloWorld.class);
		
		HelloWorld helloWorld = (HelloWorld) context.getBean("helloworld");
		
		//3.����hello����
		helloWorld.sayHello();
	}

}
