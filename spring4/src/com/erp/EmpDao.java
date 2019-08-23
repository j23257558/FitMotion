package com.erp;

import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.dao.DataAccessException;

import com.vo.EmpVO;

public class EmpDao {
	Logger logger = Logger.getLogger(EmpDao.class);
	public SqlSessionTemplate sqlSessionTemplate =null;
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	public void empInsert(EmpVO eVO) throws DataAccessException{
		logger.info("empInsert 호출성공");
		eVO = new EmpVO();
		eVO.setEmpno(9003);
		eVO.setEname("김유신");
		eVO.setDeptno(70);
		sqlSessionTemplate.insert("empInsert",eVO);
	}
}
