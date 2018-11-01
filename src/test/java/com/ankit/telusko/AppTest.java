package com.ankit.telusko;

/*import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;*/
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest
{
	public static void main(String[] args)
	{
		/*Car obj = new Car();
		obj.drive();*/
		
		/*Bike obj = new Bike();
		obj.drive();*/
		
		/*Vehicle obj = new Car();
		obj.drive();*/
		/*Vehicle obj = new Bike();
		obj.drive();*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Vehicle obj = (Vehicle)context.getBean("vehicle");
		
		/*Tyre t = (Tyre)context.getBean("tyre");
		System.out.println(t);*/
	}
}