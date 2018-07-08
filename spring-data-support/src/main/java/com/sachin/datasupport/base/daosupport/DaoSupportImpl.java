package com.sachin.datasupport.base.daosupport;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class DaoSupportImpl extends JdbcDaoSupport {

	public int getCircleCount()
	{
		String query = "SELECT COUNT(*) FROM circle";
		return getJdbcTemplate().queryForObject(query, int.class);
	}
}
