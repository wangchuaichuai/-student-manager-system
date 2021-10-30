/*
 * 中北大学软件学院 版权所有.
 */
package com.ychs.uolab.department.service;

import com.ychs.uolab.department.dao.DeptDao;
import com.ychs.uolab.department.dao.DeptDaoImpl;
import com.ychs.uolab.department.vo.Dept;
import com.ychs.uolab.department.vo.Major;

/**
 * 院系业务接口的实现类
 * @author 王欣
 * @version 1.0
 */
public class DeptServiceImpl implements DeptService {
	private DeptDao deptDao = new DeptDaoImpl();

	@Override
	public int addDept(Dept dept) {
		int flag = deptDao.insertDept(dept);
		return flag;
	}

	@Override
	public int addMajor(Major major) {
		int flag = deptDao.insertMajor(major);
		return flag;
	}
	
}
