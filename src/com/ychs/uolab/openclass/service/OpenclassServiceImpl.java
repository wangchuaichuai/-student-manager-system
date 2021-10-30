/*
 * 中北大学软件学院 版权所有.
 */
package com.ychs.uolab.openclass.service;

import java.util.List;

import com.ychs.uolab.openclass.dao.OpenclassDao;
import com.ychs.uolab.openclass.dao.OpenclassDaoImpl;
import com.ychs.uolab.openclass.vo.Openclass;

/**
 *
 * @author 王欣
 * @version 1.0
 */
public class OpenclassServiceImpl implements OpenclassService {
	private OpenclassDao OpenclassDao = new OpenclassDaoImpl();

	@Override
	public int addOpenclass(Openclass openclass) {
		int count = OpenclassDao.insertOpenclass(openclass);
		return count;
	}

	@Override
	public List<Openclass> findOpenclass(String courseDate, String dname, String grade, String major) {
		List<Openclass> oList = OpenclassDao.selectOpenClass(courseDate, dname, grade, major);

		return oList;
	}

}
