/*
 * 中北大学软件学院 版权所有.
 */
package com.ychs.uolab.openclass.service;

import java.util.List;

import com.ychs.uolab.openclass.vo.Openclass;

/**
 *
 * @author 王欣
 * @version 1.0
 */
public interface OpenclassService {
	/**
	 * 添加公开课
	 * 
	 * @param openclass 公开课对象
	 * @return 成功返回1，否则返回0
	 */
	public int addOpenclass(Openclass openclass);

	/**
	 * 查找公开课
	 * 
	 * @param courseDate 日期
	 * @param dname      院系
	 * @param grade      年级
	 * @param major      专业
	 * @return 返回结果集
	 */
	public List<Openclass> findOpenclass(String courseDate, String dname, String grade, String major);

}
