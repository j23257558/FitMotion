package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class MemberController extends MultiActionController {
	Logger logger = Logger.getLogger(MemberController.class);
	public MemLogic memLogic = null;
	public void setMemLogic(MemLogic memLogic) {
		this.memLogic = memLogic;
	}

	public void memList3(HttpServletRequest req, HttpServletResponse res) {
		logger.info("memList3 호출 성공 ");
		List<Map<String,Object>> memList = null;
		memList = memLogic.memList();
		req.setAttribute("memList", memList);
		try {
			res.sendRedirect("./memberList.jsp");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		//webcontent경로를 타는 sendredirect 와 forward 
	}
	public void memList2(HttpServletRequest req, HttpServletResponse res) {
		logger.info("memList2 호출 성공 ");
		List<Map<String,Object>> memList = null;
		 memList = memLogic.memList();
		 req.setAttribute("memList", memList);
		 try {
			 RequestDispatcher view = req.getRequestDispatcher("./memberList.jsp");
			 view.forward(req, res);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
		 //model and view 가 없어도 페이지를 이동시킬수 있고 유지시킬수있는 방법이다. 
	}
	
	public ModelAndView memList(HttpServletRequest req, HttpServletResponse res) {
		logger.info("memList 호출 성공 ");
		List<Map<String,Object>> memlist = null;
		//web-inf 는  modelandview를 써야한다 
		ModelAndView mav = new ModelAndView("/member/memberList");
		memlist = memLogic.memList();
		mav.addObject("memberList",memlist);
		return mav;
	}
}
