package com.example.domain;

import java.util.Date;

public class Log {

	private int id;
	
	//��־�����־һ����һ�����ɷ�����
	//������־����ȫ��־���¼���־
	private String type;
	
	private String detail;
	
	private Date time;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}
}
