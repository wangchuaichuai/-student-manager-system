/*
 * 中北大学软件学院 版权所有.
 */
package com.ychs.uolab.labmember.vo;

/**
 * 成员实体类 Labmember
 * 
 * @author 王欣
 * @version 1.0
 */
public class Labmember {
	private int memberid;
	private String stuname;
	private int cno;
	private String sex;
	private String grade;
	private String telephone;
	private String stuid;
	private String campuspost;
	private String joiningdate;
	private String status;
	private String labjob;
	private String remark;
	private String nativeplace;
	private String email;

	public Labmember() {
		super();
	}

	public Labmember(int memberid, int cno, String stuname, String stuid, String sex, String grade, String nativeplace,
			String telephone, String email, String campuspost, String joiningdate, String status, String labjob,
			String remark) {
		super();
		this.memberid = memberid;
		this.stuname = stuname;
		this.cno = cno;
		this.sex = sex;
		this.grade = grade;
		this.telephone = telephone;
		this.stuid = stuid;
		this.campuspost = campuspost;
		this.joiningdate = joiningdate;
		this.status = status;
		this.labjob = labjob;
		this.remark = remark;
		this.nativeplace = nativeplace;
		this.email = email;
	}

	/**
	 * @return the memberid
	 */
	public int getMemberid() {
		return memberid;
	}

	/**
	 * @param memberid the memberid to set
	 */
	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}

	/**
	 * @return the stuname
	 */
	public String getStuname() {
		return stuname;
	}

	/**
	 * @param stuname the stuname to set
	 */
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}

	/**
	 * @return the cno
	 */
	public int getCno() {
		return cno;
	}

	/**
	 * @param cno the cno to set
	 */
	public void setCno(int cno) {
		this.cno = cno;
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
	 * @return the stuid
	 */
	public String getStuid() {
		return stuid;
	}

	/**
	 * @param stuid the stuid to set
	 */
	public void setStuid(String stuid) {
		this.stuid = stuid;
	}

	/**
	 * @return the campuspost
	 */
	public String getCampuspost() {
		return campuspost;
	}

	/**
	 * @param campuspost the campuspost to set
	 */
	public void setCampuspost(String campuspost) {
		this.campuspost = campuspost;
	}

	/**
	 * @return the joiningdate
	 */
	public String getJoiningdate() {
		return joiningdate;
	}

	/**
	 * @param joiningdate the joiningdate to set
	 */
	public void setJoiningdate(String joiningdate) {
		this.joiningdate = joiningdate;
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
	 * @return the labjob
	 */
	public String getLabjob() {
		return labjob;
	}

	/**
	 * @param labjob the labjob to set
	 */
	public void setLabjob(String labjob) {
		this.labjob = labjob;
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

	/**
	 * @return the nativeplace
	 */
	public String getNativeplace() {
		return nativeplace;
	}

	/**
	 * @param nativeplace the nativeplace to set
	 */
	public void setNativeplace(String nativeplace) {
		this.nativeplace = nativeplace;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Labmember [memberid=" + memberid + ", stuname=" + stuname + ", cno=" + cno + ", sex=" + sex + ", grade="
				+ grade + ", telephone=" + telephone + ", stuid=" + stuid + ", campuspost=" + campuspost
				+ ", joiningdate=" + joiningdate + ", status=" + status + ", labjob=" + labjob + ", remark=" + remark
				+ ", nativeplace=" + nativeplace + ", email=" + email + "]";
	}

}
