package com.erp;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.vo.EmpVO;

public class EmpController extends MultiActionController {
	Logger logger = Logger.getLogger(EmpController.class);
	public EmpLogic empLogic = null;
	//setter 메소드의 부재 
	public void setEmpLogic(EmpLogic empLogic) {
		this.empLogic = empLogic;
	}

	public String doEmp(HttpServletRequest req, HttpServletResponse res) {
		logger.info("doEmp호출 성공");
		EmpVO eVO = new EmpVO();
		empLogic.doEmp(eVO);
		return "redirect:empInsertOK.jsp";
	}

	
	//모델앤뷰를 쓴게아니기떄문에 뒤에 접미어를 붙혀줘야댐. 
	//spring -servlet.xml에 있는 viewresolver를 타지못한다. 
	/*
	 * public ModelAndView empList(HttpServletRequest req, HttpServletResponse res)
	 * { logger.info("empList호출성공"); List<Map<String,Object>> empList = null;
	 * ModelAndView mav = new ModelAndView("/erp/empList"); empList =
	 * empLogic.empList(); mav.addObject("empList",empList); return mav;
	 * 
	 * 
	 * }
	 */
}
