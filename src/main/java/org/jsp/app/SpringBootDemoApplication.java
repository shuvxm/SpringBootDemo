package org.jsp.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args)
	{
		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);
//		System.out.println("Hello world");

		Alien obj = context.getBean(Alien.class);
		System.out.println(obj.getAge());
		obj.code();

//		Alien obj2 = context.getBean(Alien.class);
//		obj2.code();
//
//		Matriks m = context.getBean(Matriks.class);
//		m.developer();
	}

}
