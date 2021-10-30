/*
 * 中北大学软件学院 版权所有.
 */
package com.ychs.uolab.department.vo;

/**
 * @author 王欣
 * @version 1.0
 */
public class Major {
	private int majorid;
	private String majorName;
	private int did;
	private String remark;

	public Major() {
		super();
	}

	public Major(int majorid, String majorName, int did, String remark) {
		super();
		this.majorid = majorid;
		this.majorName = majorName;
		this.did = did;
		this.remark = remark;
	}

	/**
	 * @return the majorid
	 */
	public int getMajorid() {
		return majorid;
	}

	/**
	 * @param majorid the majorid to set
	 */
	public void setMajorid(int majorid) {
		this.majorid = majorid;
	}

	/**
	 * @return the majorName
	 */
	public String getMajorName() {
		return majorName;
	}

	/**
	 * @param majorName the majorName to set
	 */
	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}

	/**
	 * @return the did
	 */
	public int getDid() {
		return did;
	}

	/**
	 * @param did the did to set
	 */
	public void setDid(int did) {
		this.did = did;
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
		return "Major [majorid=" + majorid + ", majorName=" + majorName + ", did=" + did + ", remark=" + remark + "]";
	}

}
