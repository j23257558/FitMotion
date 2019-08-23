package com.di;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.sun.istack.internal.logging.Logger;

public class HelloController extends AbstractController {
	Logger logger = Logger.getLogger(HelloController.class);

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		logger.info("handleRequestInternal 호출성공");
		ModelAndView mav = new ModelAndView("index");
		 ApplicationContext context = 
	             new ClassPathXmlApplicationContext
	                         ("com\\di\\helloBean.xml");
	       HelloBean helloBean2 = (HelloBean)context.getBean("helloBean");
	       System.out.println(helloBean2.getGreeting("Hi~~~"));
	       mav.addObject("min", "minji");
	       mav.addObject(helloBean2.toString());
		return mav;
	}

}
