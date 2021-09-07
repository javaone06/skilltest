package com.prime.springboot.model;

import java.util.Date;

public class Employee {

	private int id;
	private boolean managerFlag;
	private String name;
	private Date dateHired;
	private boolean partTime;
	
	public Employee() {}
	
	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return this.id;
	}
	
	public void setManagerFlag(boolean b) {
		this.managerFlag=b;
	}

	public boolean getManagerFlag() {
		return this.managerFlag;
	}
	
	public void setName(String name) {
		this.name=name;
	}

	public String getName() {
		return this.name;
	}
	
	public void setDateHired(Date d) {
		this.dateHired=d;
	}
	
	public Date getDateHired() {
		return this.dateHired;
	}
	
	public void setPartTime(boolean b) {
		this.partTime=b;
	}

	public boolean getPartTime() {
		return this.partTime;
	}
}
