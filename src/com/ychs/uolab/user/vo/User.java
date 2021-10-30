/*
 * 中北大学软件学院 版权所有.
 */
package com.ychs.uolab.user.vo;

/**
 * 用户实体类User
 * 
 * @author 王欣
 * @version 1.0
 */
public class User {
	private int uid;
	private String username;
	private String password;
	private String realname;
	private String sex;
	private String telephone;
	private String dname;
	private String marjorname;
	private String cname;
	private String grade;
	private String duty;
	private String qq;
	private String status;
	private String remark;

	/**
	 * 
	 */
	public User() {
		super();
	}

	public User(int uid, String username, String password, String realname, String sex, String telephone, String dname,
			String marjorname, String cname, String grade, String duty, String qq, String status, String remark) {
		super();
		this.uid = uid;
		this.username = username;
		this.password = password;
		this.realname = realname;
		this.sex = sex;
		this.telephone = telephone;
		this.dname = dname;
		this.marjorname = marjorname;
		this.cname = cname;
		this.grade = grade;
		this.duty = duty;
		this.qq = qq;
		this.status = status;
		this.remark = remark;
	}

	/**
	 * @return the uid
	 */
	public int getUid() {
		return uid;
	}

	/**
	 * @param uid the uid to set
	 */
	public void setUid(int uid) {
		this.uid = uid;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the realname
	 */
	public String getRealname() {
		return realname;
	}

	/**
	 * @param realname the realname to set
	 */
	public void setRealname(String realname) {
		this.realname = realname;
	}

	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	/**
	 * @return the dname
	 */
	public String getDname() {
		return dname;
	}

	/**
	 * @param dname the dname to set
	 */
	public void setDname(String dname) {
		this.dname = dname;
	}

	/**
	 * @return the marjorname
	 */
	public String getMarjorname() {
		return marjorname;
	}

	/**
	 * @param marjorname the marjorname to set
	 */
	public void setMarjorname(String marjorname) {
		this.marjorname = marjorname;
	}

	/**
	 * @return the cname
	 */
	public String getCname() {
		return cname;
	}

	/**
	 * @param cname the cname to set
	 */
	public void setCname(String cname) {
		this.cname = cname;
	}

	/**
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}

	/**
	 * @return the duty
	 */
	public String getDuty() {
		return duty;
	}

	/**
	 * @param duty the duty to set
	 */
	public void setDuty(String duty) {
		this.duty = duty;
	}

	/**
	 * @return the qq
	 */
	public String getQq() {
		return qq;
	}

	/**
	 * @param qq the qq to set
	 */
	public void setQq(String qq) {
		this.qq = qq;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", password=" + password + ", realname=" + realname
				+ ", sex=" + sex + ", telephone=" + telephone + ", dname=" + dname + ", marjorname=" + marjorname
				+ ", cname=" + cname + ", grade=" + grade + ", duty=" + duty + ", qq=" + qq + ", status=" + status
				+ ", remark=" + remark + "]";
	}

}
