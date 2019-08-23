package com.erp;

import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.dao.DataAccessException;

import com.vo.DeptVO;


public class DeptDao {
	Logger logger = Logger.getLogger(DeptDao.class);
	public SqlSessionTemplate sqlSessionTemplate =null;
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	public void deptInsert(DeptVO dVO) throws DataAccessException{
		logger.info("deptInsert 호출성공");
		dVO = new DeptVO();
		dVO.setDeptno(70);
		dVO.setDname("개발3팀");
		dVO.setLoc("인천");
		sqlSessionTemplate.insert("deptInsert",dVO);
	}
	public void deptUpdate(DeptVO dVO) throws DataAccessException{
		logger.info("deptInsert 호출성공");
		dVO = new DeptVO();
		dVO.setDeptno(70);
		dVO.setDname("개발3팀");
		dVO.setLoc("서울");
		sqlSessionTemplate.update("deptUpdate",dVO);
	}
}
