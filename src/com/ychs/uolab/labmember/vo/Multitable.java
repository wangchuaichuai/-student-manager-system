/*
 * 中北大学软件学院 版权所有.
 */
package com.ychs.uolab.labmember.vo;

/**
 * 
 * @author 王欣
 * @version 1.0
 */
public class Multitable {
	private String stuname;
	private String grade;
	private String telephone;
	private String dname;
	private String majorname;
	private String status;
	private String campuspost;
	private String labjob;

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
	 * @return the majorname
	 */
	public String getMajorname() {
		return majorname;
	}

	/**
	 * @param majorname the majorname to set
	 */
	public void setMajorname(String majorname) {
		this.majorname = majorname;
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

	public Multitable() {
		super();
	}

	public Multitable(String stuname, String grade, String telephone, String dname, String majorname, String status,
			String campuspost, String labjob) {
		super();
		this.stuname = stuname;
		this.grade = grade;
		this.telephone = telephone;
		this.dname = dname;
		this.majorname = majorname;
		this.status = status;
		this.campuspost = campuspost;
		this.labjob = labjob;
	}

	@Override
	public String toString() {
		return "Multitable [stuname=" + stuname + ", grade=" + grade + ", telephone=" + telephone + ", dname=" + dname
				+ ", majorname=" + majorname + ", status=" + status + ", campuspost=" + campuspost + ", labjob="
				+ labjob + "]";
	}

}
