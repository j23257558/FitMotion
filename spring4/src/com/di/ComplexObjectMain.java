package com.di;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComplexObjectMain {

	public static void main(String[] args) {
		ApplicationContext context
				=new ClassPathXmlApplicationContext("com\\di\\mapBean.xml");
		ComplexObject co = (ComplexObject)context.getBean("moreComplexObject");
		Map<String,Object> rmap = co.someMap;
		Object keys[] = rmap.keySet().toArray();
		for(int i=0; i<keys.length;i++) {
			System.out.println(keys[i]);
			System.out.println(""+rmap.get(keys[i]));
		}
		System.out.println(co.someMap);
	
	}

}
