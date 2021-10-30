/*
 * 中北大学软件学院 版权所有.
 */
package com.ychs.uolab.department.vo;

/**
 * 院系类
 * 
 * @author 王欣
 * @version 1.0
 */
public class Dept {
	private int did;
	private String dname;
	private String remark;

	public Dept() {
		super();
	}

	public Dept(int did, String dname, String remark) {
		super();
		this.did = did;
		this.dname = dname;
		this.remark = remark;
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
		return "Dept [did=" + did + ", dname=" + dname + ", remark=" + remark + "]";
	}

}
