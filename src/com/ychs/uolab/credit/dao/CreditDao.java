/*
 * 中北大学软件学院 版权所有.
 */
package com.ychs.uolab.credit.dao;

import java.util.List;

import com.ychs.uolab.credit.vo.Credit;

/**
 * @author 王欣
 * @version 1.0
 */
public interface CreditDao {
	/**
	 * 录入学分
	 * 
	 * @param credit 学分对象
	 * @return 录入成功返回1，否则返回0
	 */
	public int insertCredit(Credit credit);

	/**
	 * 查询学分
	 * 
	 * @param stuId     学号
	 * @param sName     姓名
	 * @param entryDate 获得时间
	 * @return 返回结果集
	 */
	public List<Credit> selectCredit(String stuId, String sName, String entryDate);

}
