/*
 * 中北大学软件学院 版权所有.
 */
package com.ychs.uolab.labmember.service;

import java.util.List;

import com.ychs.uolab.labmember.vo.Labmember;
import com.ychs.uolab.labmember.vo.Multitable;

/**
 * 成员业务接口
 * 
 * @author 王欣
 * @version 1.0
 */
public interface LabmemberService {
	/**
	 * 添加成员
	 * 
	 * @param labmember 成员对象
	 * @return 添加成功返回true，否则返回false
	 */
	public boolean addLabmember(Labmember labmember);

	/**
	 * 删除用户
	 * 
	 * @param memberid 用户编号
	 * @return 删除成功返回1，否则返回零
	 */
	public int deletemember(int memberid);

	/**
	 * 修改用户
	 * 
	 * @param labmember 用户对象
	 * @return 修改成功返回1，否则返回0
	 */
	public int modifyLabmember(Labmember labmember);

	/**
	 * 查询成员（按条件组合查询）
	 * 
	 * @param stuname    成员姓名
	 * @param grade      班级
	 * @param telephone  电话
	 * @param dname      学院名称
	 * @param majorname  专业名称
	 * @param status     状态
	 * @param campuspost 校园职务
	 * @param labjob     实验室职务
	 * @return 结果集
	 */
	public List<Multitable> findLabmember(String stuname, String grade, String telephone, String dname,
			String majorname, String status, String campuspost, String labjob);

}
