/*
 * 中北大学软件学院 版权所有.
 */
package com.ychs.uolab.labmember.dao;

import java.util.List;

import com.ychs.uolab.labmember.vo.Labmember;
import com.ychs.uolab.labmember.vo.Multitable;

/**
 * LabmemberDao接口，封装对成员的操作
 * 
 * @author 王欣
 * @version 1.0
 */
public interface LabmemberDao {
	/**
	 * 添加成员
	 * 
	 * @param labmember 成员对象
	 * @return 添加成功返回true，否则返回false
	 */
	public boolean insertLabmember(Labmember labmember);

	/**
	 * 删除成员
	 * 
	 * @param memberid 成员编号
	 * @return 删除成功返回1，否则返回0
	 */
	public int deleteLabmember(int memberid);

	/**
	 * 修改成员
	 * 
	 * @param labmember 成员对象
	 * @return 修改成功返回1，否则返回0
	 */
	public int updateLabmember(Labmember labmember);

	// 姓名，年级，电话，院系，专业，状态， 是否担任管理职务。
	/**
	 * 查询成员（按组合条件查询）
	 * 
	 * @param stuname    成员姓名
	 * @param grade      年级
	 * @param telephone  电话
	 * @param dname      院系名称
	 * @param majorname  专业名称
	 * @param status     状态
	 * @param campuspost 校内职务
	 * @param labjob     实验室职务
	 * @return 查询得到的集合list
	 */
	public List<Multitable> selectLabmembers(String stuname, String grade, String telephone, String dname,
			String majorname, String status, String campuspost, String labjob);

}
