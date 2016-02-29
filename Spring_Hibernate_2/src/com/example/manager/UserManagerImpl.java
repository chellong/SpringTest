package com.example.manager;

import java.util.Date;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.example.domain.Log;
import com.example.domain.User;


public class UserManagerImpl extends HibernateDaoSupport implements UserManager {

	private LogManager logManager; 
	
//	public void addUser(User user) {
//			//this.getSession().save(user);
//			this.getHibernateTemplate().save(user);
//		
//			Log log = new Log();
//			log.setType("操作日志");
//			log.setTime(new Date());
//			log.setDetail("XXX");
//			
//			logManager.addLog(log);
//			
//			throw new RuntimeException();
//	}

	public void addUser(User user) 
	throws Exception {
		//this.getSession().save(user);
		this.getHibernateTemplate().save(user);
	
		Log log = new Log();
		log.setType("操作日志");
		log.setTime(new Date());
		log.setDetail("XXX");
		
		logManager.addLog(log);
		
	}
	
	public void setLogManager(LogManager logManager) {
		this.logManager = logManager;
	}

}
