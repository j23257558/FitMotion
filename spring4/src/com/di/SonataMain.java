package com.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SonataMain {

	public static void main(String[] args) {
		   ApplicationContext context = 
		             new ClassPathXmlApplicationContext
		                         ("com\\di\\sonataBean.xml");
		   
		   Sonata sonata = (Sonata)context.getBean("myCar");
		   System.out.println(sonata.toString3());
		   System.out.println("====================================");
		   
		   sonata = (Sonata)context.getBean("himCar");
		   System.out.println(sonata.toString2());
		   System.out.println("====================================");
		   
		   ApplicationContext context2 = 
		             new ClassPathXmlApplicationContext
		                         ("com\\di\\sonataBean.xml");
		   Sonata sonata2 = (Sonata)context.getBean("herCar");
		   System.out.println(sonata2.toString());
		   

	}

}
