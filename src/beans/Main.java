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
		
		User user1 = (User) context.getBean("user1");
		System.out.println(user1);
		
		User caffrey = (User) context.getBean("Caffrey");
		System.out.println(caffrey);
		
		User Ouyang = (User) context.getBean("Ouyang");
		System.out.println(Ouyang);
		
		User OuyangWithCar = (User) context.getBean("OuyangWithCar");
		System.out.println(OuyangWithCar);
		
		Student stu1 = (Student) context.getBean("student1");
		System.out.println(stu1);
		
		BookStroe bookStroe = (BookStroe) context.getBean("bookstore1");
		System.out.println(bookStroe);
		
		DataSource dataSource1 = (DataSource) context.getBean("dataSource1");
		System.out.println(dataSource1);
		
		Student student_Ouyang = (Student) context.getBean("student_Ouyang");
		System.out.println(student_Ouyang);
	}

}
