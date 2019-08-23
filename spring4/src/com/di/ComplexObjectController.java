package com.di;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class ComplexObjectController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		ModelAndView mav = new ModelAndView("ComplexObject");
		Map<String,Object> namemap = new HashMap<>();
		ApplicationContext context
		=new ClassPathXmlApplicationContext("com\\di\\mapBean.xml");
		ComplexObject co = (ComplexObject)context.getBean("moreComplexObject");
		mav.addObject("map",co.someMap);
		return mav;
	}



}
