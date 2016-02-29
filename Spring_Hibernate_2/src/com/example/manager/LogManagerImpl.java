package com.example.manager;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.example.domain.Log;


public class LogManagerImpl extends HibernateDaoSupport implements LogManager {

	public void addLog(Log log) {
		//getSession().save(log);
		getHibernateTemplate().save(log);
	}

}
