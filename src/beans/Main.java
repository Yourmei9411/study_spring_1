package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//1.创建spring的IOC容器对象
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2.从IOC容器中获取bean的实例
		HelloWorld helloWorld = (HelloWorld) context.getBean("helloworld");
		
		//3.调用hello方法
		helloWorld.sayHello();
	}

}
