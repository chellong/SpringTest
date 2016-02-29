package com.example.manager;

import com.example.domain.Log;
import com.example.utils.HibernateUtils;

public class LogManagerImpl implements LogManager {

	public void addLog(Log log) {
		HibernateUtils.getSessionFactory().getCurrentSession().save(log);
	}

}
