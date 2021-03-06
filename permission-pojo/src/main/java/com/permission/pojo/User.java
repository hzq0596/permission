package com.permission.pojo;

import java.util.Date;

/**
 * 
 * @author milanyangbo
 *
 */
public class User {

	public User() {
		this.id= 0;
		this.account= "";
		this.password= "";
		this.name= "";
		this.sex= 0;
		this.status= 0;
		this.type= 0;
		this.bizcode= "";
		this.createtime= new Date(System.currentTimeMillis());
		this.createid= 0;
	}

	private int id;

	private String account;

	private String password;

	private String name;

	private int sex;

	private int status;

	private int type;

	private String bizcode;

	private Date createtime;

	private int createid;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account == null ? null : account.trim();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getBizcode() {
		return bizcode;
	}

	public void setBizcode(String bizcode) {
		this.bizcode = bizcode == null ? null : bizcode.trim();
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public int getCreateid() {
		return createid;
	}

	public void setCreateid(int createid) {
		this.createid = createid;
	}
}