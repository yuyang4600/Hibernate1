package com.cx.domain;

import java.util.Date;

/*
 * ���л�Ŀ���ǿ���Ψһ�ı�ʶ�ö���ͬʱ������������ļ�����
 */
public class Employee implements java.io.Serializable {
	
	private static final long serialversionUID = 1L; 
	
	private Integer id;
	private String name;
	private String email;
	private Date Hiredate;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getHiredate() {
		return Hiredate;
	}
	public void setHiredate(Date hiredate) {
		Hiredate = hiredate;
	}
}
