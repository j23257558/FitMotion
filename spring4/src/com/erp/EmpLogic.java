package com.erp;


import org.apache.log4j.Logger;

import com.vo.EmpVO;

public class EmpLogic {
	Logger logger = Logger.getLogger(EmpLogic.class);
	public EmpDao empDao =null;
	public DeptDao deptDao = null;
	public void setEmpDao(EmpDao empDao) {
		this.empDao = empDao;
	}
	public void setDeptDao(DeptDao deptDao) {
		this.deptDao = deptDao;
	}
	public void doEmp(EmpVO eVO) {
		logger.info("doemp logic 호출성공");
		try {
			deptDao.deptInsert(null);
			deptDao.deptUpdate(null);
			empDao.empInsert(null);
			
		} catch (Exception e) {
			throw e;
		}
	}

	


}
