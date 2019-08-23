package com.test;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;

public class MemberDao {
	Logger logger = Logger.getLogger(MemberDao.class);
	public SqlSessionTemplate SqlSessionTemplate = null;

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		SqlSessionTemplate = sqlSessionTemplate;
	}

	public List<Map<String, Object>> memberList() {
		logger.info("memberlist메소드 호출성공");
		List<Map<String,Object>> memList = null;
		memList = SqlSessionTemplate.selectList("memberList");
		return memList;
	}
	
}
