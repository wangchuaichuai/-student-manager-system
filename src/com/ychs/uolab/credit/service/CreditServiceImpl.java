/*
 * 中北大学软件学院 版权所有.
 */
package com.ychs.uolab.credit.service;

import java.util.List;

import com.ychs.uolab.credit.dao.CreditDao;
import com.ychs.uolab.credit.dao.CreditDaoImpl;
import com.ychs.uolab.credit.vo.Credit;

/**
 * @author 王欣
 * @version 1.0
 */
public class CreditServiceImpl implements CreditService {
	private CreditDao CreditDao = new CreditDaoImpl();

	@Override
	public int addCredit(Credit credit) {
		int count = CreditDao.insertCredit(credit);
		return count;
	}

	@Override
	public List<Credit> findCredit(String stuId, String sName, String entryDate) {
		List<Credit> creditsList = CreditDao.selectCredit(stuId, sName, entryDate);
		return creditsList;
	}

}
