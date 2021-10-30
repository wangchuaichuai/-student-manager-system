/*
 * 中北大学软件学院 版权所有.
 */
package com.ychs.uolab.labmember.service;

import java.util.List;

import com.ychs.uolab.labmember.dao.LabmemberDao;
import com.ychs.uolab.labmember.dao.LabmemberDaoImpl;
import com.ychs.uolab.labmember.vo.Labmember;
import com.ychs.uolab.labmember.vo.Multitable;

/**
 * 成员业务实现类
 * 
 * @author 王欣
 * @version 1.0
 */
public class LabmemberServiceImpl implements LabmemberService {

	private LabmemberDao LabmemberDao = new LabmemberDaoImpl();

	public boolean addLabmember(Labmember labmember) {
		boolean flag = LabmemberDao.insertLabmember(labmember);
		return flag;
	}

	@Override
	public int deletemember(int memberid) {
		int flag = LabmemberDao.deleteLabmember(memberid);
		return flag;
	}

	@Override
	public int modifyLabmember(Labmember labmember) {
		int count = LabmemberDao.updateLabmember(labmember);
		return count;
	}

	@Override
	public List<Multitable> findLabmember(String stuname, String grade, String telephone, String dname,
			String majorname, String status, String campuspost, String labjob) {
		List<Multitable> mList = LabmemberDao.selectLabmembers(stuname, grade, telephone, dname, majorname, status,
				campuspost, labjob);

		return mList;
	}

}
