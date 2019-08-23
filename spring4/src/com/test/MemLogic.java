package com.test;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

public class MemLogic {
	Logger logger = Logger.getLogger(MemLogic.class);
	public MemberDao memberDao = null;

	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	public List<Map<String, Object>> memList() {
		List<Map<String, Object>> memlist = null;
		memlist = memberDao.memberList();
		
		return memlist;
	}


}
