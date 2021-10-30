/*
 * 中北大学软件学院 版权所有.
 */
package com.ychs.uolab.openclass.vo;

/**
 * 公开课实体
 * 
 * @author 王欣
 * @version 1.0
 */

public class Openclass {
	private int cid;
	private String courseDate;
	private String special;
	private String speaker;
	private String organizer;
	private String site;
	private String groupshow;
	private String way;
	private int credit;
	private int num;
	private String remark;

	public Openclass() {
		super();
	}

	/**
	 * @param cid        课程编号
	 * @param courseDate 日期
	 * @param special    技术专题
	 * @param speaker    主讲人
	 * @param organizer  组织人
	 * @param site       地点
	 * @param groupshow  群体说明
	 * @param way        方式
	 * @param credit     创新学分
	 * @param num        参加人数
	 * @param remark     备注
	 */
	public Openclass(int cid, String courseDate, String special, String speaker, String organizer, String site,
			String groupshow, String way, int credit, int num, String remark) {
		super();
		this.cid = cid;
		this.courseDate = courseDate;
		this.special = special;
		this.speaker = speaker;
		this.organizer = organizer;
		this.site = site;
		this.groupshow = groupshow;
		this.way = way;
		this.credit = credit;
		this.num = num;
		this.remark = remark;
	}

	/**
	 * @return the cid
	 */
	public int getCid() {
		return cid;
	}

	/**
	 * @param cid the cid to set
	 */
	public void setCid(int cid) {
		this.cid = cid;
	}

	/**
	 * @return the courseDate
	 */
	public String getCourseDate() {
		return courseDate;
	}

	/**
	 * @param courseDate the courseDate to set
	 */
	public void setCourseDate(String courseDate) {
		this.courseDate = courseDate;
	}

	/**
	 * @return the special
	 */
	public String getSpecial() {
		return special;
	}

	/**
	 * @param special the special to set
	 */
	public void setSpecial(String special) {
		this.special = special;
	}

	/**
	 * @return the speaker
	 */
	public String getSpeaker() {
		return speaker;
	}

	/**
	 * @param speaker the speaker to set
	 */
	public void setSpeaker(String speaker) {
		this.speaker = speaker;
	}

	/**
	 * @return the organizer
	 */
	public String getOrganizer() {
		return organizer;
	}

	/**
	 * @param organizer the organizer to set
	 */
	public void setOrganizer(String organizer) {
		this.organizer = organizer;
	}

	/**
	 * @return the site
	 */
	public String getSite() {
		return site;
	}

	/**
	 * @param site the site to set
	 */
	public void setSite(String site) {
		this.site = site;
	}

	/**
	 * @return the groupshow
	 */
	public String getGroupshow() {
		return groupshow;
	}

	/**
	 * @param groupshow the groupshow to set
	 */
	public void setGroupshow(String groupshow) {
		this.groupshow = groupshow;
	}

	/**
	 * @return the way
	 */
	public String getWay() {
		return way;
	}

	/**
	 * @param way the way to set
	 */
	public void setWay(String way) {
		this.way = way;
	}

	/**
	 * @return the credit
	 */
	public int getCredit() {
		return credit;
	}

	/**
	 * @param credit the credit to set
	 */
	public void setCredit(int credit) {
		this.credit = credit;
	}

	/**
	 * @return the num
	 */
	public int getNum() {
		return num;
	}

	/**
	 * @param num the num to set
	 */
	public void setNum(int num) {
		this.num = num;
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
		return "Openclass [cid=" + cid + ", courseDate=" + courseDate + ", special=" + special + ", speaker=" + speaker
				+ ", organizer=" + organizer + ", site=" + site + ", groupshow=" + groupshow + ", way=" + way
				+ ", credit=" + credit + ", num=" + num + ", remark=" + remark + "]";
	}

}
