/*
 * 中北大学软件学院 版权所有.
 */
package com.ychs.uolab.credit.vo;

/**
 * 学分实体
 * @author 王欣
 * @version 1.0
 */
public class Credit {
	private int creditId;
	private int memberId;
	private String stuId;
	private String sname;
	private String grade;
	private String dept;
	private int creditPoints;
	private String subject;
	private String gainDate;
	private String entryPerson;
	private String entryDate;
	private String remark;

	public Credit() {
		super();
	}

	public Credit(int creditId, int memberId, String stuId, String sname, String grade, String dept, int creditPoints,
			String subject, String gainDate, String entryPerson, String entryDate, String remark) {
		super();
		this.creditId = creditId;
		this.memberId = memberId;
		this.stuId = stuId;
		this.sname = sname;
		this.grade = grade;
		this.dept = dept;
		this.creditPoints = creditPoints;
		this.subject = subject;
		this.gainDate = gainDate;
		this.entryPerson = entryPerson;
		this.entryDate = entryDate;
		this.remark = remark;
	}
	/**
	 * @return the creditId
	 */
	public int getCreditId() {
		return creditId;
	}
	/**
	 * @param creditId the creditId to set
	 */
	public void setCreditId(int creditId) {
		this.creditId = creditId;
	}
	/**
	 * @return the memberId
	 */
	public int getMemberId() {
		return memberId;
	}
	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	/**
	 * @return the stuId
	 */
	public String getStuId() {
		return stuId;
	}
	/**
	 * @param stuId the stuId to set
	 */
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	/**
	 * @return the sname
	 */
	public String getSname() {
		return sname;
	}
	/**
	 * @param sname the sname to set
	 */
	public void setSname(String sname) {
		this.sname = sname;
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
	 * @return the dept
	 */
	public String getDept() {
		return dept;
	}
	/**
	 * @param dept the dept to set
	 */
	public void setDept(String dept) {
		this.dept = dept;
	}
	/**
	 * @return the creditPoints
	 */
	public int getCreditPoints() {
		return creditPoints;
	}
	/**
	 * @param creditPoints the creditPoints to set
	 */
	public void setCreditPoints(int creditPoints) {
		this.creditPoints = creditPoints;
	}
	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}
	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}
	/**
	 * @return the gainDate
	 */
	public String getGainDate() {
		return gainDate;
	}
	/**
	 * @param gainDate the gainDate to set
	 */
	public void setGainDate(String gainDate) {
		this.gainDate = gainDate;
	}
	/**
	 * @return the entryPerson
	 */
	public String getEntryPerson() {
		return entryPerson;
	}
	/**
	 * @param entryPerson the entryPerson to set
	 */
	public void setEntryPerson(String entryPerson) {
		this.entryPerson = entryPerson;
	}
	/**
	 * @return the entryDate
	 */
	public String getEntryDate() {
		return entryDate;
	}
	/**
	 * @param entryDate the entryDate to set
	 */
	public void setEntryDate(String entryDate) {
		this.entryDate = entryDate;
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
		return "Credit [creditId=" + creditId + ", memberId=" + memberId + ", stuId=" + stuId + ", sname=" + sname
				+ ", grade=" + grade + ", dept=" + dept + ", creditPoints=" + creditPoints + ", subject=" + subject
				+ ", gainDate=" + gainDate + ", entryPerson=" + entryPerson + ", entryDate=" + entryDate + ", remark="
				+ remark + "]";
	}
	
	
	

}
