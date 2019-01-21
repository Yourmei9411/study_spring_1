package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//1.创建spring的IOC容器对象(实例化)
		//ApplicationContext在初始化上下文的时候就实例化所有单例的bean.
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2.从IOC容器中获取bean的实例
		
		//缺点：当ioc容器中有一个以上HelloWorld类的bean实例时，则发生异常
		//HelloWorld helloWorld = context.getBean(HelloWorld.class);
		
		HelloWorld helloWorld = (HelloWorld) context.getBean("helloworld");
		
		//3.调用hello方法
		helloWorld.sayHello();
	}

}
