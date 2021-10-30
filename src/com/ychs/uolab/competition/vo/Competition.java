/*
 * 中北大学软件学院 版权所有.
 */
package com.ychs.uolab.competition.vo;



/**
 * 比赛实体
 * 
 * @author 王欣
 * @version 1.0
 */
public class Competition {
	private int cid;
	private String categories;
	private String year;
	private String topic;
	private String groupleader;
	private String groupmember;
	private String award;
	private String adviser;
	private String remark;

	public Competition() {
		super();
	}

	/**
	 * @param cid         竟赛编号
	 * @param categories  竞赛类别
	 * @param year        年度
	 * @param topic       主题
	 * @param groupleader 组长
	 * @param groupmember 组员
	 * @param award       获奖等级
	 * @param adviser     指导老师
	 * @param remark      备注
	 */
	public Competition(int cid, String categories, String year, String topic, String groupleader, String groupmember,
			String award, String adviser, String remark) {
		super();
		this.cid = cid;
		this.categories = categories;
		this.year = year;
		this.topic = topic;
		this.groupleader = groupleader;
		this.groupmember = groupmember;
		this.award = award;
		this.adviser = adviser;
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
	 * @return the categories
	 */
	public String getCategories() {
		return categories;
	}

	/**
	 * @param categories the categories to set
	 */
	public void setCategories(String categories) {
		this.categories = categories;
	}

	/**
	 * @return the year
	 */
	public String getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(String year) {
		this.year = year;
	}

	/**
	 * @return the topic
	 */
	public String getTopic() {
		return topic;
	}

	/**
	 * @param topic the topic to set
	 */
	public void setTopic(String topic) {
		this.topic = topic;
	}

	/**
	 * @return the groupleader
	 */
	public String getGroupleader() {
		return groupleader;
	}

	/**
	 * @param groupleader the groupleader to set
	 */
	public void setGroupleader(String groupleader) {
		this.groupleader = groupleader;
	}

	/**
	 * @return the groupmember
	 */
	public String getGroupmember() {
		return groupmember;
	}

	/**
	 * @param groupmember the groupmember to set
	 */
	public void setGroupmember(String groupmember) {
		this.groupmember = groupmember;
	}

	/**
	 * @return the award
	 */
	public String getAward() {
		return award;
	}

	/**
	 * @param award the award to set
	 */
	public void setAward(String award) {
		this.award = award;
	}

	/**
	 * @return the adviser
	 */
	public String getAdviser() {
		return adviser;
	}

	/**
	 * @param adviser the adviser to set
	 */
	public void setAdviser(String adviser) {
		this.adviser = adviser;
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
		return "Competition [cid=" + cid + ", categories=" + categories + ", year=" + year + ", topic=" + topic
				+ ", groupleader=" + groupleader + ", groupmember=" + groupmember + ", award=" + award + ", adviser="
				+ adviser + ", remark=" + remark + "]";
	}

}
