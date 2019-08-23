package com.di;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class ListController implements Controller {
	Logger logger = Logger.getLogger(ListController.class);
	private List<String> listBean = null;
	public void setListBean(List<String> listBean) {
		this.listBean = listBean;
	}
	//private BoardLogic boardLogic = null;
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		ModelAndView mav = new ModelAndView("insaList");
		//mav.setViewName("di/insaList");
		mav.addObject("listBean", listBean);
		return mav;
	}

}
