package com.di;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class InsaController extends AbstractController {
	Logger logger = Logger.getLogger(InsaController.class);
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		logger.info("insacoller 호출성공");
		/*
		 * ModelAndView는 scope는 request임 
		 * ModelAndView는 forward처리임.
		 * 꺼낼때는 어떻게 꺼내지?
		 * 어디에 담기는 거지?
		 */
		ModelAndView mav = new ModelAndView("helloResult");
		// ==> WEB-INF/view/ 접두어 - page를 찾는데 필요한 접두어 
		// ==> 접미어.jsp
		// 완결 ==> /WEB-INF/view/?.jsp
		//mav.setViewName("di/helloResult");
		List<String> nameList = new ArrayList<>();
		nameList.add("이성계");
		nameList.add("김유신");
		mav.addObject("nameList",nameList);
		
		
		//////////////////////////////////////////////////////////////
		/*
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("com\\di\\listBean.xml"); InsaList insa2 =
		 * (InsaList)context.getBean("insa"); System.out.println(insa2.listBean);
		 * mav.addObject("insacon", "insa"); mav.addObject("insa2",insa2.listBean);
		 */
		return mav;
	}

}
