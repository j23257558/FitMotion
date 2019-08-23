package com.di;





import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InsaListMain {
	
	public static void main(String[] args) {
		ApplicationContext context
				= new ClassPathXmlApplicationContext("com\\di\\listBean.xml");
		InsaList li = (InsaList)context.getBean("insa");
		System.out.println(li.listBean);
		
		for(String st:li.listBean) {
			System.out.println(st);
		}
	}

}
