/*
 * 中北大学软件学院 版权所有.
 */
package com.ychs.uolab.department.dao;

import com.ychs.uolab.department.vo.Dept;
import com.ychs.uolab.department.vo.Major;

/**
 * 院系管理
 * @author 王欣
 * @version 1.0
 */
public interface DeptDao {
	/**
	 * 修改院系
	 * @param dept 学院
	 * @return 修改成功返回1，否则返回0
	 */
	public int insertDept(Dept dept);
	/**
	 * 添加专业
	 * @param major 专业对象
	 * @return 添加成功返回1，否则返回0
	 */
	public int insertMajor(Major major);
}
